package com.org.galaapp.controller;

// src/main/java/controller/MovimientoController.java

import com.org.galaapp.entity.Movimiento;
import com.org.galaapp.service.MovimientoService;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/movimientos")
public class MovimientoController {
    private final MovimientoService service;

    public MovimientoController(MovimientoService service) {
        this.service = service;
    }

    @CrossOrigin(origins = "http://localhost:8080")
    @GetMapping
    public List<Movimiento> getAll() {
        return service.findAll();
    }

    @CrossOrigin(origins = "http://localhost:8080")
    @GetMapping("/{id}")
    public Optional<Movimiento> getById(@PathVariable Integer id) {
        return service.findById(id);
    }

    @CrossOrigin(origins = "http://localhost:8080")
    @PostMapping
    public Movimiento create(@RequestBody Movimiento movimiento) {
        return service.save(movimiento);
    }

    @CrossOrigin(origins = "http://localhost:8080")
    @DeleteMapping("/{id}")
    public void delete(@PathVariable Integer id) {
        service.deleteById(id);
    }
}