package splusDwInteract.service;

import java.util.List;
import java.util.Optional;

import splusDwInteract.model.Store;

public interface SplusStoreService {
	
   //method to get list of all stores
	
	public List<Store> getListOfStore();
	
	public List<String> getListOfString();
	
	//method to get store details of particular store id
	
	public Store getListOfStoreById(int id);
}
