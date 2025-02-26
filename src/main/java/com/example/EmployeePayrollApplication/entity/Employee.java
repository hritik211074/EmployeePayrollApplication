package com.example.EmployeePayrollApplication.entity;
import jakarta.persistence.*;

// Created a Entity to save or extract details from DB
@Entity
@Table(name = "employees")
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
    public Employee() {
    }

    // Parameterized Constructor
    public Employee(String name, double salary, String department) {
        this.name = name;
        this.salary = salary;
        this.department = department;
    }

    // Getters and Setters
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
    // getter method to get the name
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    // getter method to get the salary
    public double getSalary() {
        return salary;
    }

    // Setter method to set the salary
    public void setSalary(double salary) {
        this.salary = salary;
    }

    // getter method to get the department
    public String getDepartment() {
        return department;
    }

    // Setter method to set the details
    public void setDepartment(String department) {
        this.department = department;
    }

    // toString Method to override the reference and display the details
    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", salary=" + salary +
                ", department='" + department + '\'' +
                '}';
    }
}
