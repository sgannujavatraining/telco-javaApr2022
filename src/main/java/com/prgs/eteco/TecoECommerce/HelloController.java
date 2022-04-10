package com.prgs.eteco.TecoECommerce;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

	@GetMapping("/")
	public String index() {
		return "Greetings from Spring Boot!";
	}

	@GetMapping("/hello") // Mapping HTTP GET method to uri "/hello"
	public String hello() {
		return "Hello World!!";
	}

}
