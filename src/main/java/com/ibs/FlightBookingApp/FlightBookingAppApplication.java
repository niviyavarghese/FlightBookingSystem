package com.ibs.FlightBookingApp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
@EnableAutoConfiguration(exclude = {
		org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration.class
})
public class FlightBookingAppApplication {


	public static void main(String[] args) {
		SpringApplication.run(FlightBookingAppApplication.class, args);


	}



	@Bean
	public RestTemplate restTemplate() {
		final RestTemplate restTemplate = new RestTemplate();
		return restTemplate;
	}

	/*@Bean
	public FlightDTO flightDTO(){
		final FlightDTO flightDTO=new FlightDTO();
		return flightDTO;
	}

   @Bean
	public PassengerDTO passengerDTO(){
		final PassengerDTO passengerDTO=new PassengerDTO();
		return passengerDTO;
   }
*/


}
