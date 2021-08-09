package com.training.salonapi.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Data
@Configuration
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
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

	@Override
	public SalonDetail clone() {

		SalonDetail salonDetails = new SalonDetail();
		salonDetails.address = address;
		salonDetails.city = city;
		salonDetails.state = state;
		salonDetails.zipcode = zipcode;
		salonDetails.phone = phone;
		salonDetails.name = name;
		return salonDetails;
	}
}
