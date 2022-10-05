package com.edu.icesi.ApiPruebaTecnica.repository;

import java.util.UUID;

import org.aspectj.apache.bcel.classfile.InnerClass;
import org.springframework.data.repository.CrudRepository;

import com.edu.icesi.ApiPruebaTecnica.model.Cliente;

public interface ClienteRepository extends CrudRepository<Cliente, UUID>{
}