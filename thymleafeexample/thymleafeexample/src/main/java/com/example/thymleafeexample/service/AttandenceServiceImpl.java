package com.example.thymleafeexample.service;

import com.example.thymleafeexample.AttandenceService;
import com.example.thymleafeexample.entity.Attandance;
import com.example.thymleafeexample.entity.Employee;
import com.example.thymleafeexample.repository.AttandenceRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AttandenceServiceImpl implements AttandenceService {

    @Autowired
    AttandenceRepo attandenceRepo;

    @Override
    public void save(Attandance attandance) {
        attandenceRepo.save(attandance);
    }

    @Override
    public List<Employee> getAllEmployee() {
        return null;
    }
}
