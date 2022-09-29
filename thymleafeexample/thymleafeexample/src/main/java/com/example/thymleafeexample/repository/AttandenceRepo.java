package com.example.thymleafeexample.repository;

import com.example.thymleafeexample.entity.Attandance;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AttandenceRepo extends JpaRepository<Attandance, Long> {
}
