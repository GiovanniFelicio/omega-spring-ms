/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.omega.faturamento.feignclient;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;

/**
 *
 * @author ENGCARVALHO
 */

@Component
@FeignClient(name = "financeiro", path = "/api/v1")
public interface FinanceiroFeignClient {
    
    @GetMapping(value = "/titulo/movimentarTitulo", produces = MediaType.APPLICATION_JSON_VALUE)
    ResponseEntity<?> movimentarTitulo();
    
}
