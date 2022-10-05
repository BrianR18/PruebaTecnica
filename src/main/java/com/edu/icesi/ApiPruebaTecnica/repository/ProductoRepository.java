package com.edu.icesi.ApiPruebaTecnica.repository;

import java.util.UUID;

import org.springframework.data.repository.CrudRepository;

import com.edu.icesi.ApiPruebaTecnica.model.Producto;

public interface ProductoRepository extends CrudRepository<Producto, UUID>{
    
}
