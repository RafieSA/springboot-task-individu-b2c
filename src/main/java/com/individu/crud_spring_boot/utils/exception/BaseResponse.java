package com.individu.crud_spring_boot.utils.exception;

import lombok.Builder;
import lombok.Data;
import org.springframework.http.HttpStatus;

@Data
@Builder
public class BaseResponse<T> {

    private HttpStatus httpStatus;

    private Integer status;

    private String message;

    private T data;
}