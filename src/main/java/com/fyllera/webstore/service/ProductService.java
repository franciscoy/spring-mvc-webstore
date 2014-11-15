package com.fyllera.webstore.service;

import java.math.BigDecimal;
import java.util.List;
import java.util.Map;
import java.util.Set;

import com.fyllera.webstore.domain.Product;

public interface ProductService {
	List<Product> getAllProducts();
	Product getProductById(String productID);
	List<Product> getProductsByCategory(String category);
	Set<Product> getProductsByFilter(Map<String, List<String>> filterParams);
	List<Product> getProductsByManufacturer(String manufacturer);
	List<Product> getProductsByPriceFilter(BigDecimal priceBottom, BigDecimal priceTop);
	void addProduct(Product product);
}
