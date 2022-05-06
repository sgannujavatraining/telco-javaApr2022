package com.prgs.etelco.TelcoECommerce.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
@Entity
public class Product {
  // @Id annotation specifies the primary key of an entity.
    // @GeneratedValue provides the generation strategy specification for the primary key values.
    @Id
    @GeneratedValue
    private int id;
    
  private String name;
  private float price;
  private String description;
  private String type;
  private int rating;

  static Product instance;

  public Product() {

  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public void setPrice(float inputPrice) {
    if (price <= 0)
      throw new RuntimeException("Invalid price value");

    this.price = inputPrice;
  }

}
