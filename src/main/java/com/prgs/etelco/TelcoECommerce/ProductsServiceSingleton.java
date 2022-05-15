package com.prgs.etelco.TelcoECommerce;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.prgs.etelco.TelcoECommerce.model.Product;

@Service // can be @Component (base annotation)
public class ProductsServiceSingleton {
	List<Product> list = new ArrayList();
	static ProductsServiceSingleton instance;

	private ProductsServiceSingleton() {

	}

	public List<Product> getProducts() {
		return list;
	}

	public void saveProduct(Product newProduct) {
		list.add(newProduct);
	}

	public static ProductsServiceSingleton getInstance() {
		if (instance == null)
			instance = new ProductsServiceSingleton(); // only once

		return instance;
	}
}
