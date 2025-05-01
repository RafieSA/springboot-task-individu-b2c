package com.individu.crud_spring_boot.dto;

import lombok.*;

import java.sql.Timestamp;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class MotorcycleResponse {
    private String motorcycle_id;
    private String user_id;
    private String motorcycle_name;
    private String motorcycle_year;
    private String engine_cc;
    private String colour;
    private Timestamp created_at;
}
