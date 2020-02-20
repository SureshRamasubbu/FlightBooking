package com.example.FlightBookingApplication.DAO;

import java.util.List;

import javax.persistence.EntityManager;

import org.hibernate.query.Query;
import org.hibernate.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.CrossOrigin;

import com.example.FlightBookingApplication.model.Booking;

@Repository
@CrossOrigin("http://localhost:4200")
public class FlightApplicationADAOImpl implements FlightApplicationDAO {
	
	@Autowired
	private EntityManager entityManager;
	
	@Override
	public List<Booking> getBookings() {
		Session currentSession = entityManager.unwrap(Session.class);
		Query<Booking> query= currentSession.createQuery("from Booking", Booking.class);
		System.out.println("ENTERS before ERROR");
		List<Booking> booking= query.getResultList();
		return booking;
	}

	@Override
	public Booking getBooking() {
		
		return null;
	}

	@Override
	public void save(Booking booking) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete(int BookingID) {
		// TODO Auto-generated method stub
		
	}

}
