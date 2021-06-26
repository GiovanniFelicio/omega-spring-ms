package com.omega.faturamento.repositories;

import com.omega.faturamento.entities.NotaFiscal;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 *
 * @author ENGCARVALHO
 */
public interface NotaFiscalRepository extends JpaRepository<NotaFiscal, Long>{
    
}
