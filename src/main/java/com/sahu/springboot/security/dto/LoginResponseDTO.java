package com.sahu.springboot.security.dto;

import lombok.Builder;

@Builder
public record LoginResponseDTO(
        Long userId,
        String email,
        String username
)
{
}
