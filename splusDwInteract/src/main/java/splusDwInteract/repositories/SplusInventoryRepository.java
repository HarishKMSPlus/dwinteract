package splusDwInteract.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import splusDwInteract.model.Inventory;

@Repository
public interface SplusInventoryRepository extends JpaRepository<Inventory, Integer>{

	List<Inventory> findAll();

}
