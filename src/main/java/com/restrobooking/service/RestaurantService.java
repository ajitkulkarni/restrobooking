package com.restrobooking.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.restrobooking.domain.Restaurant;
import com.restrobooking.repository.RestaurantRepository;

@Service
public class RestaurantService {

	@Autowired
	private RestaurantRepository restaurantRepository;
	
	public void createRestaurant(Restaurant restaurant){
		restaurantRepository.save(restaurant);
	}
	
	public Restaurant getRestaurant(String name){
		return restaurantRepository.findByName(name);
	}
}
