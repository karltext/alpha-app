package com.mastek.alpha.hotel;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Component;

@Component
public interface HotelJPARepository extends CrudRepository<Hotel, Integer>{

}
