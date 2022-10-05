package com.edu.icesi.ApiPruebaTecnica.dto;

import java.time.LocalDate;
import java.util.UUID;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class ClienteDTO {
    
    private UUID idCliente;

    private String name;

    private String lastName;

    private String address;

    private LocalDate bornDate;

    private int phoneNumber;

    private String email;

    private String category;
}
