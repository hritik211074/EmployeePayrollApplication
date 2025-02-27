package com.example.EmployeePayrollApplication.service;
import com.example.EmployeePayrollApplication.dto.EmployeeDTO;
import com.example.EmployeePayrollApplication.entity.Employee;
import com.example.EmployeePayrollApplication.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeService {

    @Autowired
    private EmployeeRepository employeeRepository;

    public List<Employee> getAllEmployees() {
        return employeeRepository.findAll();
    }

    public Employee getEmployeeById(Long id) {
        return employeeRepository.findById(id).orElse(null);
    }

    public Employee addEmployee(EmployeeDTO employeeDTO) {
        Employee emp=new Employee();
        emp.setName(employeeDTO.getName());
        emp.setSalary(employeeDTO.getSalary());
        emp.setDepartment(employeeDTO.getDepartment());
        return employeeRepository.save(emp);
    }
    public Employee updateEmployee(Long id, EmployeeDTO updatedEmployeeDTO) {
        Employee employee = employeeRepository.findById(id).orElse(null);
        if (employee != null) {
            employee.setName(updatedEmployeeDTO.getName());
            employee.setDepartment(updatedEmployeeDTO.getDepartment());
            employee.setSalary(updatedEmployeeDTO.getSalary());
            return employeeRepository.save(employee);
        }
        return null;
    }

    public void deleteEmployee(Long id) {
        employeeRepository.deleteById(id);
    }
}