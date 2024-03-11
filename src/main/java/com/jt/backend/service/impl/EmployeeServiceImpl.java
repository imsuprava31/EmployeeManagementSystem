package com.jt.backend.service.impl;

import com.jt.backend.model.Employee;
import com.jt.backend.repository.EmployeeRepository;
import com.jt.backend.service.IEmployeeService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

/*
 * Author @Suprava Parida
 * Created on 11th March 2024
 * */
@Service
@RequiredArgsConstructor
public class EmployeeServiceImpl implements IEmployeeService {

    private final EmployeeRepository employeeRepository;

    @Override
    public Employee createEmployee(Employee employee) {
        return employeeRepository.save(employee);
    }

    @Override
    public List<Employee> getEmployees() {
        return employeeRepository.findAll();
    }

    @Override
    public Employee getDistinctByEmpFirstNameAndEmpLastName(String empFirstName, String empLastName) {
        return employeeRepository.findDistinctByEmpFirstNameAndEmpLastName(empFirstName,empLastName).orElseThrow();
    }

    @Override
    public Employee getByEmpFirstNameAndEmpLastName(String empFirstName, String empLastName) {
        return employeeRepository.findByEmpFirstNameAndEmpLastName(empFirstName,empLastName).orElseThrow();
    }

    @Override
    public List<Employee> getByEmpFirstNameOrEmpLastName(String empFirstName, String empLastName) {
        return employeeRepository.findByEmpFirstNameOrEmpLastName(empFirstName,empLastName);
    }

    @Override
    public List<Employee> getByEmpFirstNameIs(String empFirstName) {
        return employeeRepository.findByEmpFirstNameIs(empFirstName);
    }

    @Override
    public List<Employee> getByEmpFirstName(String empFirstName) {
        return employeeRepository.findByEmpFirstName(empFirstName);
    }

    @Override
    public List<Employee> getByEmpFirstNameEquals(String empFirstName) {
        return employeeRepository.findByEmpFirstNameEquals(empFirstName);
    }

    @Override
    public List<Employee> getByEmpAgeLessThan(String EmpAge) {
        return employeeRepository.findByEmpAgeLessThan(EmpAge);
    }

    @Override
    public List<Employee> getByEmpAgeLessThanEqual(String EmpAge) {
        return employeeRepository.findByEmpAgeLessThanEqual(EmpAge);
    }

    @Override
    public List<Employee> getByEmpAgeGreaterThan(String EmpAge) {
        return employeeRepository.findByEmpAgeGreaterThan(EmpAge);
    }

    @Override
    public List<Employee> getByEmpAgeGreaterThanEqual(String EmpAge) {
        return employeeRepository.findByEmpAgeGreaterThanEqual(EmpAge);
    }

    @Override
    public List<Employee> getByEmpAgeIsNull() {
        return employeeRepository.findByEmpAgeIsNull();
    }

    @Override
    public List<Employee> getByEmpAgeIsNotNull() {
        return employeeRepository.findByEmpAgeIsNotNull();
    }

    @Override
    public List<Employee> getByEmpFirstNameLike(String inputString) {
        return employeeRepository.findByEmpFirstNameLike(inputString);
    }

    @Override
    public List<Employee> getByEmpFirstNameNotLike(String inputString) {
        return employeeRepository.findByEmpFirstNameNotLike(inputString);
    }

    @Override
    public List<Employee> getByEmpFirstNameStartingWith(String prefix) {
        return employeeRepository.findByEmpFirstNameStartingWith(prefix);
    }

    @Override
    public List<Employee> getByEmpFirstNameEndingWith(String postfix) {
        return employeeRepository.findByEmpFirstNameEndingWith(postfix);
    }

    @Override
    public List<Employee> getByEmpFirstNameContaining(String subString) {
        return employeeRepository.findByEmpFirstNameContaining(subString);
    }

    @Override
    public List<Employee> getByEmpAgeOrderByEmpLastNameDesc(String empAge) {
        return employeeRepository.findByEmpAgeOrderByEmpLastNameDesc(empAge);
    }

    @Override
    public List<Employee> getByEmpLastNameNot(String inputString) {
        return employeeRepository.findByEmpLastNameNot(inputString);
    }

    @Override
    public List<Employee> getByEmpAgeIn(List<String> empAge) {
        return employeeRepository.findByEmpAgeIn(empAge);
    }

    @Override
    public List<Employee> getByActiveTrue() {
        return employeeRepository.findByActiveTrue();
    }

    @Override
    public List<Employee> getByActiveFalse() {
        return employeeRepository.findByActiveFalse();
    }

    @Override
    public List<Employee> getByEmpFirstNameIgnoreCase(String empFirstName) {
        return employeeRepository.findByEmpFirstNameIgnoreCase(empFirstName);
    }
}
