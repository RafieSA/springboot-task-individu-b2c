package com.individu.crud_spring_boot.service;

import com.individu.crud_spring_boot.dto.UserRequest;
import com.individu.crud_spring_boot.dto.UserResponse;

import java.util.List;

public interface UserService {
    String createUser(UserRequest request);
    List<UserResponse> getAll(String name);
    List<UserResponse> getById(String name);
    String updateUser(String id, UserRequest request);
    String deleteUser(String id);
}
