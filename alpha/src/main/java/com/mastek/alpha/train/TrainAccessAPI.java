package com.mastek.alpha.train;

import javax.ws.rs.BeanParam;
import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;


@Component
@Path("/trains/")
public class TrainAccessAPI {
	
	TrainJPARepository trainRepository;

	public TrainJPARepository getTrainRepository() {
		return trainRepository;
	}

	@Autowired
	public void setTrainRepository(TrainJPARepository repository) {
		this.trainRepository = repository;
	}
	
	@Path("/list")
	@GET
	@Produces({MediaType.APPLICATION_JSON,MediaType.APPLICATION_XML})
	public Iterable<Train> listTrains(){
		return getTrainRepository().findAll();
		}
	
	@POST
	@Path("/register")
	@Produces({MediaType.APPLICATION_JSON,MediaType.APPLICATION_XML})
	@Consumes({MediaType.APPLICATION_FORM_URLENCODED})
	public Train addTrain(@BeanParam Train newTrain) {
		getTrainRepository().save(newTrain);
		return newTrain;
	}
	
	@DELETE
	@Path("/delete")
	@Produces({MediaType.APPLICATION_JSON,MediaType.APPLICATION_XML})
	public Train deleteTrain(int trainTicketId) {
		Train deleteTrain = getTrainRepository().findById(trainTicketId).get();
		System.out.println(deleteTrain);
		getTrainRepository().delete(deleteTrain);
		return deleteTrain;
	}
	
	
}
