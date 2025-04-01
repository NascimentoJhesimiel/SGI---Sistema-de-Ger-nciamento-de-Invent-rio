package com.jhesimiel.InventoryManagementSystem.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.jhesimiel.InventoryManagementSystem.entity.Category;

public interface CategoryRepository extends JpaRepository<Category, Long> {
}
