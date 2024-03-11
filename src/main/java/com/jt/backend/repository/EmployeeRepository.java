package com.jt.backend.repository;

import com.jt.backend.model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

/*
 * Author @Suprava Parida
 * Created on 11th March 2024
 * */
public interface EmployeeRepository extends JpaRepository<Employee,Integer> {

    Optional<Employee> findDistinctByEmpFirstNameAndEmpLastName(String empFirstName,String empLastName);

    Optional<Employee> findByEmpFirstNameAndEmpLastName(String empFirstName,String empLastName);

    List<Employee> findByEmpFirstNameOrEmpLastName(String empFirstName, String empLastName);

    List<Employee> findByEmpFirstNameIs(String empFirstName);

    List<Employee> findByEmpFirstName(String empFirstName);

    List<Employee> findByEmpFirstNameEquals(String empFirstName);

    List<Employee> findByEmpAgeLessThan(String EmpAge);

    List<Employee> findByEmpAgeLessThanEqual(String EmpAge);

    List<Employee> findByEmpAgeGreaterThan(String EmpAge);

    List<Employee> findByEmpAgeGreaterThanEqual(String EmpAge);

    List<Employee> findByEmpAgeIsNull();

    List<Employee> findByEmpAgeIsNotNull();

    List<Employee> findByEmpFirstNameLike(String inputString);

    List<Employee> findByEmpFirstNameNotLike(String inputString);

    List<Employee> findByEmpFirstNameStartingWith(String prefix);

    List<Employee> findByEmpFirstNameEndingWith(String postfix);

    List<Employee> findByEmpFirstNameContaining(String subString);

    List<Employee> findByEmpAgeOrderByEmpLastNameDesc(String empAge);

    List<Employee> findByEmpLastNameNot(String inputString);

    List<Employee> findByEmpAgeIn(List<String> empAge);

    List<Employee> findByEmpAgeNotIn(List<String> empAge);

    List<Employee> findByActiveTrue();

    List<Employee> findByActiveFalse();

    List<Employee> findByEmpFirstNameIgnoreCase(String empFirstName);






}
