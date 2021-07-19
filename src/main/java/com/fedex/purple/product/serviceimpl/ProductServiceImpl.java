package com.fedex.purple.product.serviceimpl;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fedex.purple.product.domain.Product;
import com.fedex.purple.product.repository.ProductRepository;

@Service
public class ProductServiceImpl {

	@Autowired
	ProductRepository productRepository;
	
	@Autowired
	RamaService ramaService;

	public Product getProduct(Integer id, Integer custId) {
		Product p = productRepository.getProduct(id, custId);

		return p;
	}
	
	public Product saveProduct(Product p, Integer custId) {
		Product p2 = productRepository.saveProduct(p, custId);
		return p2;
	}

	@PreDestroy
	public void test() {
		System.out.println("-----------1");
	}

	@PostConstruct
	public void test2() {
		System.out.println("-----------2");
	}
}
