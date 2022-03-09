package com.ibs.FlightBookingApp.entity;/*
package com.ibs.FlightBookingApp.entity;

import javax.persistence.*;

@Entity
@Table(name="passengers")
public class Passenger {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
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

    @Column(columnDefinition = "text",name="travellers")
    private Integer travellers;

    @Column(columnDefinition = "text",name="adults")
    private Integer adults;

    @Column(columnDefinition = "text",name="infants")
    private Integer infants;


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

    public Integer getTravellers() {
        return travellers;
    }

    public void setTravellers(Integer travellers) {
        this.travellers = travellers;
    }

    public Integer getAdults() {
        return adults;
    }

    public void setAdults(Integer adults) {
        this.adults = adults;
    }

    public Integer getInfants() {
        return infants;
    }

    public void setInfants(Integer infants) {
        this.infants = infants;
    }

    @Override
    public String toString() {
        return "Passenger{" +
                "id=" + id +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", passportNumber=" + passportNumber +
                ", email='" + email + '\'' +
                ", address='" + address + '\'' +
                ", travellers=" + travellers +
                ", adults=" + adults +
                ", infants=" + infants +
                '}';
    }
}
*/
