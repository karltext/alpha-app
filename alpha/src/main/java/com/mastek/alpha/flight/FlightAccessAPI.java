package com.mastek.alpha.flight;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Set;

import javax.transaction.Transactional;
import javax.ws.rs.BeanParam;
import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.FormParam;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.springframework.stereotype.Component;

@Component
@Path("/flights/")
public class FlightAccessAPI {
	
	FlightJPARepository repository;

	public FlightJPARepository getRepository() {
		return repository;
	}

	public void setRepository(FlightJPARepository repository) {
		this.repository = repository;
	}

	public FlightAccessAPI(FlightJPARepository repository) {
		this.repository = repository;
	}
	
	// http://localhost:9900/employees/list
	@Path("/list")
	@GET
	@Produces({MediaType.APPLICATION_JSON,MediaType.APPLICATION_XML})
	public Iterable<Flight> listFlights(){
		return getRepository().findAll();
	}
	
	@POST
	@Path("/register")
	@Produces({MediaType.APPLICATION_JSON,MediaType.APPLICATION_XML})
	@Consumes({MediaType.APPLICATION_FORM_URLENCODED})
	public Flight addFlight(@BeanParam Flight newFlight) {
		getRepository().save(newFlight);
		return newFlight;
	}
	
	@DELETE
	@Path("/delete")
	@Produces({MediaType.APPLICATION_JSON,MediaType.APPLICATION_XML})
	public Flight deleteFlight(int id) {
		Flight deleteFlight = getRepository().findById(id).get();
		getRepository().delete(deleteFlight);
		return deleteFlight;
	}

	
	

}
