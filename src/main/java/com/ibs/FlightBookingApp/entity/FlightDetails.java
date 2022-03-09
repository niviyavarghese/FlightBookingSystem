package com.ibs.FlightBookingApp.entity;

import java.util.List;

public class FlightDetails {
    private Long flightid;
    private String airlines;
    private String departure_date;
    private String arrival_date;
    private Double price;
    private String tripDuration;
    private Long pnr;

    public Long getFlightid() {
        return flightid;
    }

    public void setFlightid(Long flightid) {
        this.flightid = flightid;
    }

    public String getAirlines() {
        return airlines;
    }

    public void setAirlines(String airlines) {
        this.airlines = airlines;
    }

    public String getDeparture_date() {
        return departure_date;
    }

    public void setDeparture_date(String departure_date) {
        this.departure_date = departure_date;
    }

    public String getArrival_date() {
        return arrival_date;
    }

    public void setArrival_date(String arrival_date) {
        this.arrival_date = arrival_date;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public String getTripDuration() {
        return tripDuration;
    }

    public void setTripDuration(String tripDuration) {
        this.tripDuration = tripDuration;
    }

    public Long getPnr() {
        return pnr;
    }

    public void setPnr(Long pnr) {
        this.pnr = pnr;
    }

    public FlightDetails(Long flightid, String airlines, String departure_date,
                         String arrival_date, Double price, String tripDuration,Long pnr) {
        this.flightid = flightid;
        this.airlines = airlines;
        this.departure_date = departure_date;
        this.arrival_date = arrival_date;
        this.price = price;
        this.tripDuration = tripDuration;
        this.pnr=pnr;
    }

    @Override
    public String toString() {
        return "FlightDetails{" +
                "flightid=" + flightid +
                ", airlines='" + airlines + '\'' +
                ", departure_date='" + departure_date + '\'' +
                ", arrival_date='" + arrival_date + '\'' +
                ", price=" + price +
                ", tripDuration='" + tripDuration + '\'' +
                '}';
    }

   /* public FlightDetails(Long flightid, String airlines,
                         String departure_date, String arrival_date, Double price, String tripDuration, Long pnr) {
        this.flightid = flightid;
        this.airlines = airlines;
        this.departure_date = departure_date;
        this.arrival_date = arrival_date;
        this.price = price;
        this.tripDuration = tripDuration;
        this.pnr = pnr;
    }*/
}
