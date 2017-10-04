package splusDwInteract.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import splusDwInteract.model.ProductDetail;

/**
This interface has method declarations to retrieve specific data of productdetail from database.
*/

@Repository
public interface SplusProductDetailCustomRepository extends JpaRepository<ProductDetail, String> {

/**
 * This method will get the productdetails of specific product.
 * @param product id
 * @return list of product detail
 */
	List<ProductDetail> getProductDetail(String id);
	 
//------------------------------------------------------------------------------------------------------------
	
	ProductDetail getProductandProductDetail(String pid, String pdid);
}
