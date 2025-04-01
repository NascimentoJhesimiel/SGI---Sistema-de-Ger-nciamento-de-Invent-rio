package com.jhesimiel.InventoryManagementSystem.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.jhesimiel.InventoryManagementSystem.entity.User;

import java.util.Optional;

public interface UserRepository extends JpaRepository<User, Long> {
    Optional<User> findByEmail(String email);
}
