
package splusDwInteract.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import splusDwInteract.model.Product;

/**
 * This interface has method declarations to retrieve specific data of product from database.
 * @author Nehal.Shah
 */

@Repository
public interface SplusProductRepository extends JpaRepository<Product, String>{

	/**
	 * This will return list of all the products
	 */
	
	List<Product> findAll();
	
	/**
	 * This will get the product by id
	 * 
	 * @param ProductId
	 * @return product
	 */
	
	Product findOne(String i);

}
