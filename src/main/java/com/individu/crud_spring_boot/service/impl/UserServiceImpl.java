package com.individu.crud_spring_boot.service.impl;

import com.individu.crud_spring_boot.dto.UserRequest;
import com.individu.crud_spring_boot.dto.UserResponse;
import com.individu.crud_spring_boot.repository.UserRepository;
import com.individu.crud_spring_boot.service.UserService;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    UserRepository userRepository;

    @Override
    public String createUser(UserRequest request) {
        return "";
    }

    @Override
    public List<UserResponse> getAll(String name) {
        return List.of();
    }

    @Override
    public String updateUser(String id, UserRequest request) {
        return "";
    }

    @Override
    public String deleteUser(String id) {
        return "";
    }
}
