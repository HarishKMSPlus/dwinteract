package splusDwInteract.service;

import java.util.List;
import java.util.Optional;

import splusDwInteract.model.Store;

public interface SplusStoreService {

	public List<Store> getListOfStore();
	
	public List<String> getListOfString();
	
	public Store getListOfStoreById(int id);
}
