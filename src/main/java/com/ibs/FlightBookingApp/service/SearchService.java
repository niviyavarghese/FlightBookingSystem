package com.ibs.FlightBookingApp.service;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import com.ibs.FlightBookingApp.control.SearchRequest;
import com.ibs.FlightBookingApp.model.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.*;
import java.util.stream.IntStream;

@Service
public class SearchService {


    @Autowired
    RestTemplate restTemplate;


    public String searchFlights(final SearchRequest searchRequest) throws JsonProcessingException {
        final Data data = new Data();
        final Data.Slice outbound = new Data.Slice();
        outbound.setOrigin(searchRequest.getOrigin());
        outbound.setDestination(searchRequest.getDestination());
        outbound.setDeparture_date(searchRequest.getDepartureDate());
        data.getSlices().add(outbound);
        if (searchRequest.isRoundTrip()) {
            Data.Slice inbound = new Data.Slice();
            inbound.setOrigin(searchRequest.getDestination());
            inbound.setDestination(searchRequest.getOrigin());
            inbound.setDeparture_date(searchRequest.getReturnDate());
            data.getSlices().add(inbound);
        }

        IntStream.range(0, 2)
                .mapToObj(i -> new Data.Passenger())
                .forEach(p -> {
                    p.setType("adult");
                    data.setPassengers(Arrays.asList(p));
                });
        data.setCabinClass("economy");

        final ObjectMapper obj = new ObjectMapper();
        obj.enable(SerializationFeature.WRAP_ROOT_VALUE);
        return executeAndGet(obj.writeValueAsString(data));
    }


    private String executeAndGet(String request) {

        return restTemplate.postForObject(
                "https://api.duffel.com/air/offer_requests?return_offers=false",
                new HttpEntity(request, createHttpHeader()),
                String.class);
    }

    private HttpHeaders createHttpHeader() {

        final HttpHeaders headers = new HttpHeaders();
        headers.setContentType(MediaType.APPLICATION_JSON);
        headers.set("Duffel-Version", "beta");
        headers.setAccept(Arrays.asList(MediaType.APPLICATION_JSON));
        headers.setBearerAuth("duffel_test_ZZ-r6KsvPPHuFk-2stA6DGMym506DOTXAs-QbOsXM_3");


        return headers;
    }

}
