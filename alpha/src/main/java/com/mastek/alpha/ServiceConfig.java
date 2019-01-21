package com.mastek.alpha;

import org.glassfish.jersey.server.ResourceConfig;

import com.mastek.alpha.booking.BookingAccessAPI;
import com.mastek.alpha.customer.CustomerAccessAPI;
import com.mastek.alpha.flight.FlightAccessAPI;
import com.mastek.alpha.train.TrainAccessAPI;

public class ServiceConfig extends ResourceConfig {
	
	public ServiceConfig() {
		register(BookingAccessAPI.class);
		register(TrainAccessAPI.class);
		register(CustomerAccessAPI.class);
		register(FlightAccessAPI.class);	
	}

}
