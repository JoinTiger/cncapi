package com.example.demo.repository;

import com.example.demo.bean.Motor;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MotorRepository extends JpaRepository<Motor, Long> {
}
