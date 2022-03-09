package com.ibs.FlightBookingApp.service;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;

import com.ibs.FlightBookingApp.VO.FlightsVO;
import com.ibs.FlightBookingApp.VO.OfferData;
import com.ibs.FlightBookingApp.mapper.FlightVOMapper;
import com.ibs.FlightBookingApp.model.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.*;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.List;
import java.util.stream.IntStream;


@Service
public class FlightSearchService {


    private final RestTemplate restTemplate;
    @Autowired
    private FlightVOMapper mapper;


    @Autowired
    public FlightSearchService( RestTemplate restTemplate) {

        this.restTemplate = restTemplate;

    }


    public List<FlightsVO> searchFlights(String departure, String arrival, String departureDate) throws JsonProcessingException {
        Data data = new Data();
        Data.Slice outbound = new Data.Slice();
        outbound.setOrigin(departure);
       // System.out.println(outbound.getOrigin());
        outbound.setDestination(arrival);
      //  System.out.println(outbound.getDestination());
        outbound.setDeparture_date(departureDate);

        data.getSlices().add(outbound);
       /* if (searchRequest.isRoundTrip()) {
            Slice inbound = new Slice();
            inbound.setOrigin(searchRequest.getDestination());
            inbound.setDestination(searchRequest.getOrigin());
            inbound.setDeparture_date(searchRequest.getReturnDate());
            data.getSlices().add(inbound);
        }*/

        IntStream.range(0, 2).mapToObj((i) -> {
            return new Data.Passenger();
        }).forEach((p) -> {
            p.setType("adult");
            data.setPassengers(List.of(p));
        });
        data.setCabinClass("economy");
        ObjectMapper obj = new ObjectMapper();
        obj.enable(SerializationFeature.WRAP_ROOT_VALUE);
       // System.out.println(data);
        OfferData offerData =  this.executeAndGet(obj.writeValueAsString(data));
        List<FlightsVO> flights = mapper.map(offerData);
        return flights;


    }


    private OfferData executeAndGet(String request) {
        return (OfferData)this.restTemplate
                .postForObject("https://api.duffel.com/air/offer_requests",
                        new HttpEntity(request, this.createHttpHeader()), OfferData.class);
    }

    private HttpHeaders createHttpHeader() {
        HttpHeaders headers = new HttpHeaders();
        headers.setContentType(MediaType.APPLICATION_JSON);
        headers.set("Duffel-Version", "beta");
        headers.setAccept(List.of(MediaType.APPLICATION_JSON));
        headers.setBearerAuth("duffel_test_ZZ-r6KsvPPHuFk-2stA6DGMym506DOTXAs-QbOsXM_3");
        return headers;
    }

    }
