package com.ibs.FlightBookingApp.entity;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;

@Entity
@Table(name="flightdetails")
public class FlightEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long flightid;


    @Column(name="pnr_number")
    @GenericGenerator(name="pnrGenerator",strategy="increment")
    @GeneratedValue(generator="pnrGenerator",strategy=GenerationType.AUTO)
    private Long pnr;

    @ManyToOne
    @JoinColumn(name="id")
    private PassengerEntity passengerEntity;

    @Column(name = "airlines")
    private String airlines;

    @Column(name="departure_date")
    private String departure_date;

    @Column(name="arrival_date")
    private String arrival_date;

    @Column(name="price")
    private Double price;

    @Column(name="tripDuration")
    private String tripDuration;

    public Long getFlightid() {
        return flightid;
    }

    public void setFlightid(Long flightid) {
        this.flightid = flightid;
    }

    public PassengerEntity getPassengerEntity() {
        return passengerEntity;
    }

    public void setPassengerEntity(PassengerEntity passengerEntity) {
        this.passengerEntity = passengerEntity;
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

    @Override
    public String toString() {
        return "FlightEntity{" +
                "flightid=" + flightid +
                ", passengerEntity=" + passengerEntity +
                ", airlines='" + airlines + '\'' +
                ", departure_date='" + departure_date + '\'' +
                ", arrival_date='" + arrival_date + '\'' +
                ", price=" + price +
                ", tripDuration='" + tripDuration + '\'' +
                '}';
    }

    public FlightEntity(Long pnr,String airlines, String departure_date, String arrival_date, Double price, String tripDuration) {
        this.pnr=pnr;
        this.airlines = airlines;
        this.departure_date = departure_date;
        this.arrival_date = arrival_date;
        this.price = price;
        this.tripDuration = tripDuration;
    }

    public FlightEntity(Long flightid, PassengerEntity passengerEntity) {
        this.flightid = flightid;
        this.passengerEntity = passengerEntity;
    }

    public FlightEntity(Long flightid, PassengerEntity passengerEntity, String airlines, String departure_date,
                        String arrival_date, Double price, String tripDuration) {
        this.flightid = flightid;
        this.passengerEntity = passengerEntity;
        this.airlines = airlines;
        this.departure_date = departure_date;
        this.arrival_date = arrival_date;
        this.price = price;
        this.tripDuration = tripDuration;
    }
    public FlightEntity(){

    }

    public FlightEntity(Long flightid, Long pnr, PassengerEntity passengerEntity,
                        String airlines, String departure_date, String arrival_date, Double price, String tripDuration) {
        this.flightid = flightid;
        this.pnr = pnr;
        this.passengerEntity = passengerEntity;
        this.airlines = airlines;
        this.departure_date = departure_date;
        this.arrival_date = arrival_date;
        this.price = price;
        this.tripDuration = tripDuration;
    }
}
