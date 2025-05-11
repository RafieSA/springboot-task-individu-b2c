package com.individu.crud_spring_boot.service.impl;

import com.individu.crud_spring_boot.dto.UserRequest;
import com.individu.crud_spring_boot.dto.UserResponse;
import com.individu.crud_spring_boot.entity.Users;
import com.individu.crud_spring_boot.repository.UserRepository;
import com.individu.crud_spring_boot.service.UserService;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.sql.Timestamp;
import java.time.Instant;
import java.util.List;
import java.util.UUID;
import java.util.stream.Collectors;


@AllArgsConstructor
@NoArgsConstructor
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    UserRepository userRepository;

    @Override
    public List<UserResponse> getAll(String name) {
        List<UserResponse> list = userRepository.findAll().stream().map(data -> {
            return UserResponse.builder()
                    .id(data.getId())
                    .username(data.getUsername())
                    .email(data.getEmail())
                    .build();
        }).collect(Collectors.toList());

        return list;
    }


    @Override
    public String createUser(UserRequest request) {
        if (request.getUsername() == null || request.getUsername().isEmpty()) {
            throw new IllegalArgumentException("Username cannot be null or empty");
        }
        Users user = Users.builder()
                .username(request.getUsername())
                .email(request.getEmail())
                .password(request.getPassword())
                .createdAt(Timestamp.from(Instant.now()))
                .isDeleted(false)
                .build();
        userRepository.save(user);
        return "CREATE USER SUCCESS";
    }

    @Override
    public String updateUser(UUID id, UserRequest request) {
        userRepository.findById(id).map(data -> {
            data.setUsername(request.getUsername());
            data.setEmail(request.getEmail());
            data.setPassword(request.getPassword());
            data.setUpdatedAt(Timestamp.from(Instant.now()));
            userRepository.save(data);
            return data;
        });
        return "SUCCESS UPDATING USER";
    }

    @Override
    public String deleteUser(UUID id) {
        userRepository.findById(id).map(data -> {
            data.setIsDeleted(Boolean.TRUE);
            userRepository.save(data);
            return data;
        });

        return "SUCCESS DELETE USER";
    }
}
