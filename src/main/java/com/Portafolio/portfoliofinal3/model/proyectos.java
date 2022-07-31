
package com.Portafolio.portfoliofinal3.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import lombok.Getter;
import lombok.Setter;



@Getter @Setter
@Entity
public class proyectos {
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    
    private long Id;
    private String Titulo;
    private String Descripcion;       
    private String UrlImagen;
    private String UrlWeb;

    public proyectos() {
    }

    public proyectos(long Id, String Titulo, String Descripcion, String UrlImagen, String UrlWeb) {
        this.Id = Id;
        this.Titulo = Titulo;
        this.Descripcion = Descripcion;
        this.UrlImagen = UrlImagen;
        this.UrlWeb = UrlWeb;
    }
    
    
    
}
