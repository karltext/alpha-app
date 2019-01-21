package com.mastek.alpha;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Component;

@Component
public interface HotelJPARepository extends CrudRepository<Hotel, Integer>{

}
