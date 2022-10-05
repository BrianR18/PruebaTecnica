package com.edu.icesi.ApiPruebaTecnica.repository;

import org.springframework.data.repository.CrudRepository;

import com.edu.icesi.ApiPruebaTecnica.model.Detalle;
import com.edu.icesi.ApiPruebaTecnica.model.DetalleLlave;

public interface DetalleRepository extends CrudRepository<Detalle, DetalleLlave>{
    
}
