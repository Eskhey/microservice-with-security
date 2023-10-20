package com.microservice.productservice;

import java.math.BigDecimal;

import lombok.Builder;
import lombok.Data;

@Data

public class ProductRequest {

	private String name;
	private String description;
	private BigDecimal price;
}
