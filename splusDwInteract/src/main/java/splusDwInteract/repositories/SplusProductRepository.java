/**
 * 
 */
package splusDwInteract.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import splusDwInteract.model.Product;

/**
 * @author Nehal.Shah
 *
 */
@Repository
public interface SplusProductRepository extends JpaRepository<Product, String>{

	//method to get all the product details
	
	List<Product> findAll();
	
	//method to get the product details of particular product id
	
	Product findOne(String i);

}
