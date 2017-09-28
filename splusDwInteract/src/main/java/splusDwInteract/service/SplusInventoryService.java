package splusDwInteract.service;

import java.util.List;

import splusDwInteract.model.Inventory;

public interface SplusInventoryService {
	
	//method to get the list of inventory
	
	List<Inventory> getListOfInventory();
    
	//method to get a particular inventory on the basis of inventory id 	

	Inventory getListOfInventoryById(String id);
	

}
