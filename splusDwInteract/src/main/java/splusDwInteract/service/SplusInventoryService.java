package splusDwInteract.service;

import java.util.List;

import splusDwInteract.model.Inventory;

public interface SplusInventoryService {

	List<Inventory> getListOfInventory();

	Inventory getListOfInventoryById(String id);
	

}
