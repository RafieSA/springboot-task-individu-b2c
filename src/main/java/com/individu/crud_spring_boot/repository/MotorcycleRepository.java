package com.individu.crud_spring_boot.repository;

import com.individu.crud_spring_boot.entity.Motorcycle;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MotorcycleRepository extends JpaRepository<Motorcycle, String> {
}
