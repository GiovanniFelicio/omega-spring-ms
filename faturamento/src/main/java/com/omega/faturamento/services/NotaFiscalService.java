package com.omega.faturamento.services;

import com.omega.faturamento.entities.NotaFiscal;
import com.omega.faturamento.repositories.NotaFiscalRepository;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import com.omega.faturamento.feignclient.FinanceiroFeignClient;

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
    
    public void movimentarFinanceiro() {
        ResponseEntity res = financeiroTituloFeignClient.movimentarTitulo();
        
        System.out.println(res.getBody());
    }
}
