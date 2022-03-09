package com.ibs.FlightBookingApp.mapper;


import com.ibs.FlightBookingApp.VO.*;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Component
public class FlightVOMapper {
    public List<FlightsVO> map(OfferData offerData) {
        List<FlightsVO> flights = new ArrayList<>();
        for(OfferVO offer : offerData.getData().getOffers()) {
            FlightsVO flight = new FlightsVO();
            flight.setPrice(offer.getTotalAmount()!= null? Double.parseDouble(offer.getTotalAmount()): null);
            flight.setId(offer.getId()!=null? (offer.getId()):null);
            for(Slice slice : offer.getSlices()) {
                for(Segment segment : slice.getSegments()) {
                    flight.setAirlines(segment.getOperatingCarrier() != null
                            ? segment.getOperatingCarrier().getName() : null);
                    flight.setArrival_airport_code(segment.getOrigin().getIcaoCode()!=null
                            ? segment.getOrigin().getIcaoCode() : null);
                    flight.setDeparture_airport_code(segment.getOrigin().getIataCityCode()!=null
                            ? segment.getOrigin().getIataCityCode() : null);
                    flight.setTripDuration(segment.getDuration()!=null ? segment.getDuration() : null);
                    flight.setArrival_date(segment.getArrivingAt()!=null ? segment.getArrivingAt() : null);
                    flight.setDeparture_date(segment.getDepartingAt()!=null ? segment.getDepartingAt() : null);
                    flight.setCabin_class("Economy");
                }
            }

            flights.add(flight);
        }
        return flights.stream().limit(20).collect(Collectors.toList());
    }
}
