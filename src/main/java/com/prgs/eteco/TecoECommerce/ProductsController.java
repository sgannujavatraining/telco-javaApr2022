package com.prgs.eteco.TecoECommerce;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProductsController {
	List<Product> list;

	public ProductsController() {
		list = new ArrayList<>();

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
	}

	@GetMapping("/products") // Mapping HTTP GET method to uri "/hello"
	public List<Product> listProducts() {
		return list;
	}




	@GetMapping("/products-search")
	public List<Product> searchProducts() {

		return null;
	}

}
