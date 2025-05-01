package com.individu.crud_spring_boot.dto;

import lombok.*;

import java.sql.Timestamp;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class UserResponse {
    private String id;
    private String username;
    private String email;
    private Timestamp created_at;
}
