package com.ibs.FlightBookingApp.control;


import com.ibs.FlightBookingApp.entity.PassengerEntity;
import com.ibs.FlightBookingApp.entity.User;
import com.ibs.FlightBookingApp.repository.PassengerRepository;
import com.ibs.FlightBookingApp.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class AppController {

	@Autowired
	private UserRepository userRepo;

	@Autowired
	private PassengerRepository passengerRepo;

	@GetMapping("")
	public String viewHomePage() {
		return "home";
	}


	@GetMapping("/register")
	public String showSignUpForm(Model model) {
		model.addAttribute("user", new User());

		return "signup_form";
	}

	@PostMapping("/process_register")
	public String processRegister(User user) {
		BCryptPasswordEncoder passwordEncoder = new BCryptPasswordEncoder();
		String encodedPassword = passwordEncoder.encode(user.getPassword());
		user.setPassword(encodedPassword);
		userRepo.save(user);

		return "register_success";
	}

	@GetMapping("/flights/search")
	public String viewUsersList() {
		return "flightSearchResults";
	}

	@PostMapping("/search_process")
	public String viewSearchPage() {
		return "search";
	}

	@GetMapping("/bookingPage")
	public String viewBookingPage(Model model) {
		model.addAttribute("passenger", new PassengerEntity());
		return "bookingPage";
	}

	@GetMapping("/signout")
	public String signOut() {

		return "home";
	}
}