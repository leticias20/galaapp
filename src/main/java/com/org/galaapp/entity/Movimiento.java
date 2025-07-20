package com.org.galaapp.entity;

// src/main/java/entity/Movimiento.java

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

import jakarta.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name = "movimiento", schema = "gala")
public class Movimiento {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id_movimiento;

    private String tipo;
    private Integer id_producto;
    private Integer cantidad;
    private LocalDate fecha;

    // Getters y setters
    public Integer getId_movimiento() { return id_movimiento; }
    public void setId_movimiento(Integer id_movimiento) { this.id_movimiento = id_movimiento; }
    public String getTipo() { return tipo; }
    public void setTipo(String tipo) { this.tipo = tipo; }
    public Integer getId_producto() { return id_producto; }
    public void setId_producto(Integer id_producto) { this.id_producto = id_producto; }
    public Integer getCantidad() { return cantidad; }
    public void setCantidad(Integer cantidad) { this.cantidad = cantidad; }
    public LocalDate getFecha() { return fecha; }
    public void setFecha(LocalDate fecha) { this.fecha = fecha; }
}
