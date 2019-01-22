package com.mastek.alpha.hotel;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.ws.rs.FormParam;
import javax.xml.bind.annotation.XmlRootElement;

@Entity
@Table(name="HOTEL_ENTITY_TABLE")
@XmlRootElement
public class Hotel {

	int hotelBookingId;
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	public int getHotelBookingId() {
		return hotelBookingId;
	}
	public void setHotelBookingId(int hotelBookingId) {
		this.hotelBookingId = hotelBookingId;
	}

	@FormParam("occupants")
	int occupants;
	@FormParam("roomsize")
	int roomSize;
	@FormParam("price")
	double price;
	
	@FormParam("location")
	String location;
	@FormParam("duration")
	int durationInDays;
	@FormParam("latecheckout")
	boolean lateCheckout;
	
	public int getOccupants() {
		return occupants;
	}
	public void setOccupants(int occupants) {
		this.occupants = occupants;
	}
	public int getRoomSize() {
		return roomSize;
	}
	public void setRoomSize(int roomSize) {
		this.roomSize = roomSize;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public int getDurationInDays() {
		return durationInDays;
	}
	public void setDurationInDays(int durationInDays) {
		this.durationInDays = durationInDays;
	}
	public boolean isLateCheckout() {
		return lateCheckout;
	}
	public void setLateCheckout(boolean lateCheckout) {
		this.lateCheckout = lateCheckout;
	}
	
	@Override
	public String toString() {
		return "Hotel [occupants=" + occupants + ", roomSize=" + roomSize + ", price=" + price + ", location="
				+ location + ", durationInDays=" + durationInDays + ", lateCheckout=" + lateCheckout + "]";
	}
	
	
}
