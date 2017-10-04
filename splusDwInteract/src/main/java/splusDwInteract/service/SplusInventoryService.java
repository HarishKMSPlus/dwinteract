package splusDwInteract.service;

import java.util.List;

import splusDwInteract.model.Inventory;

/**
 * This interface gets the call from the inventory controller and it contains the business logic to get inventory details.
 * @author Nehal.Shah
 */

public interface SplusInventoryService {

	/**
	 * This method will get a list of all inventory
	 * @return list of inventory
	 */

	List<Inventory> getListOfInventory();

	/**
	 * This method will get a list by inventory id. 
	 * @param inventory id
	 * @return inventory
	 */

	Inventory getListOfInventoryById(String id);

	Inventory getListOfInventoryBystoreId(String id);
}
