/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.prueba.controller;

import com.example.prueba.models.Factura;
import com.example.prueba.models.Producto;
import com.example.prueba.service.FacturaService;
import com.example.prueba.service.ProductoService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author ISTA
 */

@RestController
@RequestMapping("/api/factura")
public class FacturaController {

@Autowired
    FacturaService facturaService;

 @GetMapping("/lista")
    public ResponseEntity<List<Factura>> listar() {
        return new ResponseEntity<>(facturaService.findByAll(), HttpStatus.OK);
    }

    @GetMapping("/buscar/{id}")
    public ResponseEntity<Factura> buscar(@PathVariable Long id) {
        return new ResponseEntity<>(facturaService.findById(id), HttpStatus.OK);
    }

    @PostMapping("/crear")
    public ResponseEntity<Factura> crear(@RequestBody Factura e) {
        return new ResponseEntity<>(facturaService.save(e), HttpStatus.CREATED);
    }

    @DeleteMapping("/eliminar/{id}")
    public ResponseEntity<Factura> eliminar(@PathVariable Long id) {
        facturaService.delete(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }

    @PutMapping("/actualizar/{id}")
    public ResponseEntity<Factura> actualizar(@PathVariable Long id, @RequestBody Factura e) {
        Factura p = facturaService.findById(id);
        if (p == null) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        } else {
            try {
                p.setNum_facturas(e.getNum_facturas());
                p.setFecha(e.getFecha());
             
            


                return new ResponseEntity<>(facturaService.save(e), HttpStatus.OK);
            } catch (Exception ex) {
                return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
            }

        }
    
}
}
