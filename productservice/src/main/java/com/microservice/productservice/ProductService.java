package com.microservice.productservice;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;  
import org.springframework.stereotype.Service;


import lombok.extern.slf4j.Slf4j;


@Service
@Slf4j
public class ProductService {

	@Autowired
	ProductRepository productRepository;
	public void createProduct(ProductRequest productRequest) {
		log.info("Entering createProduct");
		
		Product product = new Product();
		product.setName(productRequest.getName());
		product.setDescription(productRequest.getDescription());
		product.setPrice(productRequest.getPrice());
		productRepository.save(product);
		
		log.info("exit create Product");
		log.info("product {} is save", product.getId());

		
	}
	
	public List<ProductResponse> getAllProducts(){
		List<Product> products = productRepository.findAll();
		List<ProductResponse> responses = new ArrayList<>();
		ProductResponse response = new ProductResponse();
		for(Product product : products ) {
			response.setId(product.getId());
			response.setName(product.getName());
			response.setDescription(product.getDescription());
			response.setPrice(product.getPrice());
			responses.add(response);
		}
		return responses;
	}
	
}
