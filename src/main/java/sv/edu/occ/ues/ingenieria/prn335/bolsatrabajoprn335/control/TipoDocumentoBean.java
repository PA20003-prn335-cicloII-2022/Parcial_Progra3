/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sv.edu.occ.ues.ingenieria.prn335.bolsatrabajoprn335.control;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import java.io.Serializable;
import sv.edu.occ.ues.ingenieria.prn335.bolsatrabajoprn335.entity.TipoDocumento;

/**
 *
 * @author MMMMM
 */
public class TipoDocumentoBean extends AbstractDataAccess<TipoDocumento> implements Serializable {

    @PersistenceContext(unitName = "BolsaTrabajoPU")
    EntityManager em;

    @Override
    EntityManager getEntityManager() {
        return em;
    }

    public TipoDocumentoBean() {
        super(TipoDocumento.class);
    }

}
