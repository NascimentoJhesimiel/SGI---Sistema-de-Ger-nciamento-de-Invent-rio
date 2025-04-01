package com.jhesimiel.InventoryManagementSystem.service;

import com.jhesimiel.InventoryManagementSystem.dto.CategoryDTO;
import com.jhesimiel.InventoryManagementSystem.dto.Response;

public interface CategoryService {
    Response createCategory(CategoryDTO categoryDTO);
    Response getAllCategories();
    Response getCategoryById(Long id);
    Response updateCategory(Long id, CategoryDTO categoryDTO);
    Response deleteCategory(Long id);
}
