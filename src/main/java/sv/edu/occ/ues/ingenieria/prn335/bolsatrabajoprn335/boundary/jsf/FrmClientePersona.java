/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sv.edu.occ.ues.ingenieria.prn335.bolsatrabajoprn335.boundary.jsf;

import jakarta.faces.event.ActionEvent;
import jakarta.faces.view.ViewScoped;
import jakarta.inject.Inject;
import jakarta.inject.Named;
import java.io.Serializable;
import java.util.List;
import sv.edu.occ.ues.ingenieria.prn335.bolsatrabajoprn335.control.rest.PersonaClient;
import sv.edu.occ.ues.ingenieria.prn335.bolsatrabajoprn335.entity.Persona;

/**
 *
 * @author Javier
 */
@Named
@ViewScoped
public class FrmClientePersona implements Serializable{
    @Inject
    PersonaClient pClient;
    
    List<Persona> listaPersona;
    
    public void btnBuscarHandler (ActionEvent ae){
        this.listaPersona=pClient.findRange(0, 10);
    }

    public List<Persona> getListaPersona() {
        return listaPersona;
    }

    public void setListaPersona(List<Persona> listaPersona) {
        this.listaPersona = listaPersona;
    }
    
    
    
}
