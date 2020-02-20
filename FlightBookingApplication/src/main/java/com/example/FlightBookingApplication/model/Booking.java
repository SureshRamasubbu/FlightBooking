package com.example.FlightBookingApplication.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;



@Entity
@Table(name="booking_table")

public class Booking {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column//(name="BookingID")	
	private int BookingID;
	@Column//(name="BookingDate")
	private Date BookingDate;
	@Column//(name="FirstName")
	private String FirstName;
	@Column//(name="LastName")
	private String LastName;
	@Column//(name="BookingReference")
	private String BookingReference;
	@Column//(name="DOB")
	private Date DOB;	
	@Column//(name="FlightID")
	private int FlightID;
	@Column//(name="PassportNumber")
	private String PassportNumber;
	@Column//(name="ExpiryDate")
	private Date ExpiryDate;
	
	
	
	@Override
	public String toString() {
		return "Booking [BookingID=" + BookingID + ", BookingDate=" + BookingDate + ", FirstName=" + FirstName
				+ ", LastName=" + LastName + ", BookingReference=" + BookingReference + ", DOB=" + DOB + ", FlightID="
				+ FlightID + ", PassportNumber=" + PassportNumber + ", ExpiryDate=" + ExpiryDate + "]";
	}
	public int getBookingID() {
		return BookingID;
	}
	public void setBookingID(int bookingID) {
		BookingID = bookingID;
	}
	public Date getBookingDate() {
		return BookingDate;
	}
	public void setBookingDate(Date bookingDate) {
		BookingDate = bookingDate;
	}
	public String getFirstName() {
		return FirstName;
	}
	public void setFirstName(String firstName) {
		FirstName = firstName;
	}
	public String getLastName() {
		return LastName;
	}
	public void setLastName(String lastName) {
		LastName = lastName;
	}
	public String getBookingReference() {
		return BookingReference;
	}
	public void setBookingReference(String bookingReference) {
		BookingReference = bookingReference;
	}
	public Date getDOB() {
		return DOB;
	}
	public void setDOB(Date dOB) {
		DOB = dOB;
	}
	public int getFlightID() {
		return FlightID;
	}
	public void setFlightID(int flightID) {
		FlightID = flightID;
	}
	public String getPassportNumber() {
		return PassportNumber;
	}
	public void setPassportNumber(String passportNumber) {
		PassportNumber = passportNumber;
	}
	public Date getExpiryDate() {
		return ExpiryDate;
	}
	public void setExpiryDate(Date expiryDate) {
		ExpiryDate = expiryDate;
	}
	
}
