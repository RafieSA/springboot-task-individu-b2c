package com.individu.crud_spring_boot.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.sql.Timestamp;
import java.util.UUID;

@Entity
@Table(name = "motorcycle")
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Data
public class Motorcycle {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "motorcycle_id", nullable = false)
    private UUID motorcycleId;
    @Column(name = "user_id")
    private UUID userId;
    @Column(name = "motorcycle_name")
    private String motorcycleName;
    @Column(name = "motorcycle_year")
    private Integer motorcycleYear;
    @Column(name = "engine_cc")
    private String engineCc;
    @Column(name = "colour")
    private String colour;

    @Column(name = "created_at")
    private Timestamp createdAt;
    @Column(name = "updated_at")
    private Timestamp updatedAt;
    @Column(name = "deleted_at")
    private Timestamp deletedAt;
    @Column(name = "is_deleted")
    private Boolean isDeleted;
}
