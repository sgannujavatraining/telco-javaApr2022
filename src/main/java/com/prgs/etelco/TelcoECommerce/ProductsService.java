package com.prgs.etelco.TelcoECommerce;

import java.util.ArrayList;
import java.util.List;

import com.prgs.etelco.TelcoECommerce.dao.ProductRepository;
import com.prgs.etelco.TelcoECommerce.model.Product;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service // can be @Component (base annotation)
public class ProductsService {

  @Autowired
  ProductRepository repository;

  public List<Product> getProducts() {
    final List<Product> products = new ArrayList<>();
	repository.findAll().forEach(p -> products.add(p));
    return products;
  }

  public void saveProduct(Product newProduct) {
    repository.save(newProduct);
  }
}
