package splusDwInteract.service;

import java.util.List;
import java.util.Optional;

import splusDwInteract.model.Store;

/**
 * This interface gets the call from the store controller and it contains the business logic to get store details.
 * @author Dhiraj Bangar
 */

public interface SplusStoreService {

	/**
	 * This method will get a list of all stores
	 * @return list of stores
	 */

	public List<Store> getListOfStore();

	public List<String> getListOfString();

	/**
	 * This method will get a list by store_id.
	 * @param store id
	 * @return store
	 */
	
	public Store getListOfStoreById(String id);
}
