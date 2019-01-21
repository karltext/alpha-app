package com.mastek.alpha.flight;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Component;

@Component
public interface FlightJPARepository extends CrudRepository<Flight, Integer> {

}
