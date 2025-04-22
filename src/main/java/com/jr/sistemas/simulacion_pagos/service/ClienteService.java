package com.jr.sistemas.simulacion_pagos.service;

import java.util.List;
import com.jr.sistemas.simulacion_pagos.dto.ClienteCuentaDTO;
import com.jr.sistemas.simulacion_pagos.model.Cliente;

public interface ClienteService {
    List<Cliente> clientes();
    // Método para obtener el detalle del cliente y su cuenta.
    List<ClienteCuentaDTO> detalleClientes(String codigo);
}
