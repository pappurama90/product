package com.fedex.purple.product.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.fedex.purple.product.domain.Product;
import com.fedex.purple.product.serviceimpl.ProductServiceImpl;

@RestController
public class ProductController {

	@Autowired
	ProductServiceImpl productServiceImpl;
	
	@GetMapping(path = "/api/products")
	public Product getProduct(@RequestParam(required = false) Integer id,
			@RequestHeader(name = "custId",required = false) Integer custId) {
		
		Product p =productServiceImpl.getProduct(id, custId);
		return p;
	}
	
	@PostMapping(path = "/api/products")
	public Product saveProduct(@RequestBody Product product,
			@RequestHeader(name = "custId") Integer custId) {
		
		Product p =productServiceImpl.saveProduct(product, custId);
		return p;
	}
	
	@PutMapping(path = "/api/products")
	public Product updateProduct(@RequestBody Product product,
			@RequestHeader(name = "custId") Integer custId) {
		
		Product p =productServiceImpl.saveProduct(product, custId);
		return p;
	}
	
	@DeleteMapping(path = "/api/products")
	public Product deleteProduct(@RequestParam(required = false) Integer id,
			@RequestHeader(name = "custId",required = false) Integer custId) {
		
		Product p =productServiceImpl.getProduct(id, custId);
		return p;
	}

}
