package com.prgs.eteco.TecoECommerce.service;

import java.util.ArrayList;
import java.util.List;

import com.prgs.eteco.TecoECommerce.model.Product;

public class ProductsService {
  private static ProductsService instance; //x,y, webIphone, restGalaxy
  ArrayList<Product>	list ;


  // makes it a singleton
  public static ProductsService getInstance() {
    if(instance != null)
      instance = new ProductsService();

    return instance;
  }

  private public ProductsService() {
    ArrayList<Product>	list = new ArrayList<>();

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

  public List<Product> getProducts() {
    return list;
  }

  public void saveProduct(Product newProduct) {
    list.add(newProduct);
  }
}
