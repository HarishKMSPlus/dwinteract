package splusDwInteract.service;

import java.util.List;

import splusDwInteract.model.Product;

public interface SplusProductService {
	
	//method to get all the products 

	public List<Product> getListOfProduct();
	
	//method to get the product of particular product id

    public Product getListOfProductById(String i);
}
