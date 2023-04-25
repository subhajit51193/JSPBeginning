package com.app.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.app.model.Product;
import com.app.service.ProductService;

@Controller
public class JspController {

	@Autowired
	private ProductService productService;
	
	@GetMapping("/")
	public String index() {
		return "index";
	}
	
	@GetMapping("/view_products")
	public ModelAndView getStudentList() {
		
		List<Product> list = productService.getAllProducts();
		ModelAndView mv = new ModelAndView("view_products","productList",list);
		return mv;
		
	}
	
	@PostMapping("/add_product")
	public ModelAndView addProduct(Product product) {
		
		Product newProduct = productService.addProduct(product);
		ModelAndView mv = new ModelAndView("add_product", "newProduct", newProduct);
		return mv;
		
		
	}
}
