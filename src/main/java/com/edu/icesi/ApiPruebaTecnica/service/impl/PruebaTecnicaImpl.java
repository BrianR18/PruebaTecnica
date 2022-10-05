package com.edu.icesi.ApiPruebaTecnica.service.impl;

import com.edu.icesi.ApiPruebaTecnica.dto.ClienteDTO;
import com.edu.icesi.ApiPruebaTecnica.dto.DetalleDTO;
import com.edu.icesi.ApiPruebaTecnica.dto.FacturaDTO;
import com.edu.icesi.ApiPruebaTecnica.dto.ProductoDTO;
import com.edu.icesi.ApiPruebaTecnica.model.Cliente;
import com.edu.icesi.ApiPruebaTecnica.model.Detalle;
import com.edu.icesi.ApiPruebaTecnica.model.Factura;
import com.edu.icesi.ApiPruebaTecnica.model.Producto;
import com.edu.icesi.ApiPruebaTecnica.model.DetalleLlave;
import com.edu.icesi.ApiPruebaTecnica.service.PruebaTecnicaService;

import com.edu.icesi.ApiPruebaTecnica.repository.ClienteRepository;
import com.edu.icesi.ApiPruebaTecnica.repository.FacturaRepository;
import com.edu.icesi.ApiPruebaTecnica.repository.ProductoRepository;
import com.edu.icesi.ApiPruebaTecnica.repository.DetalleRepository;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.StreamSupport;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.context.annotation.Primary;

@Service
@AllArgsConstructor
@Primary
public class PruebaTecnicaImpl implements PruebaTecnicaService{

    private final ClienteRepository clienteRepository;
    private final FacturaRepository facturaRepository;
    private final ProductoRepository productoRepository;
    private final DetalleRepository detalleRepository;

    @Override
    public Detalle getDetalle(UUID detalleId, UUID FacturaId) {
        Detalle det = detalleRepository.findById(new DetalleLlave(detalleId, FacturaId)).orElse(null);
        if(det != null) {
            if(det.getAmount() >= 5 && det.getPrice() >= 1000000)
                det.setPrice(det.getPrice() * 0.9);
        }
        return det;
    }

    @Override
    public Cliente createCliente(Cliente clienteDTO) {
        return clienteRepository.save(clienteDTO);
    }

    @Override
    public Detalle createDetalle(Detalle detalleDTO) {
        return detalleRepository.save(detalleDTO);
    }

    @Override
    public Factura createFactura(Factura facturaDTO) {
        return facturaRepository.save(facturaDTO);
    }

    @Override
    public Producto createProducto(Producto productoDTO) {
        return productoRepository.save(productoDTO);
    }

    @Override
    public List<Detalle> getDetalles() {
        return StreamSupport.stream(detalleRepository.findAll().spliterator(),false).collect(Collectors.toList());
    }

    @Override
    public List<Cliente> getClientes() {
        return StreamSupport.stream(clienteRepository.findAll().spliterator(),false).collect(Collectors.toList());
    }

    @Override
    public List<Factura> getFacturas() {
        return StreamSupport.stream(facturaRepository.findAll().spliterator(),false).collect(Collectors.toList());
    }

    @Override
    public List<Producto> getProductos() {
        return StreamSupport.stream(productoRepository.findAll().spliterator(),false).collect(Collectors.toList());
    }

}
