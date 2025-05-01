package com.individu.crud_spring_boot.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "motorcycle")
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Data
public class Motorcycle {

    @Id
    @Column(name = "motorcycle", nullable = false)
    private String motorcycleId;
    @Column(name = "user_id")
    private String userId;
    @Column(name = "motorcycle_name")
    private String motorcycleName;
    @Column(name = "motorcycle_year")
    private String motorcycleYear;
    @Column(name = "engine_cc")
    private String engineCc;
    @Column(name = "colour")
    private String colour;

    @Column(name = "created_at")
    private String createdAt;
    @Column(name = "updated_at")
    private String updatedAt;
    @Column(name = "deleted_at")
    private String deletedAt;
}
