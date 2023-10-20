/**
 * 
 */
package com.microservice.productservice;

import org.springframework.data.jpa.repository.JpaRepository;  
import org.springframework.stereotype.Repository;




/**
 * @author qb-shahidk
 *
 */
@Repository
public interface ProductRepository extends JpaRepository<Product, Long>{

}
