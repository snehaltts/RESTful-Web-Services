package com.ltts.CRUD.using.rest.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ltts.CRUD.using.rest.model.Product;
public interface ProductRepository extends JpaRepository<Product, Integer> {
	 
}