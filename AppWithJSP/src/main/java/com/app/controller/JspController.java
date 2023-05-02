package com.app.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;
import org.springframework.web.servlet.view.RedirectView;

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
	
	
//	@PostMapping("/saveProduct")
//	public ModelAndView addProduct(@ModelAttribute("product")Product product) {
//		
//		Product newProduct = productService.addProduct(product);
//		ModelAndView mv = new ModelAndView("add_product","addedProduct",newProduct);
//		return mv;
//	}
//	
//	
//	@GetMapping("/addProduct")
//	public ModelAndView addProduct() {
//		
//		List<Product> list = productService.getAllProducts();
//		ModelAndView mv = new ModelAndView("view_products","productList",list);
//		return mv;
//		
//	}
	
	@GetMapping("/addProduct")
	public String addProduct(@ModelAttribute("message") String message, Model model) {
		model.addAttribute("product",new Product());
		model.addAttribute("message",message);
		return "addProduct";
	}
	
	@PostMapping("/saveProduct")
    public String saveAnime(Product product, RedirectAttributes redirectAttributes) {
        if (productService.saveOrupdate(product)) {
            redirectAttributes.addFlashAttribute("message", "Save Success");
            return "redirect:/view_products";
        }

        redirectAttributes.addFlashAttribute("message", "Save Failure");
        return "redirect:/addProduct";
    }
	
	 @GetMapping("/editProduct/{id}")
	    public String editAnime(@PathVariable Integer id, Model model) {
	        model.addAttribute("product", productService.getProductById(id));

	        return "editProduct";
	    }
	 
	 
	 @PostMapping("/editSaveProduct")
	    public String editSaveAnime(Product product, RedirectAttributes redirectAttributes) {
	        if (productService.saveOrupdate(product)) {
	            redirectAttributes.addFlashAttribute("message", "Edit Success");
	            return "redirect:/view_products";
	        }

	        redirectAttributes.addFlashAttribute("message", "Edit Failure");
	        return "redirect:/editProduct/" + product.getProductId();
	    }
	 
	 
	 
	 
	 @GetMapping("/deleteProduct/{id}")
	    public String deleteAnime(@PathVariable Integer id, RedirectAttributes redirectAttributes) {
	        if (productService.deleteProduct(id)) {
	            redirectAttributes.addFlashAttribute("message", "Delete Success");
	        } else {
	            redirectAttributes.addFlashAttribute("message", "Delete Failure");
	        }

	        return "redirect:/view_products";
	    }

	

}
