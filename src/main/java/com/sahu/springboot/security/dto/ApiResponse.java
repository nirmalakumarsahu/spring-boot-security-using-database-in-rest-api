package com.sahu.springboot.security.dto;

import com.sahu.springboot.security.constant.AuthConstants;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import org.springframework.http.HttpStatus;

import java.time.LocalDateTime;

@NoArgsConstructor
@AllArgsConstructor
public class ApiResponse<T> {
    private final LocalDateTime timestamp = LocalDateTime.now();
    private Integer code;
    private String status;
    private String message;
    private T result;
    private Object error;
    private String path;

    public static <T> ApiResponse<T> success(HttpStatus code, String message, T result, String path) {
        return new ApiResponse<>(code.value(), AuthConstants.STATUS_SUCCESS, message, result, null, path);
    }

    public static <T> ApiResponse<T> failure(HttpStatus code, String message, Object error, String path) {
        return new ApiResponse<>(code.value(), AuthConstants.STATUS_FAILURE, message, null, error, path);
    }

    public static <T> ApiResponse<T> error(HttpStatus code, String message, Object error, String path) {
        return new ApiResponse<>(code.value(), AuthConstants.STATUS_ERROR, message, null, error, path);
    }

}
