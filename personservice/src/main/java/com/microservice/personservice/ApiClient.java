package com.microservice.personservice;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(value = "productservice", url = "http://localhost:8100")
public interface ApiClient {
	@GetMapping(value = "/getallproducts")
	List<Product> getAllProducts();

}