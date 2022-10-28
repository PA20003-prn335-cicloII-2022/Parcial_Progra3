/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sv.edu.occ.ues.ingenieria.prn335.bolsatrabajoprn335.control;

import jakarta.ejb.LocalBean;
import jakarta.ejb.Stateless;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import java.io.Serializable;
import java.util.List;
import sv.edu.occ.ues.ingenieria.prn335.bolsatrabajoprn335.entity.Documento;

/**
 *
 * @author Javier
 */
@Stateless
@LocalBean
public class DocumentoBean extends AbstractDataAccess<Documento> implements Serializable {

    @PersistenceContext(unitName = "BolsaTrabajoPU")
    EntityManager em;
    
    @Override
    EntityManager getEntityManager() {
        return em;
    }

    public DocumentoBean() {
        super(Documento.class);
    }

    public List<Documento> findByIdPersona(Long idPersona, int first, int pageSize) {
        throw new UnsupportedOperationException("Not supported yet."); 
            //ALL YOUR CODE HERE
    }

    public int contarByIdPersona(Long idPersona) {
        throw new UnsupportedOperationException("Not supported yet."); 
            //ALL YOUR CODE HERE
    }
    
    
}