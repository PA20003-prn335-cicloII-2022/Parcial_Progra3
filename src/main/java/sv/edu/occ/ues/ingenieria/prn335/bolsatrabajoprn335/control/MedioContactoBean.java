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
import sv.edu.occ.ues.ingenieria.prn335.bolsatrabajoprn335.entity.MedioContacto;

/**
 *
 * @author Javier
 */
@Stateless
@LocalBean
public class MedioContactoBean extends AbstractDataAccess<MedioContacto> implements Serializable {

    @PersistenceContext(unitName = "BolsaTrabajoPU")
    EntityManager em;
    
    @Override
    EntityManager getEntityManager() {
        return em;
    }

    public MedioContactoBean() {
        super(MedioContacto.class);
    }

}