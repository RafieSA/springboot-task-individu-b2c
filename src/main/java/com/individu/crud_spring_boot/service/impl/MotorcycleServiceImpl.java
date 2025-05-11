package com.individu.crud_spring_boot.service.impl;

import com.individu.crud_spring_boot.dto.MotorcycleRequest;
import com.individu.crud_spring_boot.dto.MotorcycleResponse;
import com.individu.crud_spring_boot.entity.Motorcycle;
import com.individu.crud_spring_boot.repository.MotorcycleRepository;
import com.individu.crud_spring_boot.service.MotorcycleService;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.sql.Timestamp;
import java.time.Instant;
import java.util.List;
import java.util.UUID;

@AllArgsConstructor
@NoArgsConstructor
@Service
public class MotorcycleServiceImpl implements MotorcycleService {

    @Autowired
    MotorcycleRepository motorcycleRepository;

    @Override
    public String createMotorcycle(MotorcycleRequest request) {
        Motorcycle motorcycle = Motorcycle.builder()
                .userId(UUID.fromString(request.getUser_id()))
                .motorcycleName(request.getMotorcycle_name())
                .motorcycleYear(request.getMotorcycle_year())
                .engineCc(request.getEngine_cc())
                .colour(request.getColour())
                .createdAt(Timestamp.from(Instant.now()))
                .isDeleted(false)
                .build();
        motorcycleRepository.save(motorcycle);
        return "CREATE MOTORCYCLE SUCCESS";
    }

    @Override
    public List<MotorcycleResponse> getAll(String name) {
        return List.of();
    }

    @Override
    public List<MotorcycleResponse> getById(String name) {
        return List.of();
    }

    @Override
    public String updateMotorcycle(UUID id, MotorcycleRequest request) {
        motorcycleRepository.findById(id).map(data -> {
            data.setMotorcycleName(request.getMotorcycle_name());
            data.setMotorcycleYear(request.getMotorcycle_year());
            data.setEngineCc(request.getEngine_cc());
            data.setColour(request.getColour());
            data.setUpdatedAt(Timestamp.from(Instant.now()));
            motorcycleRepository.save(data);
            return data;
        });
        return "UPDATE MOTORCYCLE SUCCESS";
    }

    @Override
    public String deleteMotorcycle(UUID id) {
        motorcycleRepository.findById(id).map(data -> {
            data.setIsDeleted(Boolean.TRUE);
            motorcycleRepository.save(data);
            return data;
        });
        return "DELETE MOTORCYCLE SUCCESS";
    }
}
