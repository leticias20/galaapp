package com.org.galaapp.service;

// src/main/java/service/MovimientoService.java

import com.org.galaapp.entity.Movimiento;
import com.org.galaapp.repository.MovimientoRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class MovimientoService {
    private final MovimientoRepository repository;

    public MovimientoService(MovimientoRepository repository) {
        this.repository = repository;
    }

    public List<Movimiento> findAll() {
        return repository.findAll();
    }

    public Optional<Movimiento> findById(Integer id) {
        return repository.findById(id);
    }

    public Movimiento save(Movimiento movimiento) {
        return repository.save(movimiento);
    }

    public void deleteById(Integer id) {
        repository.deleteById(id);
    }
}
