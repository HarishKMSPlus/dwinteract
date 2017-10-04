package splusDwInteract.service;

import java.util.List;

import splusDwInteract.model.ProductDetail;

public interface SplusProductDetailCustomService {

	public List<ProductDetail> getProductDetailByProduct(String id);

	
//	-------------------------------------------------
	public  ProductDetail  getProductDetailByProductId(String pid, String pdid);
}
