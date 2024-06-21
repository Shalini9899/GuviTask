package com.spring.Employee.Service.ServiceIMPL;

import com.spring.Employee.Entity.Employee;
import com.spring.Employee.Repository.EmployeeRepository;
import com.spring.Employee.Service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class EmployeeServiceIMPL implements EmployeeService {
    @Autowired
    private EmployeeRepository employeeRepository;

    @Override
    public Employee saveEmployee(Employee employee){
        return employeeRepository.save(employee);
    }

    @Override
    public List<Employee> getAllEmployee(){
        return  employeeRepository.findAll();
    }

    @Override
    public Optional<Employee> getAllEmployeeById(Long id){
        return employeeRepository.findById(id);
    }
}
