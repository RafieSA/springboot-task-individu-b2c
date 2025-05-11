package com.individu.crud_spring_boot.repository;

import com.individu.crud_spring_boot.entity.Motorcycle;
import org.springframework.data.jpa.repository.JpaRepository;


import java.util.UUID;

public interface MotorcycleRepository extends JpaRepository<Motorcycle, UUID> {
}
