/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.example.prueba.repository;

import com.example.prueba.models.Cliente;
import org.springframework.data.mongodb.repository.MongoRepository;

/**
 *
 * @author ISTA
 */
public interface ClienteRepository extends MongoRepository<Cliente, Long>{
    
}
