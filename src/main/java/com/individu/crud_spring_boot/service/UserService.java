package com.individu.crud_spring_boot.service;

import com.individu.crud_spring_boot.dto.UserRequest;
import com.individu.crud_spring_boot.dto.UserResponse;

import java.util.List;
import java.util.UUID;

public interface UserService {
    String createUser(UserRequest request);
    List<UserResponse> getAll(String name);
    String updateUser(UUID id, UserRequest request);
    String deleteUser(UUID id);
}
