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
@Table(name = "`detalle`")
@Entity
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Detalle {
    @Id
    @Column(name = "id_factura")
    private UUID idBill;

    @Id
    @Column(name = "num_detalle")
    private UUID numDetail;
    
    @Column(name = "id_producto")
    private UUID idProduct;

    @Column(name = "cantidad")
    private int amount;

    @Column(name = "precio")
    private double price;
}
