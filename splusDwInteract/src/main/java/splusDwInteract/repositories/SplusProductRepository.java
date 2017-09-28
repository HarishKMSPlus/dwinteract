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
public interface SplusProductRepository extends JpaRepository<Product, Integer>{

	List<Product> findAll();
	
	//Product findById(String id);

}
