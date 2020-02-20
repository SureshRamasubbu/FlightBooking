package com.example.FlightBookingApplication.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.FlightBookingApplication.Service.FlightBookingService;
import com.example.FlightBookingApplication.model.Booking;

@RestController
@RequestMapping("/Booking")
@CrossOrigin("http://localhost:4200")
public class FlightApplicationController {

		@Autowired
		private FlightBookingService flightBookingService;
		
		
		@GetMapping("/getBooking")
		public List<Booking> getBooking()
		{
			
			return flightBookingService.getBookings();
		}

}
