package com.omega.catalogo.resource;

import com.omega.catalogo.service.CategoriaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author ENGCARVALHO
 */
@RestController
public class CategoriaResource {
    
    @Autowired
    private CategoriaService categoriaService;
    
}
