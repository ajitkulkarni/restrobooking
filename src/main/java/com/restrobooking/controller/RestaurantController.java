package com.restrobooking.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.restrobooking.domain.Restaurant;
import com.restrobooking.service.RestaurantService;

@Controller
public class RestaurantController {

	@Autowired
	private RestaurantService restaurantService;
	
	@RequestMapping(value="/restaurant", method=RequestMethod.GET)
	public ResponseEntity<Restaurant> getRestaurant(@RequestParam(value = "restaurantId", required = true) String restaurantId){
		Restaurant restaurant = restaurantService.getRestaurant(restaurantId);
		return new ResponseEntity<Restaurant>(restaurant, HttpStatus.OK);
	}
}
