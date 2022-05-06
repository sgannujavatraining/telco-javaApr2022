package com.prgs.etelco.TelcoECommerce;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.prgs.etelco.TelcoECommerce.model.Product;

@Controller
public class ProductsWebController {

	@Autowired
	ProductsService service;

 
 @RequestMapping("/view-products")
 public ModelAndView getProducts() {
 
  // getLIst of products
  // set list of products as model
  // return new ModelAndView("hello", "message", helloWorldMessage);
  List<Product> productsList = service.getProducts();
  return new ModelAndView("productsView", "productsModel", productsList);
 }
 @RequestMapping("/save-products")
 public ModelAndView saveProducts(Product newProduct) {
 
  // getLIst of products
  // set list of products as model
  // return new ModelAndView("hello", "message", helloWorldMessage);
  service.saveProduct(newProduct);
  List<Product> productsList = service.getProducts();
  return new ModelAndView("productsView", "productsModel", productsList);
 }

}