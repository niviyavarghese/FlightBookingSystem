package com.ibs.FlightBookingApp.entity;

import com.ibs.FlightBookingApp.VO.FlightsVO;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name="passengerdetails")
public class PassengerEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id")
    private Long id;

    @Column(columnDefinition = "text", name = "first_name")
    private String firstName;

    @Column(columnDefinition = "text",name = "last_name")
    private String lastName;

    @Column(columnDefinition = "text",name="passport_number")
    private Long passportNumber;

    @Column(columnDefinition = "text",name="email")
    private String email;

    @Column(columnDefinition = "text",name="address")
    private String address;

    @OneToMany(mappedBy = "passengerEntity" ,cascade = CascadeType.ALL)
    private List<FlightEntity> flightEntity;


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Long getPassportNumber() {
        return passportNumber;
    }

    public void setPassportNumber(Long passportNumber) {
        this.passportNumber = passportNumber;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public List<FlightEntity> getFlightEntity() {
        return flightEntity;
    }

    public void setFlightEntity(List<FlightEntity> flightEntity) {
        this.flightEntity = flightEntity;
    }

    @Override
    public String toString() {
        return "PassengerEntity{" +
                "id=" + id +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", passportNumber=" + passportNumber +
                ", email='" + email + '\'' +
                ", address='" + address + '\'' +
                ", flightEntity=" + flightEntity +
                '}';
    }

    public PassengerEntity(Long id, String firstName, String lastName,
                           Long passportNumber, String email, String address) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.passportNumber = passportNumber;
        this.email = email;
        this.address = address;
    }

    public PassengerEntity() {

    }
}
