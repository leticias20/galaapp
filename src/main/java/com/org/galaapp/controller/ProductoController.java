package com.org.galaapp.controller;

import com.org.galaapp.entity.Producto;
import com.org.galaapp.service.ProductoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

// Controlador
@RestController
@RequestMapping("/api/productos")
public class ProductoController {
    @Autowired
    private ProductoService productoService;

    @GetMapping
    public List<Producto> obtenerTodosLosProductos() {
        return productoService.obtenerTodosLosProductos();
    }

//    @GetMapping("/{id}")
//    public ResponseEntity<Producto> obtenerProductoPorId(@PathVariable Integer id) {
//        return productoService.obtenerProductoPorId(id)
//                .map(ResponseEntity::ok)
//                .orElse(ResponseEntity.status(HttpStatus.NOT_FOUND).build());
//    }
//
//    @PostMapping
//    public Producto crearProducto(@RequestBody Producto producto) {
//        return productoService.guardarProducto(producto);
//    }
//
//    @PutMapping("/{id}")
//    public ResponseEntity<Producto> actualizarProducto(@PathVariable Long id, @RequestBody Producto producto) {
//        return productoService.obtenerProductoPorId(id)
//                .map(productoExistente -> {
//                    producto.setIdProducto(id);
//                    return ResponseEntity.ok(productoService.guardarProducto(producto));
//                })
//                .orElse(ResponseEntity.status(HttpStatus.NOT_FOUND).build());
//    }
//
//    @DeleteMapping("/{id}")
//    public ResponseEntity<Void> eliminarProducto(@PathVariable Long id) {
//        if (productoService.obtenerProductoPorId(id).isPresent()) {
//            productoService.eliminarProducto(id);
//            return ResponseEntity.ok().build();
//        } else {
//            return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
//        }
//    }
}
