package splusDwInteract.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import splusDwInteract.model.Inventory;
import splusDwInteract.model.Store;

@Repository
public interface SplusInventoryRepository extends JpaRepository<Inventory, String>{

	// Retrieves all the Inventory details 
	
	List<Inventory> findAll();
	
	//Inventory detail for particular id
	
	Inventory findOne(String id);

}
