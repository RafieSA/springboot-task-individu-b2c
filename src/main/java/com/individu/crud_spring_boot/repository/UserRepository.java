package com.individu.crud_spring_boot.repository;


import com.individu.crud_spring_boot.entity.Users;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<Users, String> {
}
