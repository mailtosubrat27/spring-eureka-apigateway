package com.ms.mobile.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/mobile")
public class MobileBrandController {

	@GetMapping("/all")
	public String getAllBrand() {
		return "All Mobile Brands- Apple, Samsung, Nokia";
	}
}
