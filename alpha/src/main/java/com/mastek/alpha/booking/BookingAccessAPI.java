package com.mastek.alpha.booking;

import javax.websocket.server.PathParam;
import javax.ws.rs.BeanParam;
import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.xml.bind.annotation.XmlRootElement;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;


@Component
@Path("/booking/")
@XmlRootElement
public class BookingAccessAPI {
	
	BookingJPARepository repository;

	@Autowired
	public BookingJPARepository getRepository() {
		return repository;
	}

	public void setRepository(BookingJPARepository repository) {
		this.repository = repository;
	}

	
	@Path("/list")
	@GET
	@Produces({MediaType.APPLICATION_JSON,MediaType.APPLICATION_XML})
	public Iterable<Booking> listBookings(){
		return getRepository().findAll();
	}
	
	@POST
	@Path("/register")
	@Produces({MediaType.APPLICATION_JSON,MediaType.APPLICATION_XML})
	@Consumes({MediaType.APPLICATION_FORM_URLENCODED})
	public Booking addBooking(@BeanParam Booking newBooking) {
		getRepository().save(newBooking);
		return newBooking;
	}
	
	@DELETE
	@Path("/delete")
	@Produces({MediaType.APPLICATION_JSON,MediaType.APPLICATION_XML})
	public Booking deleteBooking(int bookingTicketId) {
		Booking deleteBooking = getRepository().findById(bookingTicketId).get();
		System.out.println(deleteBooking);
		getRepository().delete(deleteBooking);
		return deleteBooking;
	}

}
