/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.prueba.models;

/**
 *
 * @author ISTA
 */
public class Factura {

private Long id;
private String id_clientes;
private int num_facturas;
private String fecha;

    public Factura() {
    }

    public Factura(Long id, String id_clientes, int num_facturas, String fecha) {
        this.id = id;
        this.id_clientes = id_clientes;
        this.num_facturas = num_facturas;
        this.fecha = fecha;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getId_clientes() {
        return id_clientes;
    }

    public void setId_clientes(String id_clientes) {
        this.id_clientes = id_clientes;
    }

    public int getNum_facturas() {
        return num_facturas;
    }

    public void setNum_facturas(int num_facturas) {
        this.num_facturas = num_facturas;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }


    
}
