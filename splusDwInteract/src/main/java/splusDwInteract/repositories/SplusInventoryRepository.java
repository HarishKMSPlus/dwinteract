package splusDwInteract.repositories;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import splusDwInteract.model.Inventory;
import splusDwInteract.model.Store;

/**
 * This interface has method declarations to retrieve specific data of inventory from database.
 * @author Nehal.Shah
 */

@Repository
public interface SplusInventoryRepository extends JpaRepository<Inventory, String> {

	/**
	 * This will return list of all the inventories.
	 */

	List<Inventory> findAll();

	/**
	 * This will get the inventory by id.
	 * @param InventoryId
	 * @return inventory
	 */

	Inventory findOne(String id);

}
