package com.mastek.alpha.booking;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.ws.rs.FormParam;

@Entity
@Table(name="Booking_ENTITY_TABLE")
public class Booking {
	
	int bookingId;
	@FormParam("bookingType")
	String bookingType;
	
	@Id
	@Column(name="bookingId") 
	@GeneratedValue(strategy=GenerationType.IDENTITY) 
	public int getBookingId() {
		return bookingId;
	}
	public void setBookingId(int bookingId) {
		this.bookingId = bookingId;
	}
	public String getBookingType() {
		return bookingType;
	}
	public void setBookingType(String bookingType) {
		this.bookingType = bookingType;
	}
	
	@Override
	public String toString() {
		return "Booking [bookingId=" + bookingId + ", bookingType=" + bookingType + "]";
	}
}