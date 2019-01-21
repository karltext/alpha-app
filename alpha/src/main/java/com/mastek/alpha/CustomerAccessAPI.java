package com.mastek.alpha;

import javax.ws.rs.BeanParam;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;


@Component
@Path("/customers/")
public class CustomerAccessAPI {
	
	CustomerJPARepository repository;

	public CustomerJPARepository getRepository() {
		return repository;
	}
	@Autowired
	public void setRepository(CustomerJPARepository repository) {
		this.repository = repository;
	}
	@Path("/list") 
	@GET
	@Produces({MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML})
	public Iterable<Customer> listCustomers(){
		return getRepository().findAll();
	}
	@POST
	@Path("/register") 
	@Produces({MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML})
	@Consumes({MediaType.APPLICATION_FORM_URLENCODED})
	public Customer addCustomer(@BeanParam Customer newCustomer) {
		getRepository().save(newCustomer);
		return newCustomer;
	}
	
	
	
	
	

}
