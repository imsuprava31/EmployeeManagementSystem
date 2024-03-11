package com.jt.backend.service;

import com.jt.backend.model.Employee;

import java.util.List;

/*
 * Author @Suprava Parida
 * Created on 11th March 2024
 * */
public interface IEmployeeService {

    Employee createEmployee(Employee employee);

    List<Employee> getEmployees();

    Employee getDistinctByEmpFirstNameAndEmpLastName(String empFirstName,String empLastName);

    Employee getByEmpFirstNameAndEmpLastName(String empFirstName,String empLastName);

    List<Employee> getByEmpFirstNameOrEmpLastName(String empFirstName,String empLastName);

    List<Employee> getByEmpFirstNameIs(String empFirstName);

    List<Employee> getByEmpFirstName(String empFirstName);

    List<Employee> getByEmpFirstNameEquals(String empFirstName);

    List<Employee> getByEmpAgeLessThan(String EmpAge);

    List<Employee> getByEmpAgeLessThanEqual(String EmpAge);

    List<Employee> getByEmpAgeGreaterThan(String EmpAge);

    List<Employee> getByEmpAgeGreaterThanEqual(String EmpAge);

    List<Employee> getByEmpAgeIsNull();

    List<Employee> getByEmpAgeIsNotNull();

    List<Employee> getByEmpFirstNameLike(String inputString);

    List<Employee> getByEmpFirstNameNotLike(String inputString);

    List<Employee> getByEmpFirstNameStartingWith(String prefix);

    List<Employee> getByEmpFirstNameEndingWith(String postfix);

    List<Employee> getByEmpFirstNameContaining(String subString);

    List<Employee> getByEmpAgeOrderByEmpLastNameDesc(String empAge);

    List<Employee> getByEmpLastNameNot(String inputString);

    List<Employee> getByEmpAgeIn(List<String> empAge);

    List<Employee> findByActiveTrue();

    List<Employee> findByActiveFalse();







}
