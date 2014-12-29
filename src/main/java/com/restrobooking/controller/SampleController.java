package com.restrobooking.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.restrobooking.service.SampleService;

@Controller
public class SampleController {
	
	@Autowired
	private SampleService  service;
	
	@RequestMapping(value="/sample", method=RequestMethod.GET)
	public ResponseEntity<String> getHelloWorld(){
		service.createRestaurant("1234");
		return new ResponseEntity<String>("Request Success", HttpStatus.OK);
	}

}
