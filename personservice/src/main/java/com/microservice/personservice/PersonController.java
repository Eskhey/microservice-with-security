/**
 * 
 */
package com.microservice.personservice;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author qb-shahidk
 *
 */
@RestController
@RequestMapping("/personservice")
public class PersonController {

	@Autowired
	PersonService personService;

	@GetMapping("/test")
	public String testPerson() {
		return personService.testPerson();
	}
	@GetMapping("/productServiceFromPerson")
	public Product[] productServiceFromPerson() {
		return personService.getProductService();
	}
	@GetMapping("/productServiceFromPersonFeign")
	public List<Product>productServiceFromPersonFeign() {
		return personService.getProductServicefeign();
	}
}
