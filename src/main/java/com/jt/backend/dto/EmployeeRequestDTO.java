package com.jt.backend.dto;

import jakarta.validation.constraints.NotNull;

public record EmployeeRequestDTO(
        @NotNull
        String empFirstName,
        @NotNull
        String empLastName,
        @NotNull
        String empAge,
        @NotNull
        String empContactNumber,
        @NotNull
        String empEmailId,
        @NotNull
        String address
) {
}
