package com.example.FlightBookingApplication.DAO;

import java.util.List;

import com.example.FlightBookingApplication.model.Booking;

public interface FlightApplicationDAO {
	List<Booking> getBookings();
	Booking getBooking();
	void save(Booking booking);
	void delete(int BookingID);
	

}
