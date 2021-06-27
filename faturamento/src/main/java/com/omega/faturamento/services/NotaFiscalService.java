package com.omega.faturamento.services;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.omega.faturamento.entities.NotaFiscal;
import com.omega.faturamento.repositories.NotaFiscalRepository;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import com.omega.faturamento.feignclient.FinanceiroFeignClient;
import org.springframework.http.HttpStatus;

/**
 *
 * @author ENGCARVALHO
 */

@Service
public class NotaFiscalService {
    
    @Autowired
    private FinanceiroFeignClient financeiroTituloFeignClient;
    
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
    
    public ResponseEntity unavailable() {
        return new ResponseEntity("O Serviço 'Financeiro' está temporariamente indisponível", HttpStatus.SERVICE_UNAVAILABLE);
    }
}
