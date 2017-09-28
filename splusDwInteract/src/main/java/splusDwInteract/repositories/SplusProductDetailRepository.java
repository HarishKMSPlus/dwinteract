package splusDwInteract.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import splusDwInteract.model.ProductDetail;

@Repository
public interface SplusProductDetailRepository extends JpaRepository<ProductDetail, Integer>{

	//method to get all productdetail list
	
	public List<ProductDetail> findAll();
	
	//method to get productdetail of particular product
	public ProductDetail findById(String id);
}
