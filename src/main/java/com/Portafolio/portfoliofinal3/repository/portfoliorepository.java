
package com.Portafolio.portfoliofinal3.repository;

import com.Portafolio.portfoliofinal3.model.proyectos;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface portfoliorepository extends JpaRepository<proyectos, Long> {
    
    
    
}
