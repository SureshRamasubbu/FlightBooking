package com.example.FlightBookingApplication.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.CrossOrigin;

import com.example.FlightBookingApplication.DAO.FlightApplicationDAO;
import com.example.FlightBookingApplication.model.Booking;

@Service
public class FlightBookingServiceImpl implements FlightBookingService {
	
	@Autowired
	private FlightApplicationDAO flightApplicationDAO;
	
	
	@Transactional
	@Override
	public List<Booking> getBookings() {
		return flightApplicationDAO.getBookings();
	}
	@Transactional
	@Override
	@CrossOrigin("*")
	public Booking getBooking() {
		// TODO Auto-generated method stub
		return null;
	}
	@Transactional
	@Override
	public void save(Booking booking) {
		// TODO Auto-generated method stub
		
	}
	@Transactional
	@Override
	public void delete(int BookingID) {
		// TODO Auto-generated method stub
		
	}

}
