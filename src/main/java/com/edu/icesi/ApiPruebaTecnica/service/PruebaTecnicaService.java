package com.edu.icesi.ApiPruebaTecnica.service;


import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.*;

import com.edu.icesi.ApiPruebaTecnica.model.Detalle;
import com.edu.icesi.ApiPruebaTecnica.model.Cliente;
import com.edu.icesi.ApiPruebaTecnica.model.Factura;
import com.edu.icesi.ApiPruebaTecnica.model.Producto;

public interface PruebaTecnicaService {

    Detalle getDetalle(@PathVariable(name = "id_detalle") UUID detalleId, @PathVariable(name="id_factura") UUID FacturaId);

    Cliente createCliente(@RequestBody Cliente clienteDTO);

    Detalle createDetalle(@RequestBody Detalle detalleDTO);

    Factura createFactura(@RequestBody Factura facturaDTO);

    Producto createProducto(@RequestBody Producto productoDTO);

    public List<Detalle> getDetalles();

    public List<Cliente> getClientes();

    public List<Factura> getFacturas();

    public List<Producto> getProductos();

}//End ToucanService