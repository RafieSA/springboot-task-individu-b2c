package com.individu.crud_spring_boot.controller;

import com.individu.crud_spring_boot.dto.MotorcycleRequest;
import com.individu.crud_spring_boot.dto.MotorcycleResponse;
import com.individu.crud_spring_boot.service.MotorcycleService;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/motorcycle")
@NoArgsConstructor
public class MotorcycleController {

    @Autowired
    private MotorcycleService motorcycleService;

    @PostMapping("/create")
    String createMotorcycle(@RequestBody MotorcycleRequest request) {
        return motorcycleService.createMotorcycle(request);
    }

    @GetMapping("/get-all")
    List<MotorcycleResponse> getAll(@RequestParam(required = false, defaultValue = "") String name){
        return motorcycleService.getAll(name);
    }

    @PutMapping("/edit/{id}")
    String updateMotorcycle(@PathVariable String id, @RequestBody MotorcycleRequest request){
        return motorcycleService.updateMotorcycle(UUID.fromString(id), request);
    }

    @DeleteMapping("/delete/{id}")
    String deleteUser(@PathVariable String id){
        return motorcycleService.deleteMotorcycle(UUID.fromString(id));
    }
}
