package com.restrobooking.service;

import java.util.List;

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
	
	public List<Restaurant> getAllRestaurant(){
		return (List<Restaurant>) restaurantRepository.findAll();
	}
	
	public List<Restaurant> getRestaurantByLocation(String location){
		return (List<Restaurant>) restaurantRepository.findByLocation(location);
	}

	public List<Restaurant> getRestaurantByCapacity(int capacity) {
		return (List<Restaurant>) restaurantRepository.findByCapacity(capacity);
	}

	public List<Restaurant> getRestaurantByLocationAndCapacity(String location, int capacity) {
		return (List<Restaurant>) restaurantRepository.findByLocationAndCapacity(location,capacity);
	}

}
