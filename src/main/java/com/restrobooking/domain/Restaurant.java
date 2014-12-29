package com.restrobooking.domain;

import lombok.Getter;
import lombok.Setter;

import org.springframework.data.mongodb.core.mapping.Document;

@Getter
@Setter
@Document(collection = "Restaurants")
public class Restaurant extends AuditEntity{
	
	private String name;
	
	private String location;
	
	private String street;
	
	private String city;
	
	private int capacity;
	
	private int contactNumber;
	
}
