package com.demo.kafka.product.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.demo.kafka.model.Product;
import com.demo.kafka.product.service.ProductService;

@RestController
@RequestMapping("/products")
public class ProductController {
	
	ProductService productService;

	public ProductController(ProductService productService) {
		this.productService = productService;
	}
	
	@PostMapping("/products")
	public ResponseEntity<String> createProduct(@RequestBody Product product) {
		String productId = productService.createProduct(product);
		return ResponseEntity.status(HttpStatus.CREATED).body("Product created successfully");
	}
}
