package com.fyllera.webstore.service.impl;

import java.math.BigDecimal;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fyllera.webstore.domain.Product;
import com.fyllera.webstore.repository.ProductRepository;
import com.fyllera.webstore.service.ProductService;

@Service
public class ProductServiceImpl implements ProductService {

	@Autowired
	private ProductRepository productRepository;
	
	public List<Product> getAllProducts() {
		return productRepository.getAllProducts();
	}

	public Product getProductById(String productID) {
        return productRepository.getProductById(productID);
	}

	public List<Product> getProductsByCategory(String category) {
		return productRepository.getProductsByCategory(category);
	}

	public Set<Product> getProductsByFilter(
			Map<String, List<String>> filterParams) {
		return productRepository.getProductsByFilter(filterParams);
	}

	public List<Product> getProductsByManufacturer(String manufacturer) {
		return productRepository.getProductsByManufacturer(manufacturer);
	}

	public List<Product> getProductsByPriceFilter(BigDecimal priceBottom,
			BigDecimal priceTop) {
		return productRepository.getProductsByPriceFilter(priceBottom, priceTop);
	}

	public void addProduct(Product product) {
		productRepository.addProduct(product);
	}
}
