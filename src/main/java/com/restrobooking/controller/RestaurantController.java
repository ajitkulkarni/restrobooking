package com.restrobooking.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.restrobooking.domain.Restaurant;
import com.restrobooking.service.RestaurantService;

@Controller
public class RestaurantController {

	@Autowired
	private RestaurantService restaurantService;
	
	@RequestMapping(value="/restaurant", method=RequestMethod.POST)
	public ResponseEntity<String> createRestaurant(@RequestBody Restaurant restaurant){
		restaurantService.createRestaurant(restaurant);
		return new ResponseEntity<String>("Restaurant Created", HttpStatus.OK);
	}
	
	@RequestMapping(value="/restaurant/find-all", method=RequestMethod.GET)
	public ResponseEntity<List<Restaurant>> getAllRestaurants(){
		return new ResponseEntity<List<Restaurant>>(restaurantService.getAllRestaurant(), HttpStatus.OK);
	}
	
	@RequestMapping(value="/restaurant", method=RequestMethod.GET)
	public ResponseEntity<List<Restaurant>> getRestaurantsByLocation(@RequestParam(value = "location", required = true) String location){
		List<Restaurant> restaurants = restaurantService.getRestaurantByLocation(location);
		return new ResponseEntity<List<Restaurant>>(restaurants, HttpStatus.OK);
	}
}
