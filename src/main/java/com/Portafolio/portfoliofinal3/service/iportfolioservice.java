
package com.Portafolio.portfoliofinal3.service;

import com.Portafolio.portfoliofinal3.model.proyectos;
import java.util.List;


public interface iportfolioservice {
    
/*-----------METODO PARA LA SECCION "PROYECTOS REALIZADOS"---------*/
    
    public void AgregarProyecto(proyectos proy);

    public List<proyectos> VerProyectos();
    
}
