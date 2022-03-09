



/*
package com.ibs.FlightBookingApp.service;

import static org.junit.Assert.*;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.ibs.FlightBookingApp.VO.*;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.ArgumentMatchers;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.web.client.RestTemplate;

import java.util.ArrayList;
import java.util.List;

import static org.mockito.ArgumentMatchers.anyString;
import static org.mockito.Mockito.when;
import static org.postgresql.hostchooser.HostRequirement.any;

@RunWith(MockitoJUnitRunner.class)

public class FlightSearchServiceTest {

    @InjectMocks
   private FlightSearchService flightSearchService;
    @Mock
    private RestTemplate restTemplateMock;
    @Test
    public void testSearchFlights() throws JsonProcessingException {
        OfferData offerData = arrangeOfferData();
       when(restTemplateMock.postForObject(anyString(),Mockito.any(HttpEntity.class), OfferData.class)).thenReturn(offerData);
        List<FlightsVO> flights = flightSearchService.searchFlights("LHR",
                "JFK",
               "2022-03-20");
        assertEquals("offerData", flightSearchService.executeAndGet(String request));

        //assertNotNull();

    }
   private OfferData arrangeOfferData() {

       OfferData data = new OfferData();
       OfferResponseVO responseVO = new OfferResponseVO();
        OfferVO offerVO=new OfferVO();

       Slice slice=new Slice();
        Segment segment=new Segment();
        Origin origin=new Origin();
        origin.setIcaoCode("EGLL");
       origin.setIataCityCode("LON");
       OperatingCarrier operatingCarrier=new OperatingCarrier();
       operatingCarrier.setId("arl_00009VME7DCOaPRQvNhcMw");
        operatingCarrier.setName("Icelandair");
       segment.setDepartingAt("2022-04-24T13:05:00");
        segment.setArrivingAt("2022-04-24T15:15:00");
        segment.setDuration("PT3H10M");
        segment.setOrigin(origin);
       segment.setOperatingCarrier(operatingCarrier);
        segment.setOperatingCarrierFlightNumber(null);

        List<Segment> segments=new ArrayList<>();
       segments.add(segment);

        slice.setSegments(segments);
       List<Slice> slices=new ArrayList<>();
        slices.add(slice);
        offerVO.setTotalCurrency("USD");
       offerVO.setTotalAmount("1309.14");
        offerVO.setId("off_0000AHByGuw7FPl02GD9fa");
        offerVO.setSlices(slices);

       List<OfferVO> offerVOList=new ArrayList<>();
        offerVOList.add(offerVO);
       responseVO.setOffers(offerVOList);
        data.setData(responseVO );



        return data;
   }
}



*/
