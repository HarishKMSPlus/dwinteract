package splusDwInteract.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import splusDwInteract.model.ProductDetail;

@Repository
public interface SplusProductDetailRepository extends JpaRepository<ProductDetail, Integer>{

	public List<ProductDetail> findAll();
	
	public ProductDetail findById(String id);
}
