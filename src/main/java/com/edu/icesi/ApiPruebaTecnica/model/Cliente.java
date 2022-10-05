package com.edu.icesi.ApiPruebaTecnica.model;

import java.time.LocalDate;
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
@Table(name = "`cliente`")
@Entity
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Cliente {
    @Id
    @Column(name = "cliente")
    private UUID idCliente;

    @Column(name = "nombre")
    private String name;

    @Column(name = "apellido")
    private String lastName;

    @Column(name = "direccion")
    private String address;

    @Column(name = "fecha_nacimiento")
    private LocalDate bornDate;

    @Column(name = "telefono")
    private int phoneNumber;

    @Column(name = "email")
    private String email;

    @Column(name = "categoria")
    private String category;
}
