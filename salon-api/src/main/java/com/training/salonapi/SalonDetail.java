package com.training.salonapi;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;

import lombok.Data;

@Data
@Configuration
public class SalonDetail {
	@Value("${SalonDetails.name}")
	private String name;

	@Value("${SalonDetails.address}")
	private String address;

	@Value("${SalonDetails.city}")
	private String city;

	@Value("${SalonDetails.state}")
	private String state;

	@Value("${SalonDetails.zipcode}")
	private String zipcode;

	@Value("${SalonDetails.phone}")
	private String phone;

	// Getters and Setters go here
}
