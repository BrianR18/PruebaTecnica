package com.edu.icesi.ApiPruebaTecnica.controller;

import org.springframework.web.bind.annotation.RestController;

import com.edu.icesi.ApiPruebaTecnica.api.PruebaTecnicaAPI;
import com.edu.icesi.ApiPruebaTecnica.dto.ClienteDTO;
import com.edu.icesi.ApiPruebaTecnica.dto.DetalleDTO;
import com.edu.icesi.ApiPruebaTecnica.dto.FacturaDTO;
import com.edu.icesi.ApiPruebaTecnica.dto.ProductoDTO;
import com.edu.icesi.ApiPruebaTecnica.service.PruebaTecnicaService;
import com.edu.icesi.ApiPruebaTecnica.mapper.PruebaTecnicaMapper;

import lombok.AllArgsConstructor;
import java.util.*;

@AllArgsConstructor
@RestController
public class PruebaTecnicaController implements PruebaTecnicaAPI{
    private final PruebaTecnicaService service;
    private final PruebaTecnicaMapper mapper;

    @Override
    public DetalleDTO getDetalle(UUID idDetalle, UUID idFactura) {
        return mapper.fromDetalle(service.getDetalle(idDetalle, idFactura));
    }

    @Override
    public ClienteDTO createCliente(ClienteDTO clienteDTO) {
        return mapper.fromCliente(service.createCliente(mapper.fromClienteDTO(clienteDTO)));
    }

    @Override
    public ProductoDTO createProducto(ProductoDTO productoDTO) {
        return mapper.fromProducto(service.createProducto(mapper.fromProductoDTO(productoDTO)));
    }

    @Override
    public FacturaDTO createFactura(FacturaDTO facturaDTO) {
        return mapper.fromFactura(service.createFactura(mapper.fromFacturaDTO(facturaDTO)));
    }

    @Override
    public DetalleDTO createDetalle(DetalleDTO detalleDTO) {
        return mapper.fromDetalle(service.createDetalle(mapper.fromDetalleDTO(detalleDTO)));
    }

    @Override
    public List<DetalleDTO> getDetalles() {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public List<ClienteDTO> getClientes() {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public List<FacturaDTO> getFacturas() {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public List<ProductoDTO> getProductos() {
        // TODO Auto-generated method stub
        return null;
    }
}//End PruebaTecnicaController
