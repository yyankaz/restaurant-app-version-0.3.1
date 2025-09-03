package com.yyankaz.restaurant_app_version_031.dto;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;

public record RegisterRequest(
        @NotBlank String username,
        @Email String email,
        @NotBlank String password,
        String firstName,
        String lastName
) {}
