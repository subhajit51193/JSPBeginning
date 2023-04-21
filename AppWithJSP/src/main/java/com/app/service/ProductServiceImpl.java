package com.app.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app.model.Category;
import com.app.model.Product;
import com.app.repository.CategoryRepository;
import com.app.repository.ProductRepository;

@Service
public class ProductServiceImpl implements ProductService{

	@Autowired
	private ProductRepository productRepository;
	
	@Autowired
	private CategoryRepository categoryRepository;
	
	@Override
	public Product addProduct(Product product) {
		
		Category newCategory = product.getCategory();
		product.setCategory(newCategory);
		newCategory.setProduct(product);
		categoryRepository.save(newCategory);
		return productRepository.save(product);
		
	}

	@Override
	public List<Product> getAllProducts() {
		
		return productRepository.findAll();
	}

}
