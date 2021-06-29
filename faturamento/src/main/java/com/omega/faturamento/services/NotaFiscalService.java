package com.omega.faturamento.services;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.omega.faturamento.entities.NotaFiscal;
import com.omega.faturamento.feignclient.CategoryFeignClient;
import com.omega.faturamento.repositories.NotaFiscalRepository;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import com.omega.faturamento.feignclient.FinanceiroFeignClient;
import java.net.URI;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.web.util.UriComponents;
import org.springframework.web.util.UriComponentsBuilder;

/**
 *
 * @author ENGCARVALHO
 */

@Service
public class NotaFiscalService {
    
    @Autowired
    private FinanceiroFeignClient financeiroTituloFeignClient;
    
    @Autowired
    private CategoryFeignClient categoryFeignClient;
    
    @Autowired
    private NotaFiscalRepository notaFiscalRepository;
    
    public List<NotaFiscal> findAll() {
        return notaFiscalRepository.findAll();
    }
    
    public Optional<NotaFiscal> find(Long id) {
        return notaFiscalRepository.findById(id);
    }
    
    @HystrixCommand(fallbackMethod = "unavailable")
    public ResponseEntity movimentarFinanceiro() {
        return financeiroTituloFeignClient.movimentarTitulo();
    }
    
    @HystrixCommand(fallbackMethod = "unavailableCategory")
    public ResponseEntity teste() {
        Map<String,Object> parameters = new HashMap<>();
        parameters.put("categoryLevels", "10");
        
        UriComponents uriComponents = UriComponentsBuilder.newInstance()
                .scheme("https")
                .host("apiexamples.vtexcommercestable.com.br")
                .path("/api/catalog_system/pub/category/tree/{categoryLevels}")
                .uriVariables(parameters)
                .build();
        
        HttpHeaders headers = new HttpHeaders();
        headers.setAccept(Arrays.asList(new MediaType[]{MediaType.APPLICATION_JSON}));
        headers.setContentType(MediaType.APPLICATION_JSON);
        headers.add("X-VTEX-API-AppKey", "vtexappkey-apiexamples-YSTRGZ");
        headers.add("X-VTEX-API-AppToken", "NWODMMOJAQCQIBTJXZWATALOAXDMHSMRCGECIFYXJEWQOLFMNKPSUCTNKZDPICCHDLNCXQBSBYQODVAORRYWCUXZMRSIBJOHCONDYDPXJXRVMEJOZPXRDFEINNPFYSRR");

        HttpEntity httpEntity = new HttpEntity("parameters", headers);

        URI uri = uriComponents.toUri();
        
        return categoryFeignClient.movimentarTitulo(uri, httpEntity);
    }
    
    public ResponseEntity unavailable() {
        return new ResponseEntity("O Serviço 'Financeiro' está temporariamente indisponível", HttpStatus.SERVICE_UNAVAILABLE);
    }
    
    public ResponseEntity unavailableCategory() {
        return new ResponseEntity("O Enpoint de 'Category' está temporariamente indisponível", HttpStatus.SERVICE_UNAVAILABLE);
    }
}
