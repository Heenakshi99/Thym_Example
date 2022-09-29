package com.example.thymleafeexample;

import com.example.thymleafeexample.entity.Employee;

import java.util.List;

public interface EmployeeService {

    void save(Employee employee);

    List<Employee> getAllEmployee();

    Employee getById(long id);

    void deleteById(long id);
}
