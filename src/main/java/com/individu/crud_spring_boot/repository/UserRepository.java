package com.individu.crud_spring_boot.repository;


import com.individu.crud_spring_boot.entity.Users;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface UserRepository extends JpaRepository<Users, String> {
    @Query("SELECT u FROM Users u WHERE u.username LIKE CONCAT('%', :username, '%')")
    List<Users> findByUsername(String name);
}
