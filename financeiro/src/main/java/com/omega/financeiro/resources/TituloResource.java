package com.omega.financeiro.resources;

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
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author ENGCARVALHO
 */
@RestController
@RequestMapping(path = "/api/v1/titulo")
public class TituloResource {

    private static Logger logger = LoggerFactory.getLogger(TituloResource.class);
    
    @Autowired
    private Environment environment;
    
    @GetMapping(value = "/{id}", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<?> find(@PathVariable(value = "id") Integer id) {

        return new ResponseEntity<>("{\"response\": \"Hello World !!, It's my first service\"}",HttpStatus.ACCEPTED);
    }
    
    @GetMapping(value = "/movimentarTitulo", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<?> movimentarTitulo() {

        logger.info("PORT: "+environment.getProperty("local.server.port"));
        
        return new ResponseEntity<>("{\"response\": \"Title was moved successfully\"}",HttpStatus.ACCEPTED);
    }
}