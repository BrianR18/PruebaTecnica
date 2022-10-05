package com.edu.icesi.ApiPruebaTecnica.mapper;

import org.mapstruct.Mapper;
import com.edu.icesi.ApiPruebaTecnica.dto.ClienteDTO;
import com.edu.icesi.ApiPruebaTecnica.dto.DetalleDTO;
import com.edu.icesi.ApiPruebaTecnica.dto.FacturaDTO;
import com.edu.icesi.ApiPruebaTecnica.dto.ProductoDTO;
import com.edu.icesi.ApiPruebaTecnica.model.Cliente;
import com.edu.icesi.ApiPruebaTecnica.model.Detalle;
import com.edu.icesi.ApiPruebaTecnica.model.Factura;
import com.edu.icesi.ApiPruebaTecnica.model.Producto;

@Mapper(componentModel = "spring")
public interface PruebaTecnicaMapper {
    Cliente fromClienteDTO(ClienteDTO clienteDTO);
    ClienteDTO fromCliente(Cliente cliente);
    Detalle fromDetalleDTO(DetalleDTO detalleDTO);
    DetalleDTO fromCliente(Detalle detalle);
    Factura fromFacturaDTO(FacturaDTO facturaDTO);
    FacturaDTO fromCliente(Factura factura);
    Producto fromProductoDTO(ProductoDTO productoDTO);
    ProductoDTO fromCliente(Producto producto);
}//End PruebaTecnicaMapper
