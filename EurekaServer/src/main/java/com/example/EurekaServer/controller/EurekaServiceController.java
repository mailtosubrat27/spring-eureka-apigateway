package com.example.EurekaServer.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EurekaServiceController {

	@GetMapping("/eks/all")
	public String getAllBrand() {
		return "All Eureka Services.";
	}
}
