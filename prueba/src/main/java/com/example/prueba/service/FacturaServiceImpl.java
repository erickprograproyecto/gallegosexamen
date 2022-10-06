/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.prueba.service;

import com.example.prueba.models.Cliente;
import com.example.prueba.models.Factura;
import com.example.prueba.repository.FacturaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.CrudRepository;

/**
 *
 * @author ISTA
 */
public class FacturaServiceImpl extends GenericServiceImpl<Factura, Long> implements FacturaService {
    
 @Autowired
    FacturaRepository facturaRepository;

    @Override
    public CrudRepository<Factura, Long> getDao() {
        return facturaRepository;
    }
}
