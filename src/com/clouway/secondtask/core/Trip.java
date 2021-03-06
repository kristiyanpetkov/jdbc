package com.clouway.secondtask.core;

import java.util.Date;

/**
 * Created by clouway on 16-2-24.
 */
public class Trip {
    public final String egn;
    public final Date arrival;
    public final Date departure;
    public final String city;

    public Trip(String egn, Date arrival, Date departure, String city) {
        this.egn = egn;
        this.arrival = arrival;
        this.departure = departure;
        this.city = city;

    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Trip trip = (Trip) o;

        if (egn != null ? !egn.equals(trip.egn) : trip.egn != null) return false;
        if (arrival != null ? !arrival.equals(trip.arrival) : trip.arrival != null) return false;
        if (departure != null ? !departure.equals(trip.departure) : trip.departure != null) return false;
        return !(city != null ? !city.equals(trip.city) : trip.city != null);

    }

    @Override
    public int hashCode() {
        int result = egn != null ? egn.hashCode() : 0;
        result = 31 * result + (arrival != null ? arrival.hashCode() : 0);
        result = 31 * result + (departure != null ? departure.hashCode() : 0);
        result = 31 * result + (city != null ? city.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "Trip{" +
                "egn='" + egn + '\'' +
                ", arrival=" + arrival +
                ", departure=" + departure +
                ", city='" + city + '\'' +
                '}';
    }
}
