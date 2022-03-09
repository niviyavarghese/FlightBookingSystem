package com.ibs.FlightBookingApp.repository;

import com.ibs.FlightBookingApp.VO.FlightsVO;
import com.ibs.FlightBookingApp.entity.FlightEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FlightRepository extends JpaRepository<FlightEntity,Long> {


}
