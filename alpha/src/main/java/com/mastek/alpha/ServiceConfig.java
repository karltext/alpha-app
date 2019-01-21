package com.mastek.alpha;

import org.glassfish.jersey.server.ResourceConfig;


public class ServiceConfig extends ResourceConfig {
	
	
//		register(CustomerAccessAPI.class);


	public ServiceConfig() {
		register(BookingAccessAPI.class);
		register(TrainAccessAPI.class);
		register(CustomerAccessAPI.class);
		register(FlightAccessAPI.class);	
	}

}
