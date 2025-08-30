// Servicio
package com.org.galaapp.service;
import com.org.galaapp.entity.Producto;
import com.org.galaapp.repository.ProductoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProductoService {

    @Autowired
    private ProductoRepository productoRepository;


    public List<Producto> obtenerTodosLosProductos() {
        return productoRepository.findAll();
    }

    public Optional<Producto> obtenerProductoPorId(Integer id) {
        return productoRepository.findById(id);
    }


    public Producto agregarProducto(Producto producto){
        return productoRepository.save(producto);
    }

    public void eliminarProducto(Integer id) {
        Optional<Producto> producto = productoRepository.findById(id);
        if (producto.isPresent()) {
            productoRepository.deleteById(id);
        } else {
            throw new RuntimeException("Producto no encontrado con ID: " + id);
        }
    }

    // src/main/java/com/org/galaapp/service/ProductoService.java
    public Producto actualizarCantidad(Integer id, Integer cantidad) {
        Producto producto = obtenerProductoPorId(id)
                .orElseThrow(() -> new RuntimeException("Producto no encontrado"));
        producto.setCantidad(cantidad);
        return agregarProducto(producto);
    }



//    public Optional<Producto> obtenerProductoPorId(Integer id) {
//        return productoRepository.findById(id);
//    }
//
//    public Producto guardarProducto(Producto producto) {
//        return productoRepository.save(producto);
//    }
//

}
