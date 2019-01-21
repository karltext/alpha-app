package com.mastek.alpha.customer;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.ws.rs.FormParam;
import javax.xml.bind.annotation.XmlRootElement;

@Entity
@Table(name="Customer_ENTITY_TABLE")
@XmlRootElement
public class Customer {
	@FormParam("customerId")
	int customerId;
	@FormParam("name")
	String name;
	
	@Override
	public String toString() {
		return "Customer [customerId=" + customerId + ", name=" + name + "]";
	}
	@Id 
	@Column(name="customerId") 
	@GeneratedValue(strategy=GenerationType.IDENTITY) 
	public int getCustomerId() {
		return customerId;
	}
	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}

}
