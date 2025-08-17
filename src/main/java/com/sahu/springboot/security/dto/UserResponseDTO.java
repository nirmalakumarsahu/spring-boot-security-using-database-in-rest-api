package com.sahu.springboot.security.dto;

import lombok.Builder;

import java.util.List;

@Builder
public record UserResponseDTO(
        Long userId,
        String username,
        String email,
        List<String> roles
)
{
}
