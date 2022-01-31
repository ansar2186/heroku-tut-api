package com.heroku.tut.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {
	
	
	@GetMapping("/hello-api/name/{name}")
	public String helloWorld(@PathVariable String name) {
		
		
		return "Hello- " + name;
	}
	
	
	@GetMapping("/hello")
	public String hello() {
		return "Hello";
	}

}
