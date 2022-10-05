package com.edu.icesi.ApiPruebaTecnica.api;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.bind.annotation.RequestMapping;

import com.edu.icesi.ApiPruebaTecnica.dto.DetalleDTO;
import com.edu.icesi.ApiPruebaTecnica.dto.ClienteDTO;
import com.edu.icesi.ApiPruebaTecnica.dto.FacturaDTO;
import com.edu.icesi.ApiPruebaTecnica.dto.ProductoDTO;

import java.util.List;

@RequestMapping("/factura")
public interface PruebaTecnicaAPI {

    @GetMapping("/detalle/{id_detalle}/{id_factura}")
    DetalleDTO getDetalle(@PathVariable(name = "id_detalle") int idDetalle, @PathVariable(name="id_factura") int idFactura);

    @PostMapping("/cliente")
    ClienteDTO createCliente(@RequestBody ClienteDTO clienteDTO);

    @PostMapping("/detalle")
    DetalleDTO createDetalle(@RequestBody DetalleDTO detalleDTO);

    @PostMapping("/factura")
    FacturaDTO createFactura(@RequestBody FacturaDTO facturaDTO);

    @PostMapping("/producto")
    ProductoDTO createProducto(@RequestBody ProductoDTO productoDTO);

    @GetMapping("/detalles")
    public List<DetalleDTO> getDetalles();

    @GetMapping("/clientes")
    public List<ClienteDTO> getClientes();

    @GetMapping("/facturas")
    public List<FacturaDTO> getFacturas();

    @GetMapping("/productos")
    public List<ProductoDTO> getProductos();
}//End PruebaTecnicaAPI
