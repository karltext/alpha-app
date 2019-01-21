package com.mastek.alpha;

import javax.ws.rs.BeanParam;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import javax.ws.rs.core.MediaType;

@Component
@Path("/hotel/")
public class HotelAccessAPI {

	HotelJPARepository hotelRepository;

	public HotelJPARepository getHotelRepository() {
		return hotelRepository;
	}
	
	@Autowired
	public void setHotelRepository(HotelJPARepository hotelRepository) {
		this.hotelRepository = hotelRepository;
	}

	@Path("/list/")
	@GET
	@Produces({MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML})
	public Iterable<Hotel> listHotelData(){
		return getHotelRepository().findAll();
	}
	
	
	@Path("/register")
	@POST
	@Produces({MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML})
	@Consumes({MediaType.APPLICATION_FORM_URLENCODED})
	public Hotel addHotelStay(@BeanParam Hotel newHotelRecord) {
		getHotelRepository().save(newHotelRecord);
		return newHotelRecord;	
	}
	
}

