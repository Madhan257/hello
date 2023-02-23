package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class mapicontroller {
	@GetMapping("/proj1")
	public String madhan() {
		return "Hello";
	}
}
