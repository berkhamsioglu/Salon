package com.training.salonapi;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class SalonApiApplicationTests {

	@Value("${SalonDetails.name}")
	private String name;

	@Value("${SalonDetails.state}")
	private String state;

	@Test
	void contextLoads() {
		System.out.println("testing");
		assertEquals("AR Salon and Day Spa Services", name);
		assertEquals("ND", state);

		System.out.println(name);
	}

	// @Test
	// void contextLoads() {
	// System.out.println("testing");
	// SalonDetail sd = new SalonDetail();
	//
	// System.out.println(sd.getName());
	// }

}
