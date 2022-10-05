package com.edu.icesi.ApiPruebaTecnica.dto;

import java.time.LocalDate;
import java.util.UUID;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class FacturaDTO {
    
    private UUID numBill;

    private UUID id_cliente;
    
    private LocalDate fecha;
}
