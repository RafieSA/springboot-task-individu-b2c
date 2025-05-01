package com.individu.crud_spring_boot.dto;

import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class MotorcycleRequest {
    private String motorcycle_name;
    private String motorcycle_year;
    private String engine_cc;
    private String colour;
}
