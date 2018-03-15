
package splusDwInteract.repositories;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import splusDwInteract.model.Store;

/**
 * This interface has method declarations to retrieve specific data of store from database.
 * @author Dhiraj Bangar
 */

@Repository
public interface SplusStoreRepository extends JpaRepository<Store, String> {

	/**
	 * This will return list of all the stores
	 */

	List<Store> findAll();

	/**
	 * This will get the store by id
	 * 
	 * @param StoreId
	 * @return store
	 */
	Store findOne(String id);
	
	List<Store> findByProductId(String id);

}
