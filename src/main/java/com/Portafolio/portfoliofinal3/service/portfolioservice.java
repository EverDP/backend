

package com.Portafolio.portfoliofinal3.service;

import com.Portafolio.portfoliofinal3.model.proyectos;
import com.Portafolio.portfoliofinal3.repository.portfoliorepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class portfolioservice implements iportfolioservice{
    
    @Autowired
    public portfoliorepository PortfolioRepo;
    
    
    
    

/*-----------METODOS PARA LA SECCION "PROYECTOS REALIZADOS"---------*/
    
        @Override
    public void AgregarProyecto( proyectos proy) {
        
        PortfolioRepo.save(proy);
        
    }
    
    
    @Override
    public List<proyectos> VerProyectos() {
        
        return PortfolioRepo.findAll();
    }


    
    
    
}
