package com.jhesimiel.InventoryManagementSystem.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.jhesimiel.InventoryManagementSystem.entity.Supplier;

public interface SupplierRepository extends JpaRepository<Supplier, Long> {
}
