package splusDwInteract.service;

import java.util.List;

import splusDwInteract.model.ProductDetail;

/**
 * This interface gets the call from the productDetail controller and it contains the business logic to get product details.
 * @author Dhiraj Bangar
 */

public interface SplusProductDetailService {

	/**
	 * This method will get a list of all productdetail
	 * @return list of productdetail
	 */

	public List<ProductDetail> getListOfProductDetails();

	/**
	 * This method will get a list by Productdetail id
	 * @param productdetail id
	 * @return productdetail
	 */

	public ProductDetail getProductDetailById(String id);
	
	public ProductDetail getProductByProductDetailId(String id);
}
