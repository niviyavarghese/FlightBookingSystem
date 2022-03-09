package com.ibs.FlightBookingApp.control;


import com.fasterxml.jackson.core.JsonProcessingException;

import com.ibs.FlightBookingApp.VO.*;

import com.ibs.FlightBookingApp.entity.FlightDetails;
import com.ibs.FlightBookingApp.entity.FlightEntity;
import com.ibs.FlightBookingApp.entity.PassengerEntity;
import com.ibs.FlightBookingApp.repository.FlightRepository;
import com.ibs.FlightBookingApp.dao.FlightDao;
import com.ibs.FlightBookingApp.repository.PassengerRepository;
import com.ibs.FlightBookingApp.service.FlightSearchService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import javax.sql.DataSource;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;

@Controller

public class FlightSearchController {
    @Autowired
    private PassengerRepository passengerRepo;
    private JdbcTemplate jdbcTemp;
    @Autowired
    private FlightRepository flightRepo;

    private FlightSearchService flightSearchService;
    public List<FlightsVO> flights;
    public List<FlightsVO> newflights;

    public PassengerEntity passenger;

    List<FlightDetails> flightDetails=new ArrayList<>();

    private static final Logger LOGGER= LoggerFactory.getLogger(FlightSearchController.class);

    long pnrnumber;
    int min = 4000;
    int max = 8000;
    @Autowired
    public FlightSearchController(FlightSearchService flightSearchService,DataSource dataSource) {
        this.flightSearchService = flightSearchService;
        jdbcTemp = new JdbcTemplate(dataSource);
    }
   // public FlightEntity[] flightEntity;

    @RequestMapping(path = "/flights/search",method = RequestMethod.POST)
    public String searchForFlights(@RequestParam(defaultValue = "default") String departure,
                            @RequestParam(defaultValue = "default") String arrival,
                            @RequestParam(defaultValue = "default") String departureDate,

                            Model model) throws JsonProcessingException {

        flights = flightSearchService.searchFlights(departure, arrival, departureDate);

        model.addAttribute("searchFlightResults",flights);

        return "flightSearchResults";
    }
    @RequestMapping(path="/viewPage")
    public String viewFlights(Model model,String id){
        newflights=flights.stream().filter(item->item.getId().equals(id)).collect(Collectors.toList());
        model.addAttribute("searchFlightResults",newflights);
        //System.out.println(newflights);
        return "viewPage";
    }
    @PostMapping("/bookingResult")
    public String bookRegister(PassengerEntity passenger, Model model, FlightEntity flightEntity) throws ClassNotFoundException, SQLException {
        List<PassengerEntity> passengerlist=new ArrayList<PassengerEntity>();
        passengerlist.add(passenger);


      //  flightRepo.save( convertToEntity(newflights.get(0), passenger));
        FlightDao flightDao=new FlightDao();
        System.out.println(passenger.getEmail());
       PassengerEntity checkemail= flightDao.CheckEmailExists(passenger.getEmail());

       if(checkemail==null)
          passengerRepo.save(passenger);
        else
          passenger=checkemail;


        long id=0;
        id=passenger.getId();
        System.out.println(id);
       flightDetails=flightDao.getAllFlights(id);
      // System.out.println(flightDetails);

        flightEntity=convertToEntity(newflights.get(0), passenger);
        List<FlightEntity> flightentities=new ArrayList<>();



        flightentities.add(flightEntity);
        System.out.println(flightentities);

        passenger.setFlightEntity(flightentities);
        flightRepo.save(flightEntity);
        //passengerRepo.save(passenger);
        model.addAttribute("passengerid",passengerlist);
        model.addAttribute("flightdetails",flightentities);
        return "bookingResult";
    }

    private FlightEntity convertToEntity(FlightsVO flightsVO, PassengerEntity passenger){
        Random random = new Random();

        pnrnumber=(int)(Math.random()*(max-min+1)+min);
        String str=flightsVO.getTripDuration();
        String str1=str.substring(2);
        String str2=str1.replace("H"," Hours ");
        String duration=str2.replace("M"," Minutes ");
        System.out.println(duration);
        FlightEntity flightEntity=new FlightEntity(pnrnumber,flightsVO.getAirlines(),flightsVO.getDeparture_date(),
                flightsVO.getArrival_date(),flightsVO.getPrice(),duration);
        pnrnumber++;
        flightsVO.setPnr(pnrnumber);

          flightEntity.setPassengerEntity(passenger);
          return flightEntity;
    }

    @GetMapping("/viewMyBooking")
    public String viewMyBooking(Model model) {
        model.addAttribute("flightdetails",flightDetails);
        return "viewMyBooking";
    }


}

