package com.jhesimiel.InventoryManagementSystem.service;

import org.springframework.web.multipart.MultipartFile;

import com.jhesimiel.InventoryManagementSystem.dto.ProductDTO;
import com.jhesimiel.InventoryManagementSystem.dto.Response;

public interface ProductService {
    Response saveProduct(ProductDTO productDTO, MultipartFile imageFile);
    Response updateProduct(ProductDTO productDTO, MultipartFile imageFile);
    Response getAllProducts();
    Response getProductById(Long id);
    Response deleteProduct(Long id);
}
