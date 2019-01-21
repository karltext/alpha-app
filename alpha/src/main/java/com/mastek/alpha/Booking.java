package com.mastek.alpha;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name="Booking_ENTITY_TABLE")
public class Booking {
	
	int bookingId;
	String bookingType;
	
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