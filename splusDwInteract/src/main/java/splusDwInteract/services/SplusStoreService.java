package splusDwInteract.services;

import java.util.List;
import java.util.Optional;

import splusDwInteract.model.Store;

public interface SplusStoreService {

	public Optional<List<Store>> getListOfStore();
	
}
