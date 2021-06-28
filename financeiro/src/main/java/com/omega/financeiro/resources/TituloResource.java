package com.omega.financeiro.resources;

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
    
    @GetMapping(value = "/{id}", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<?> find(@PathVariable(value = "id") Integer id) {

        return new ResponseEntity<>("{\"response\": \"Hello World !!, It's my first service\"}",HttpStatus.ACCEPTED);
    }
}