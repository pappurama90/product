package com.fedex.purple.product.repository;

import org.springframework.stereotype.Repository;

import com.fedex.purple.product.domain.Product;

@Repository
public class ProductRepository {
	public Product getProduct(Integer id, Integer custId) {

		System.out.println(custId);
		Product p = new Product();
		p.setId(id);
		p.setName("IPhone XS");
		p.setCost(789.99);
		return p;
	}
	
	public Product saveProduct(Product p, Integer custId) {
		p.setId(50);
		System.out.println("saving p in db");
		return p;
	}
}
