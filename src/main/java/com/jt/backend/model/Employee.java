package com.jt.backend.model;

import jakarta.persistence.*;
import lombok.*;

/*
 * Author @Suprava Parida
 * Created on 11th March 2024
 * */

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Builder
@Entity//for table create in db
@Table(name = "employee_tbl")
public class Employee {

    @Id//for primary key
    @GeneratedValue(strategy = GenerationType.IDENTITY)//for autoIncrement
    private int empId;
    @Column(name = "emp_first_name",nullable = false)
    private String empFirstName;

    @Column(name = "emp_last_name",nullable = false)
    private String empLastName;

    @Column(name = "emp_age",nullable = false)
    private String empAge;

    @Column(name = "emp_contact_num",nullable = false)
    private String empContactNumber;

    @Column(name = "emp_email_id",nullable = false)
    private String empEmailId;

    @Column(name = "emp_address",nullable = false)
    private String address;

    @Column(name = "active",nullable = false)
    private boolean active;



}
