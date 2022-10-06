/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.prueba.models;

/**
 *
 * @author ISTA
 */
public class Cliente {
   
private Long id;
private String dni;
private String no9mbre;
private String apellido;
private String telefono;

    public Cliente() {
    }

    public Cliente(Long id, String dni, String no9mbre, String apellido, String telefono) {
        this.id = id;
        this.dni = dni;
        this.no9mbre = no9mbre;
        this.apellido = apellido;
        this.telefono = telefono;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getNo9mbre() {
        return no9mbre;
    }

    public void setNo9mbre(String no9mbre) {
        this.no9mbre = no9mbre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

 
}
