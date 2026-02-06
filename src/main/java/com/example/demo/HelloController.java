package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

	@GetMapping("/hello")
	public String hello() {
		return "Hello from Spring Boot JAR CI/CD Demo!";
	}
	@GetMapping("/")
	public String welcome() {
		return "Welcome to Spring Boot JAR CI/CD Demo!";
	}
}
