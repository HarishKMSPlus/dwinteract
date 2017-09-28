/**
 * 
 */
package splusDwInteract.repositories;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import splusDwInteract.model.Store;

/**
 * @author Nehal.Shah
 *
 */

@Repository
public interface SplusStoreRepository extends JpaRepository<Store, Integer>{

	
	//method to get all the store details
	 
	List<Store> findAll();
	
	//method to get the store details of a particular store id
	
	Store findOne(int id);
	
	
}
