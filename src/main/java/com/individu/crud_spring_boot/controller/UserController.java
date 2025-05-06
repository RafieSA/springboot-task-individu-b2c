package com.individu.crud_spring_boot.controller;

import com.individu.crud_spring_boot.dto.UserRequest;
import com.individu.crud_spring_boot.dto.UserResponse;
import com.individu.crud_spring_boot.service.UserService;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/user")
@NoArgsConstructor
public class UserController {

    @Autowired
    private UserService userService;

    @PostMapping("/create")
    String createUser(@RequestBody UserRequest request){
        return userService.createUser(request);
    }

    @GetMapping("/getall")
    List<UserResponse> getAll(@RequestParam(required = false, defaultValue = "") String name){
        return userService.getAll(name);
    }

    @PutMapping("/edit/{id}")
    String updateUser(@PathVariable String id, @RequestBody UserRequest request){
        return userService.updateUser(id, request);
    }

    @DeleteMapping("/delete/{id}")
    String deleteUser(@PathVariable String id){
        return userService.deleteUser(id);
    }
}
