package com.restrobooking.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.restrobooking.domain.Booking;

@Repository
public interface BookingRepository extends CrudRepository<Booking, String> {

	public Booking findByUserName(String userName);

}
