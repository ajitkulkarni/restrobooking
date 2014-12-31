package com.restrobooking.domain;

import java.util.Date;

import org.springframework.data.mongodb.core.mapping.Document;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@Document(collection = "Bookings")
public class Booking extends AuditEntity {
	private String userName;
	
	private String userEmail;
	
	private String userContact;
	
	private String restoName;
	
	private  String restoId;
	
	private Date bookingDate;
}
