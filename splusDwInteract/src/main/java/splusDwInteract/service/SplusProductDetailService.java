package splusDwInteract.service;

import java.util.List;

import splusDwInteract.model.ProductDetail;

public interface SplusProductDetailService {

	//method to get all the productdetails 
	
	public List<ProductDetail> getListOfProductDetails();

	//method to get the product details of particular product id
	
	public ProductDetail getProductDetailById(String id);
}
