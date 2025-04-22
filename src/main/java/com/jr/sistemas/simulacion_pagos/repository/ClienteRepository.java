package com.jr.sistemas.simulacion_pagos.repository;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import com.jr.sistemas.simulacion_pagos.dto.ClienteCuentaDTO;
import com.jr.sistemas.simulacion_pagos.model.Cliente;

@Repository
public interface ClienteRepository  extends JpaRepository<Cliente, String>{
    
    List<Cliente> findAll();

    // Detalle del cliente
    @Query(value = """
            SELECT  c.chr_cliecodigo AS codigo,
                    c.vch_cliepaterno AS paterno,
                    c.vch_cliematerno AS materno,
                    c.vch_clienombre AS nombre,
                    c.vch_clieciudad AS ciudad,
                    c.vch_cliedireccion AS direccion,
                    c.vch_clietelefono AS telefono,
                    s.dec_cuensaldo as saldo,
                    s.vch_cuenestado as estado,
                    m.vch_monedescripcion AS moneda,
                    s1.vch_sucunombre AS sucursal
            FROM cliente c
            INNER JOIN cuenta s
            ON c.chr_cliecodigo = s.chr_cliecodigo
            INNER JOIN moneda m
            ON m.chr_monecodigo = s.chr_monecodigo
            INNER JOIN sucursal s1
            ON s1.chr_sucucodigo = s.chr_sucucodigo
            WHERE c.chr_cliecodigo= :codigo
            """, nativeQuery = true)
    List<ClienteCuentaDTO> obtenerDetalleCliente(@Param("codigo") String codigo);

}
