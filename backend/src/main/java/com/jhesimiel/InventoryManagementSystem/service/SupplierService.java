package com.jhesimiel.InventoryManagementSystem.service;

import com.jhesimiel.InventoryManagementSystem.dto.Response;
import com.jhesimiel.InventoryManagementSystem.dto.SupplierDTO;

public interface SupplierService {
    Response addSupplier(SupplierDTO supplierDTO);
    Response updateSupplier(Long id, SupplierDTO supplierDTO);
    Response getAllSuppliers();
    Response getSupplierById(Long id);
    Response deleteSupplier(Long id);
}
