package splusDwInteract.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import splusDwInteract.model.Inventory;
/**
 * This interface has method declarations to retrieve specific data of inventory from database.
 * @author Dhiraj Bangar
 */
@Repository
public interface SplusInventoryCustomRepository extends JpaRepository<Inventory, String> {
	
	/**
	 * 
	 * @param store id
	 * @return inventory
	 */
	
	Inventory findBystoreId(String id);

}
