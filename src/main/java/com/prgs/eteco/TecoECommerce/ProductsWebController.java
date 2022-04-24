package com.prgs.eteco.TecoECommerce;
import java.util.List;

import com.prgs.eteco.TecoECommerce.service.ProductsService;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import com.prgs.eteco.TecoECommerce.model.Product;

@Controller
public class ProductsWebController {

	ProductsService service = ProductsService.getInstance();  

 
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