package com.prgs.etleco.TelcoECommerce.model.service;

import java.util.ArrayList;
import java.util.List;

import com.prgs.eteco.TecoECommerce.dao.ProductRepository;
import com.prgs.eteco.TecoECommerce.model.Product;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service // can be @Component (base annotation)
public class ProductsService {

  @Autowired
  ProductRepository repository;

  public List<Product> getProducts() {
    final List<Product> products = new ArrayList<>();
    repository.findAll().forEach(student -> students.add(student));
    return products;
  }

  public void saveProduct(Product newProduct) {
    repository.save(newProduct);
  }
}
