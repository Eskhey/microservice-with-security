/**
 * 
 */
package com.microservice.productservice;

import java.io.Serializable;
import java.math.BigDecimal;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author qb-shahidk
 *
 */

@NoArgsConstructor
@Data
@Entity
public class Product implements Serializable{

    private static final long serialVersionUID = 1L; // Specify a version UID to avoid compatibility issues

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String name;
	private String description;
	private BigDecimal price;
}
