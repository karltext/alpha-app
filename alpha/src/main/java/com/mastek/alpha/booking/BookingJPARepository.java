package com.mastek.alpha.booking;

import org.springframework.data.repository.CrudRepository;

public interface BookingJPARepository extends CrudRepository<Booking, Integer> {
}
