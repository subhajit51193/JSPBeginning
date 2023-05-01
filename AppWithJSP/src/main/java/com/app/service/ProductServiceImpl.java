package com.app.service;

import java.util.List;
import java.util.Optional;

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
		
//		Category newCategory =  new Category();
//		newCategory.setCatName(product.getCategory().getCatName());
//		newCategory.setProduct(product);
//		categoryRepository.save(newCategory);
//		product.setCategory(newCategory);
//		return productRepository.save(product);
		
	}

	@Override
	public List<Product> getAllProducts() {
		
		return productRepository.findAll();
	}

	@Override
	public Product getProductById(Integer id) {
		
		Optional<Product> opt =productRepository.findById(id);
		if (opt.isEmpty()) {
			throw new NullPointerException();
		}
		else {
			return opt.get();
		}
	}

	@Override
	public boolean saveOrupdate(Product product) {
		
		Category newCategory = product.getCategory();
		product.setCategory(newCategory);
		newCategory.setProduct(product);
		categoryRepository.save(newCategory);
		Product updatedProduct = productRepository.save(product);
		if (productRepository.findById(updatedProduct.getProductId()) != null) {
			return true;
		}
		return false;
	}

	@Override
	public boolean deleteProduct(Integer id) {
		
		productRepository.deleteById(id);
		
		if (productRepository.findById(id) != null) {
			return true;
		}
		return false;
	}

}
