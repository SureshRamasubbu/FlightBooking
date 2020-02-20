package com.example.FlightBookingApplication.Service;

import java.util.List;

import org.springframework.web.bind.annotation.CrossOrigin;

import com.example.FlightBookingApplication.model.Booking;

@CrossOrigin("http://localhost:4200")
public interface FlightBookingService {
	List<Booking> getBookings();
	Booking getBooking();
	void save(Booking booking);
	void delete(int BookingID);	
	

}
