package com.edu.icesi.ApiPruebaTecnica.repository;

import java.util.UUID;

import org.springframework.data.repository.CrudRepository;

import com.edu.icesi.ApiPruebaTecnica.model.Factura;

public interface FacturaRepository extends CrudRepository<Factura, UUID>{
    
}
