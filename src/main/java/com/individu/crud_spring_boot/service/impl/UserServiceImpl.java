package com.individu.crud_spring_boot.service.impl;

import com.individu.crud_spring_boot.dto.UserRequest;
import com.individu.crud_spring_boot.repository.UserRepository;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@AllArgsConstructor
@NoArgsConstructor
@Service
public class UserServiceImpl {

    @Autowired
    UserRepository userRepository;
}
