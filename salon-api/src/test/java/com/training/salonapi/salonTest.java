package com.training.salonapi;

import org.junit.jupiter.api.Test;

import com.training.salonapi.config.SalonDetail;

class salonTest {

	@Test
	public void testGetName() {
		System.out.println("testing");
		SalonDetail sd = new SalonDetail();

		System.out.println(sd.getName());
	}

}
