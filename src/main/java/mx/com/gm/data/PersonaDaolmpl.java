/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.com.gm.data;

import java.util.List;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import mx.com.gm.domain.Persona;

/**
 *
 * @author Rafadinho
 */

@Stateless
public class PersonaDaolmpl implements PersonaDao {
    
    @PersistenceContext (unitName = "PersonaPU")
    EntityManager em;
    @Override
    public List<Persona> encontrarTodasPersonas() {
    return em.createNamedQuery("Persona.encontrarTodasPersonas").getResultList();
    }

    @Override
    public Persona encontrarPersona(Persona persona) {
      return em.find(Persona.class, persona.getIdPersona());
    }

    @Override
    public void insertarPersona(Persona persona) {
        em.persist(persona);
        em.flush();
        
    }

    @Override
    public void actualizarPersona(Persona persona) {
           em.merge(persona);
    }

    @Override
    public void eliminarPersona(Persona persona) {
       em.remove(em.merge(persona));
    }
    
}
