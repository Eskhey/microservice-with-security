package com.microservice.personservice;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service

public class PersonService {
	private ApiClient apiClient;

	
	public PersonService(ApiClient apiClient) {
		this.apiClient = apiClient;
	}

	
	public String testPerson() {
		return "Returned from Person.11!";
	}

	/**
	 * Using RestTemplate
	 * 
	 * @return
	 */
	public Product[] getProductService() {
		RestTemplate restTemplate = new RestTemplate();

		String resourceUrl = "http://localhost:8100/getallproducts";

		// Fetch JSON response as String wrapped in ResponseEntity
		ResponseEntity<Product[]> response = restTemplate.getForEntity(resourceUrl, Product[].class);

		Product[] productsJson = response.getBody();

		return productsJson;

	}

	/***
	 * Using feign
	 * 
	 * @return
	 */
	public List<Product> getProductServicefeign() {
		List<Product> products = apiClient.getAllProducts();

		return products;

	}
}
