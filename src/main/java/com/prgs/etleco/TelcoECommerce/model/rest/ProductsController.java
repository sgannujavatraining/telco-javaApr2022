package com.prgs.etleco.TelcoECommerce.model.rest;

import java.util.ArrayList;
import java.util.List;

import com.prgs.eteco.TecoECommerce.model.Product;
import com.prgs.eteco.TecoECommerce.service.ProductsService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class ProductsController {

	// @Autowired - another way of autowiring but not preferred.
	ProductsService service; 

	@Autowired
	public ProductsController(ProductsService service)	{
		this.service = service;
	}

	/*
	@Autowired
	public void setService(ProductsService service)	{
		this.service = service;
	}*/

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