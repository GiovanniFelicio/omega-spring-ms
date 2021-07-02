package com.omega.catalogo.repository;

import com.omega.catalogo.entity.Categoria;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author ENGCARVALHO
 */
@Repository
@Transactional
public interface CategoriaRepository extends JpaRepository<Categoria, Integer>{
    
}
