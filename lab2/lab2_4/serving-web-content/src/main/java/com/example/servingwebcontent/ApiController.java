package com.example.servingwebcontent;

import java.util.concurrent.atomic.AtomicLong;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ApiController {

	@GetMapping("/api/quote")
	public Quote quote(@RequestParam(value = "show", defaultValue = "World") String name) {
		return new Quote(1, "ola", "ola", "ola", true);
	}
}