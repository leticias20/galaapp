package com.org.galaapp.repository;

// src/main/java/repository/MovimientoRepository.java

import com.org.galaapp.entity.Movimiento;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MovimientoRepository extends JpaRepository<Movimiento, Integer> {
}