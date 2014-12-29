package com.restrobooking.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.restrobooking.domain.Restaurant;

@Repository
public interface RestaurantRepository extends CrudRepository<Restaurant, String> {
	
	public Restaurant findByName(String name);
	
	public List<Restaurant> findByLocation(String location);
	
}
