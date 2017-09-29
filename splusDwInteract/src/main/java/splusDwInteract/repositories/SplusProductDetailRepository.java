package splusDwInteract.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import splusDwInteract.model.Inventory;
import splusDwInteract.model.ProductDetail;

/**
 * This interface has method declarations to retrieve specific data of product detail from database.
 * @author Dhiraj Bangar
 */


@Repository
public interface SplusProductDetailRepository extends JpaRepository<ProductDetail, Integer>{

	/**
	 * This will return list of all the product details
	 */
	
	public List<ProductDetail> findAll();
	
	/**
	 * This will get the productdetail by id
	 * 
	 * @param ProductdetailId
	 * @return productdetail
	 */
	
	public ProductDetail findById(String id);
}
