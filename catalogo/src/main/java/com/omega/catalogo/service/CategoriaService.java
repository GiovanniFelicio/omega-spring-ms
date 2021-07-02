package com.omega.catalogo.service;

import com.omega.catalogo.repository.CategoriaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author ENGCARVALHO
 */
@Service
public class CategoriaService {
    
    @Autowired
    private CategoriaRepository categoriaRepository;
    
}
