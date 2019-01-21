package com.mastek.alpha;

import javax.ws.rs.Path;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
@Path("/booking/")
public class BookingAccessAPI {
	
	BookingJPARepository repository;

	@Autowired
	public BookingJPARepository getRepository() {
		return repository;
	}

	public void setRepository(BookingJPARepository repository) {
		this.repository = repository;
	}

	
	

}
