package com.example.thymleafeexample.service;

import com.example.thymleafeexample.EmployeeService;
import com.example.thymleafeexample.entity.Employee;
import com.example.thymleafeexample.repository.EmployeeRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class EmployeeServiceImpl implements EmployeeService {

    @Autowired
    EmployeeRepo employeeRepo;

    @Override
    public void save(Employee employee) {
        employeeRepo.save(employee);
    }

    @Override
    public List<Employee> getAllEmployee() {
        return employeeRepo.findAll();
    }

    @Override
    public Employee getById(long id) {
        Optional<Employee> optional = employeeRepo.findById(id);
        Employee emp = null;
        if(optional.isPresent()){
          emp = optional.get();
        }else{
            throw new RuntimeException(
                    "Employee not found for id : " + id);
        }
        return emp;
    }

    @Override
    public void deleteById(long id) {
        employeeRepo.deleteById(id);
    }
}
