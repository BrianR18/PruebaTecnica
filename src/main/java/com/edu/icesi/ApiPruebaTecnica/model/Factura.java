package com.edu.icesi.ApiPruebaTecnica.model;

import java.time.LocalDate;
import java.util.UUID;

import javax.persistence.*;

import com.fasterxml.jackson.annotation.JsonFormat;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Table(name = "`factura`")
@Entity
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Factura {
    @Id
    @Column(name = "num_factura")
    private UUID numFactura;

    @Column(name = "id_cliente")
    private UUID id_cliente;
    
    @JsonFormat(pattern = "yyyy/MM/dd")
    private LocalDate fecha;
}//End Factura
