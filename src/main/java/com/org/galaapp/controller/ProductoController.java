package com.org.galaapp.controller;

import com.org.galaapp.entity.Producto;
import com.org.galaapp.service.ProductoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

// Controlador
@RestController
@RequestMapping("/api/productos")
public class ProductoController {
    @Autowired
    private ProductoService productoService;

    @CrossOrigin(origins = "http://localhost:8080")
    @GetMapping
    public List<Producto> obtenerTodosLosProductos() {
        return productoService.obtenerTodosLosProductos();
    }

    // Agregar un producto
    @CrossOrigin(origins = "http://localhost:8080")
    @PostMapping
    public Producto agregarProducto(@RequestBody Producto producto) {
        return productoService.agregarProducto(producto);
    }

    //Eliminar un producto
    @DeleteMapping("/{id}")
    @CrossOrigin(origins = "http://localhost:8080")
    public ResponseEntity<String> eliminarProducto(@PathVariable Integer id) {
        try {
            productoService.eliminarProducto(id);
            return ResponseEntity.ok("Producto eliminado correctamente");
        } catch (RuntimeException e) {
            return ResponseEntity.status(404).body(e.getMessage());
        }
    }

    @GetMapping("/{id}")
    public ResponseEntity<Producto> obtenerProductoPorId(@PathVariable Integer id) {
        return productoService.obtenerProductoPorId(id)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.status(HttpStatus.NOT_FOUND).build());
    }



    @PutMapping("/{id}")
    public ResponseEntity<Producto> actualizarProducto(@PathVariable Integer id, @RequestBody Producto producto) {
        return productoService.obtenerProductoPorId(id)
                .map(productoExistente -> {
                    producto.setIdProducto(id); // importante para mantener el ID original
                    return ResponseEntity.ok(productoService.agregarProducto(producto));
                })
                .orElse(ResponseEntity.status(HttpStatus.NOT_FOUND).build());
    }


}
