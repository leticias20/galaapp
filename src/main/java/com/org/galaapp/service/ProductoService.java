// Servicio
package com.org.galaapp.service;
import com.org.galaapp.entity.Producto;
import com.org.galaapp.repository.ProductoRepository;
import org.hibernate.service.spi.InjectService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;
import java.util.Optional;

@Service
public class ProductoService {

    @Autowired
    private ProductoRepository productoRepository;


    public List<Producto> obtenerTodosLosProductos() {
        return productoRepository.findAll();
    }


    public Producto agregarProducto(Producto producto){
        return productoRepository.save(producto);
    }



//    public Optional<Producto> obtenerProductoPorId(Integer id) {
//        return productoRepository.findById(id);
//    }
//
//    public Producto guardarProducto(Producto producto) {
//        return productoRepository.save(producto);
//    }
//
//    public void eliminarProducto(Long id) {
//        productoRepository.deleteById(id);
//    }
}
