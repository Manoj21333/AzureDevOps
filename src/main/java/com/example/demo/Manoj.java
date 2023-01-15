package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


	@RestController
	public class Manoj {
		
	@GetMapping("/hi")
	public String home() {
		return "hello deepak";
	}
	}


