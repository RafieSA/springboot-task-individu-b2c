package com.individu.crud_spring_boot.dto;

import lombok.*;

import java.sql.Timestamp;
import java.util.UUID;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class MotorcycleResponse {
    private UUID motorcycle_id;
    private UUID user_id;
    private String motorcycle_name;
    private Integer motorcycle_year;
    private Integer engine_cc;
    private String colour;
    private Timestamp created_at;
}
