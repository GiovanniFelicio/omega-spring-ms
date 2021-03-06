package com.omega.financeiro.resources.ms;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.omega.financeiro.resources.TituloResource;
import java.util.HashMap;
import java.util.Map;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author ENGCARVALHO
 */

@RestController
@RequestMapping(path = "/api/v1/ms/titulo")
public class TituloResourceMS {
    
    private static Logger logger = LoggerFactory.getLogger(TituloResource.class);
    
    @Autowired
    private Environment environment;
    
    @GetMapping(value = "/movimentarTitulo", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<?> movimentarTitulo() {

        logger.info("PORT: "+environment.getProperty("local.server.port"));
        
        Map<String, String> map = new HashMap<>();
        map.put("response", "Title was moved successfully");
        
        String json = "";
        
        try {
            json = new ObjectMapper().writeValueAsString(map);
        } catch (JsonProcessingException e) {
            System.out.println(e);
        }
        
        return new ResponseEntity<>(json, HttpStatus.ACCEPTED);
    }
    
}
