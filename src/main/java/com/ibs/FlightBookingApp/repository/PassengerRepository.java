package com.ibs.FlightBookingApp.repository;


import com.ibs.FlightBookingApp.entity.PassengerEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


public interface PassengerRepository extends JpaRepository<PassengerEntity,Long> {

}
