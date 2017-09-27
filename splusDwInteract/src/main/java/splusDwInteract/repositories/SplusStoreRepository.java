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

	List<Store> findAll();
	
	Store findOne(int id);
	
	
}
