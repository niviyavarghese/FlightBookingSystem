package com.ibs.FlightBookingApp.control;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.ibs.FlightBookingApp.service.SearchService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;


@RestController
public class SearchController {

    @Autowired
    SearchService searchService;


    @RequestMapping(path = "/search/flights" , method = RequestMethod.POST,
            produces = MediaType.APPLICATION_XML_VALUE,
            consumes = MediaType.APPLICATION_XML_VALUE )
    public @ResponseBody  String searchForFlights(@RequestBody SearchRequest searchRequest ) throws JsonProcessingException {


        return searchService.searchFlights(searchRequest);

    }

}
