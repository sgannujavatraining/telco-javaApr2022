package com.prgs.eteco.TecoECommerce.model;

public class Product {
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
