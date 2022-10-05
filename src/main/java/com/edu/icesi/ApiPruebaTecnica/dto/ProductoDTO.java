package com.edu.icesi.ApiPruebaTecnica.dto;

import java.util.UUID;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class ProductoDTO {
    private UUID idProducto;

    private String name;

    private double price;

    private int stock;
}
