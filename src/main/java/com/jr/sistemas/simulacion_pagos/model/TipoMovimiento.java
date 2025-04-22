package com.jr.sistemas.simulacion_pagos.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Table(name = "TIPOMOVIMIENTO")
@Data
public class TipoMovimiento {
    
    @Id
    @Column(name = "CHR_TIPOCODIGO")
    private String codigo;

    @Column(name = "VCH_TIPODESCRIPCION", length = 40)
    private String descripcion;

    @Column(name = "VCH_TIPOACCION", length = 10)
    private String tipoAccion;

    @Column(name = "VCH_TIPOESTADO", length = 15)
    private String estado;

}
