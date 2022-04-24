package com.prgs.eteco.TecoECommerce.rest;

import java.util.ArrayList;
import java.util.List;

import com.prgs.eteco.TecoECommerce.model.Product;
import com.prgs.eteco.TecoECommerce.service.ProductsService;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class ProductsController {
	ProductsService service = ProductsService.getInstance(); 

	@GetMapping("/products") 
	public List<Product> listProducts() {
		return service.getProducts();
	}

	@PostMapping("/save-product") // Mapping HTTP POST
	public String saveProducts(Product newProduct) {
		 service.saveProduct(newProduct);
		 return "success";
	}

	@GetMapping("/products-search")
	public List<Product> searchProducts() {

		return null;
	}
}