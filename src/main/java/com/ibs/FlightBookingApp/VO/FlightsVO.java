package com.ibs.FlightBookingApp.VO;

import javax.persistence.*;


public class FlightsVO {

    private String id;
    private String departure_airport_code;
    private String arrival_airport_code;
    private Double price;
    private String tripDuration;
    private String departure_date;
    private String departure_time;
    private String arrival_time;
    private String cabin_class;
    private String airlines;
    private String arrival_date;
    private Long pnr;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getDeparture_airport_code() {
        return departure_airport_code;
    }

    public void setDeparture_airport_code(String departure_airport_code) {
        this.departure_airport_code = departure_airport_code;
    }

    public String getArrival_airport_code() {
        return arrival_airport_code;
    }

    public void setArrival_airport_code(String arrival_airport_code) {
        this.arrival_airport_code = arrival_airport_code;
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
        this.tripDuration= tripDuration;
    }

    public String getDeparture_date() {
        return departure_date;
    }

    public void setDeparture_date(String departure_date) {
        this.departure_date = departure_date;
    }

    public String getDeparture_time() {
        return departure_time;
    }

    public void setDeparture_time(String departure_time) {
        this.departure_time = departure_time;
    }

    public String getArrival_time() {
        return arrival_time;
    }

    public void setArrival_time(String arrival_time) {
        this.arrival_time = arrival_time;
    }

    public String getCabin_class() {
        return cabin_class;
    }

    public void setCabin_class(String cabin_class) {
        this.cabin_class = cabin_class;
    }

    public String getAirlines() {
        return airlines;
    }

    public void setAirlines(String airlines) {
        this.airlines = airlines;
    }

    public String getArrival_date() {
        return arrival_date;
    }

    public void setArrival_date(String arrival_date) {
        this.arrival_date = arrival_date;
    }

    public Long getPnr() {
        return pnr;
    }

    public void setPnr(Long pnr) {
        this.pnr = pnr;
    }

    @Override
    public String toString() {
        return "FlightsVO{" +
                "id='" + id + '\'' +
                ", departure_airport_code='" + departure_airport_code + '\'' +
                ", arrival_airport_code='" + arrival_airport_code + '\'' +
                ", price=" + price +
                ", tripDuration='" + tripDuration + '\'' +
                ", departure_date='" + departure_date + '\'' +
                ", departure_time='" + departure_time + '\'' +
                ", arrival_time='" + arrival_time + '\'' +
                ", cabin_class='" + cabin_class + '\'' +
                ", airlines='" + airlines + '\'' +
                ", arrival_date='" + arrival_date + '\'' +
                '}';
    }

}