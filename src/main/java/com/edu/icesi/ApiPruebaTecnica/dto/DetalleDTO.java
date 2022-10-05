package com.edu.icesi.ApiPruebaTecnica.dto;

import java.util.UUID;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class DetalleDTO {
    private UUID idBill;

    private UUID numDetail;
    
    private UUID idProduct;

    private int amount;

    private double price;
}
