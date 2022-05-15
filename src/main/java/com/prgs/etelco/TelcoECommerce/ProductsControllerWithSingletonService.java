package com.prgs.etelco.TelcoECommerce;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.prgs.etelco.TelcoECommerce.model.Product;

@RestController
public class ProductsControllerWithSingletonService {

	@GetMapping("/products")
	public List<Product> listProducts() {

		ProductsServiceSingleton serviceGetInstance = ProductsServiceSingleton.getInstance(); // list
		List<Product> list = serviceGetInstance.getProducts();

		return list;
	}

	@PostMapping("/save-product")
	public String save(Product newProduct) {
		ProductsServiceSingleton serviceSaveInstance = ProductsServiceSingleton.getInstance(); // list
		serviceSaveInstance.saveProduct(newProduct);
		return "success";

	}

}