package com.spring.Employee.Service;

import com.spring.Employee.Entity.Employee;

import java.util.List;
import java.util.Optional;

public interface EmployeeService {

    Employee saveEmployee(Employee employee);

    List<Employee> getAllEmployee();

    Optional<Employee> getAllEmployeeById(Long id);
}
