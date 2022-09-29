package com.example.thymleafeexample;

import com.example.thymleafeexample.entity.Attandance;
import com.example.thymleafeexample.entity.Employee;

import java.util.List;

public interface AttandenceService {

    void save(Attandance attandance);

    List<Employee> getAllEmployee();
}
