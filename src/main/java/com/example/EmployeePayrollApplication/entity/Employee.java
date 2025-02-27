package com.example.EmployeePayrollApplication.entity;
import jakarta.persistence.*;
import lombok.*;

// Created a Entity to save or extract details from DB
@Entity
@Table(name = "employees")
@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString

public class Employee {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String name;

    @Column(nullable = false)
    private double salary;

    @Column(nullable = false)
    private String department;

    // Default Constructor
}
