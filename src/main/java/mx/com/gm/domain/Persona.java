/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.com.gm.domain;

import java.io.Serializable;
import javax.persistence.*;

/**
 *
 * @author Rafadinho
 */
@Entity
@NamedQueries({
    @NamedQuery(name = "Persona.encontrarTodasPersonas", query = "SELECT p FROM persona p ORDER BY p.idPersona" )
})
public class Persona implements Serializable {
    //atributos
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_persona")
    private int idPersona;
    
    private String nombre;
    
    public Persona(){
        
    }
    
     public Persona(int idPersona){
         this.idPersona = idPersona;
      
    }
     
        public Persona(int idPersona, String nombre){
         this.idPersona = idPersona;
         this.nombre = nombre;
    }

    public int getIdPersona() {
        return idPersona;
    }

    public void setIdPersona(int idPersona) {
        this.idPersona = idPersona;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return "Persona{" + "idPersona=" + idPersona + ", nombre=" + nombre + '}';
    }
        
        
}
