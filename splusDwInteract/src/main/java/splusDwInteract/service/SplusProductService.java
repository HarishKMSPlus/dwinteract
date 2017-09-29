package splusDwInteract.service;

import java.util.List;

import splusDwInteract.model.Product;

/**
 * This interface gets the call from the product controller and it contains the business logic to get product details.
 * @author Nehal.Shah
 */

public interface SplusProductService {

	/**
	 * This method will get list of all products
	 * @return list of product
	 */

	public List<Product> getListOfProduct();

	/**
	 * This method will get a list by Product id.
	 * @param product id
	 * @return product
	 */

	public Product getListOfProductById(String i);
}
