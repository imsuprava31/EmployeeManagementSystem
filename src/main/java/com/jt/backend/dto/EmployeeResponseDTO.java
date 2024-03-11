package com.jt.backend.dto;

import jakarta.validation.constraints.NotNull;

public record EmployeeResponseDTO(
        String empFirstName,
        String empLastName,
        String empAge,
        String empContactNumber,
        String empEmailId,
        String address,
        boolean active

) {
}
