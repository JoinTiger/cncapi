package com.example.demo.repository;

import com.example.demo.bean.Servo;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ServoRepository extends JpaRepository<Servo, Long> {
}
