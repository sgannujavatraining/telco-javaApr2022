package com.prgs.eteco.TecoECommerce;

import com.prgs.eteco.TecoECommerce.model.Product;

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

		Product p = new Product();
		p.setPrice(0);

		return "Hello World!!";
	}

}
