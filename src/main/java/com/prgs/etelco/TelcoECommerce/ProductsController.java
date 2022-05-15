package com.prgs.etelco.TelcoECommerce;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.prgs.etelco.TelcoECommerce.model.Product;

@RestController
public class ProductsController {

	// @Autowired
	ProductsService productsService; // list

	@Autowired
	public ProductsController(ProductsService productsService) {
		this.productsService = productsService;
	}

	/*
	 * @Autowired public void setProductsController(ProductsService productsService)
	 * { this.productsService = productsService; }
	 */

	@GetMapping("/products")
	public List<Product> listProducts() {

		List<Product> list = productsService.getProducts();

		return list;
	}

	@PostMapping("/save-product")
	public String save(Product newProduct) {
		productsService.saveProduct(newProduct);
		return "success";

	}

}