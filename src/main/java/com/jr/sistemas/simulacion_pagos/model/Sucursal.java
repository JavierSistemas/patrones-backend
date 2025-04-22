package com.jr.sistemas.simulacion_pagos.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "SUCURSAL")
public class Sucursal {
    @Id
    @Column(name = "CHR_SUCUCODIGO")
    private String codigo;

    @Column(name = "VCH_SUCUNOMBRE")
    private String nombre;

    @Column(name = "VCH_SUCUCIUDAD")
    private String ciudad;

    @Column(name = "VCH_SUCUDIRECCION")
    private String direccion;

    @Column(name = "INT_SUCUCONTCUENTA")
    private Integer cuentas;
    
}
