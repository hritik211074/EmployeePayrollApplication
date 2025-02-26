package com.example.EmployeePayrollApplication.Exception;

// Created a custom Exception class to provide custom exception messages
public class ResourceNotFoundException extends RuntimeException {
    public ResourceNotFoundException(String message) {
        // Passing custom messages to exception class
        super(message);
    }
}