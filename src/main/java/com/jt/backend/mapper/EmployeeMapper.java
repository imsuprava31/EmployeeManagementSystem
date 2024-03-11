package com.jt.backend.mapper;

import com.jt.backend.dto.EmployeeRequestDTO;
import com.jt.backend.dto.EmployeeResponseDTO;
import com.jt.backend.model.Employee;
import org.springframework.beans.BeanUtils;

/*
 * Author @Suprava Parida
 * Created on 11th March 2024
 * */

public class EmployeeMapper {

    /**
     * It Converts EmployeeRequestDTO DTO object to Employee Model object
     */
    public static Employee modelMapper(EmployeeRequestDTO employeeRequestDTO){
        var employee = new Employee();
        BeanUtils.copyProperties(employeeRequestDTO,employee);
        return employee;
    }

    /**
     * It Converts Employee Model object to EmployeeResponseDTO
     */
    public static EmployeeResponseDTO dtoMapper(Employee employee){
        var empFirstName = employee.getEmpFirstName();
        var empLastName = employee.getEmpLastName();
        var empAge = employee.getEmpAge();
        var empContactNumber = employee.getEmpContactNumber();
        var empEmailId = employee.getEmpEmailId();
        var address = employee.getAddress();

        return new EmployeeResponseDTO(
                empFirstName,
                empLastName,
                empAge,
                empContactNumber,
                empEmailId,
                address
        );
    }
}
