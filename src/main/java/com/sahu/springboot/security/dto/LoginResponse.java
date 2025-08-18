package com.sahu.springboot.security.dto;

import lombok.Builder;

import java.util.List;

@Builder
public record LoginResponse(
        Long userId,
        String email,
        String username,
        List<String> roles
)
{
}
