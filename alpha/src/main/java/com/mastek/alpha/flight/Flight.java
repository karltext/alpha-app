package com.mastek.alpha.flight;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.ws.rs.FormParam;
import javax.xml.bind.annotation.XmlRootElement;

@Entity
@Table(name="FLIGHT_ENTITY_TABLE")
@XmlRootElement
public class Flight {
	
	@FormParam("flightNumber")
	int flightNumber;
	
	@FormParam("departureTime")
	String departureTime;
	
	@FormParam("length")
	double length;
	
	@FormParam("company")
	String company;
	
	@FormParam("origin")
	String origin;
	
	@FormParam("destination")
	String destination;
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY) 
	public int getFlightNumber() {
		return flightNumber;
	}
	public void setFlightNumber(int flightNumber) {
		this.flightNumber = flightNumber;
	}
	public String getDepartureTime() {
		return departureTime;
	}
	public void setDepartureTime(String departureTime) {
		this.departureTime = departureTime;
	}
	public double getLength() {
		return length;
	}
	public void setLength(double length) {
		this.length = length;
	}
	public String getCompany() {
		return company;
	}
	public void setCompany(String company) {
		this.company = company;
	}
	public String getOrigin() {
		return origin;
	}
	public void setOrigin(String origin) {
		this.origin = origin;
	}
	public String getDestination() {
		return destination;
	}
	public void setDestination(String destination) {
		this.destination = destination;
	}

}
