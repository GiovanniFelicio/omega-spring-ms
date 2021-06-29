package com.omega.faturamento.feignclient;

import feign.Headers;
import feign.Param;
import java.net.URI;
import java.util.Arrays;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

/**
 *
 * @author ENGCARVALHO
 */

@Component
public class CategoryFeignClient {
    
    @Autowired
    private RestTemplate restTemplate;
    
    public ResponseEntity<?> movimentarTitulo(URI uri, HttpEntity httpEntity) {
        
        return restTemplate.exchange(uri, HttpMethod.GET, httpEntity, Object[].class);
    }
    
}
