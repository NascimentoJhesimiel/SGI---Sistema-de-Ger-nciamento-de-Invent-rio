package com.jhesimiel.InventoryManagementSystem.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.jhesimiel.InventoryManagementSystem.entity.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {
}
