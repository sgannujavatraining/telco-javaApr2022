package com.prgs.eteco.TecoECommerce;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProductsController {

	@GetMapping("/products") // Mapping HTTP GET method to uri "/hello"
	public List<Product> listProducts() {
		List<Product> list = new ArrayList<>();

		Product product1 = new Product();
		product1.setName("iPhone 10");
		list.add(product1);

		Product product2 = new Product();
		product2.setName("iPhone 11");
		list.add(product2);

		Product product3 = new Product();
		product3.setName("iPhone 11 Pro Max");
		list.add(product3);

		Product product4 = new Product();
		product4.setName("Samsung Galaxy");
		list.add(product4);
		return list;
	}

}
