package com.fyllera.webstore.repository;

import java.util.List;

import com.fyllera.webstore.domain.Product;

public interface ProductRepository {
	List <Product> getAllProducts();
}
