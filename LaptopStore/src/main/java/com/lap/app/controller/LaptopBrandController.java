package com.lap.app.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/laptop")
public class LaptopBrandController {

	@GetMapping("/all-laptops")
	public String getAllLaptop() {
		return "All laptop brands- Apple, Samsung, Hp";
	}
}
