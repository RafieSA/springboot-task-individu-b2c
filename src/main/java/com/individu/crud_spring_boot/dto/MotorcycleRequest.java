package com.individu.crud_spring_boot.dto;

import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Data
public class MotorcycleRequest {
    private String user_id;
    private String motorcycle_name;
    private Integer motorcycle_year;
    private String engine_cc;
    private String colour;
}
