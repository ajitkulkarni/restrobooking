package com.restrobooking.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.restrobooking.domain.Restaurant;

@Repository
public interface RestaurantRepository extends MongoRepository<Restaurant, String> {
	
	public Restaurant findByName(String name);

}
