package com.edu.icesi.ApiPruebaTecnica.model;

import java.util.UUID;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Table(name = "`producto`")
@Entity
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Producto {
    @Id
    @Column(name = "id_producto")
    private UUID idProducto;

    @Column(name = "nombre")
    private String name;
    
    @Column(name = "precio")
    private double price;

    @Column(name = "stock")
    private int stock;
}
