// Repositorio
package com.org.galaapp.repository;
import com.org.galaapp.entity.Producto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

import java.util.List;


public interface ProductoRepository extends JpaRepository<Producto, Integer> {

}
