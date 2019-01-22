package com.mastek.alpha.train;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.ws.rs.FormParam;
import javax.xml.bind.annotation.XmlRootElement;

@Entity
@Table(name="TRAIN_ENTITY_TABLE")
@XmlRootElement
public class Train {
	
	int trainTicketId;
	
	@FormParam("origin")
	String origin;
	@FormParam("destination")
	String destination;

	@FormParam("price")
	double price;

	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	public int getTrainTicketId() {
		return trainTicketId;
	}
	public void setTrainTicketId(int trainTicketId) {
		this.trainTicketId = trainTicketId;
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
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	
	@Override
	public String toString() {
		return "Train [origin=" + origin + ", destination=" + destination + ", trainTicketId=" 
				+ trainTicketId+ ", price=" + price + "]";
	}
			

}

