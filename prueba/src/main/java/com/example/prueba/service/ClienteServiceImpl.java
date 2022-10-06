/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.prueba.service;

import com.example.prueba.models.Cliente;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Service;
import com.example.prueba.repository.ClienteRepository;

/**
 *
 * @author ISTA
 */
@Service
public class ClienteServiceImpl extends GenericServiceImpl<Cliente, Long> implements ClienteService{
    @Autowired
    ClienteRepository seguimientoRepository;

    @Override
    public CrudRepository<Cliente, Long> getDao() {
        return seguimientoRepository;
    }
}
