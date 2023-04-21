package com.app.service;

import java.util.List;

import com.app.model.Product;

public interface ProductService {

	public Product addProduct(Product product);
	
	public List<Product> getAllProducts();
}
