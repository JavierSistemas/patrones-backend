package com.jr.sistemas.simulacion_pagos.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.jr.sistemas.simulacion_pagos.dto.ClienteCuentaDTO;
import com.jr.sistemas.simulacion_pagos.model.Cliente;
import com.jr.sistemas.simulacion_pagos.repository.ClienteRepository;
import com.jr.sistemas.simulacion_pagos.service.ClienteService;

@Service
public class ClienteServiceImpl implements ClienteService{

    @Autowired
    private ClienteRepository repository;

    @Override
    public List<Cliente> clientes() {
        return repository.findAll();
    }

    @Override
    public List<ClienteCuentaDTO> detalleClientes(String codigo) {
        return repository.obtenerDetalleCliente(codigo); 
    }
    
}
