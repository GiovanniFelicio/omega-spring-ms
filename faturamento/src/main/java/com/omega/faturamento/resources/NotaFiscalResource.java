/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.omega.faturamento.resources;

import com.omega.faturamento.entities.NotaFiscal;
import com.omega.faturamento.services.NotaFiscalService;
import java.util.Optional;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author ENGCARVALHO
 */

@RestController
@RequestMapping(path = "/api/v1/notaFiscal", method = RequestMethod.GET)
public class NotaFiscalResource {
    
    @Autowired
    private NotaFiscalService notaFiscalService;
    
    @GetMapping(value = "/list", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<?> findAll() {
        return new ResponseEntity<>(notaFiscalService.findAll() , HttpStatus.ACCEPTED);
    }
    
    @GetMapping(value = "/{id}", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<?> find(@PathVariable("id") Long id) {
        
        Optional<NotaFiscal> optional = notaFiscalService.find(id);
        
        NotaFiscal nf = null;
        
        HttpStatus status = HttpStatus.ACCEPTED;
        
        if (!optional.isPresent()) {
            status = HttpStatus.UNPROCESSABLE_ENTITY;
        } else {
            nf = optional.get();
        }
        
        return new ResponseEntity<>(nf, status);
    }
    
    @GetMapping(value = "/faturar", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<?> faturar() {                
        
        notaFiscalService.movimentarFinanceiro();
        
        return new ResponseEntity<>("Successfully", HttpStatus.OK);
    }
}
