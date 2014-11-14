package com.fyllera.webstore.service;

import java.util.List;

import com.fyllera.webstore.domain.Product;

public interface ProductService {
	List<Product> getAllProducts();
	Product getProductById(String productID);
	List<Product> getProductsByCategory(String category);
}
