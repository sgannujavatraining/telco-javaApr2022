package com.prgs.etelco.TelcoECommerce;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import com.prgs.etelco.TelcoECommerce.dao.ProductRepository;
import com.prgs.etelco.TelcoECommerce.model.Product;

import org.apache.hc.client5.http.classic.methods.HttpGet;
import org.apache.hc.client5.http.impl.classic.CloseableHttpClient;
import org.apache.hc.client5.http.impl.classic.CloseableHttpResponse;
import org.apache.hc.client5.http.impl.classic.HttpClientBuilder;
import org.apache.hc.core5.http.HttpEntity;
import org.apache.hc.core5.http.HttpStatus;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service // can be @Component (base annotation)
public class ProductsService {

	@Autowired
	ProductRepository repository;
	static final String OTHER_REST_API_FOR_PRODUCTS = "http://localhost:8081/list-products";

	public List<Product> getProducts() {
		final List<Product> products = new ArrayList<>();
		repository.findAll().forEach(p -> products.add(p));
		return products;
	}

	public void saveProduct(Product newProduct) {
		repository.save(newProduct);
	}

	public HttpEntity getProductsFromExternalRestAPI() {
		try {
			CloseableHttpClient restProductsClient = HttpClientBuilder.create().build();
			CloseableHttpResponse productsResponse = restProductsClient.execute(new HttpGet(OTHER_REST_API_FOR_PRODUCTS));
		    int statusCode = productsResponse.getCode();
		    
		    if(statusCode == HttpStatus.SC_OK) {
		    	return productsResponse.getEntity();
		    }

		} catch (IOException e) {
			e.printStackTrace();
		}
		return null;
	}
	
	public Product getProductsFromExternalRestAPIUsingSpringRestTemplate() {
		RestTemplate restTemplate = new RestTemplate();
		Product product = restTemplate.getForObject(OTHER_REST_API_FOR_PRODUCTS, Product.class);
		return product;
	}
}
