package splusDwInteract.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import splusDwInteract.model.Inventory;
import splusDwInteract.model.Store;

@Repository
public interface SplusInventoryRepository extends JpaRepository<Inventory, String>{

	List<Inventory> findAll();
	Inventory findOne(String id);

}
