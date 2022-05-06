package com.prgs.etelco.TelcoECommerce.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.prgs.etelco.TelcoECommerce.model.Product;

@Repository
public interface ProductRepository extends CrudRepository<Product, Integer>{
  
}
