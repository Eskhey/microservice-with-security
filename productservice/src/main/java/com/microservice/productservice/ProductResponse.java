package com.microservice.productservice;

import java.math.BigDecimal;

import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class ProductResponse {

	private Long id;

	private String name;
	private String description;
	private BigDecimal price;

}
