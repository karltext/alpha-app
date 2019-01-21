package com.mastek.alpha;

import org.glassfish.jersey.server.ResourceConfig;

public class ServiceConfig extends ResourceConfig {
	
	public ServiceConfig() {
		register(BookingAccessAPI.class);
//		register(FlightAccessAPI.class);
//		register(AccountAccessAPI.class);
//		register(HotelAccessAPI.class);
//		register(TrainAccessAPI.class);
//		register(CustomerAccessAPI.class);
	}

}
