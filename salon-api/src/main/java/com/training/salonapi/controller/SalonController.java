package com.training.salonapi.controller;

import java.util.List;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.training.salonapi.SalonServiceDetail;
import com.training.salonapi.data.SalonServiceDetailRepository;

@RestController
@CrossOrigin(origins = "*")
class SalonController {

	private final SalonServiceDetailRepository repository;

	SalonController(SalonServiceDetailRepository repository) {
		this.repository = repository;
	}

	@GetMapping("/api/services/retrieveAvailableSalonServices")
	List<SalonServiceDetail> retrieveAvailableSalonServicesAPI() {
		return repository.findAll();
	}
}
