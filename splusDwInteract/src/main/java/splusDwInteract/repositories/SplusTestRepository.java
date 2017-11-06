package splusDwInteract.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import splusDwInteract.model.Test;

@Repository
public interface SplusTestRepository extends JpaRepository<Test, String>{

	//Test findOne(String id);
	
	List<Test> getStore(String id);	
	
}
