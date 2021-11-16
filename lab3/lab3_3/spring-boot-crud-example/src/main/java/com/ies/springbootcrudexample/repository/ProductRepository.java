package com.ies.springbootcrudexample.repository;

import com.ies.springbootcrudexample.model.Product;

import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Integer> {
    Product findByName(String name);
}
