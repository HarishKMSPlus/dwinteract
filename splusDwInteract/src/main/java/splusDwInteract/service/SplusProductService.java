package splusDwInteract.service;

import java.util.List;

import splusDwInteract.model.Product;

public interface SplusProductService {

	public List<Product> getListOfProduct();

	public Product getListOfProductById(int i);
}
