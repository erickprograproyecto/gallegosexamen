/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.prueba.service;
import com.example.prueba.models.Producto;
import java.io.Serializable;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Service;
import com.example.prueba.repository.ProductoRepository;
/**
 *
 * @author ISTA
 */
@Service
public class ProductoServiceImpl extends GenericServiceImpl<Producto, Long> implements ProductoService{

 @Autowired
    ProductoRepository proyectoRepository;

    @Override
    public CrudRepository<Producto, Long> getDao() {
        return proyectoRepository;
    }
    
    
}
