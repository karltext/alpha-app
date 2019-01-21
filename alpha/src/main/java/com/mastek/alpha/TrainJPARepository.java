package com.mastek.alpha;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Component;

@Component
public interface TrainJPARepository extends CrudRepository<Train, Integer>{

}
