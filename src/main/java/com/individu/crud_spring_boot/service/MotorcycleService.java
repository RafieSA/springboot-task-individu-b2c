package com.individu.crud_spring_boot.service;

import com.individu.crud_spring_boot.dto.MotorcycleRequest;
import com.individu.crud_spring_boot.dto.MotorcycleResponse;

import java.util.List;
import java.util.UUID;

public interface MotorcycleService {
    String createMotorcycle(MotorcycleRequest request);
    List<MotorcycleResponse> getAll(String name);
    List<MotorcycleResponse> getById(String name);
    String updateMotorcycle(UUID id, MotorcycleRequest request);
    String deleteMotorcycle(UUID id);
}
