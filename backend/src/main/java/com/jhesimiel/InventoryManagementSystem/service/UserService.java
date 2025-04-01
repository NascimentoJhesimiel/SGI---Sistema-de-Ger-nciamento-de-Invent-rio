package com.jhesimiel.InventoryManagementSystem.service;

import com.jhesimiel.InventoryManagementSystem.dto.LoginRequest;
import com.jhesimiel.InventoryManagementSystem.dto.RegisterRequest;
import com.jhesimiel.InventoryManagementSystem.dto.Response;
import com.jhesimiel.InventoryManagementSystem.dto.UserDTO;
import com.jhesimiel.InventoryManagementSystem.entity.User;

public interface UserService {
    Response registerUser(RegisterRequest registerRequest);
    Response loginUser(LoginRequest loginRequest);
    Response getAllUsers();
    User getCurrentLoggedInUser();
    Response updateUser(Long id, UserDTO userDTO);
    Response deleteUser(Long id);
    Response getUserTransactions(Long id);
}
