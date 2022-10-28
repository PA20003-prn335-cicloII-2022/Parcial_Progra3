package sv.edu.occ.ues.ingenieria.prn335.bolsatrabajoprn335.boundary.jsf;

import jakarta.annotation.PostConstruct;
import jakarta.enterprise.inject.Default;
import jakarta.faces.context.FacesContext;
import jakarta.faces.event.ActionEvent;
import jakarta.faces.view.ViewScoped;
import jakarta.inject.Inject;
import jakarta.inject.Named;
import sv.edu.occ.ues.ingenieria.prn335.bolsatrabajoprn335.control.PersonaBean;
import sv.edu.occ.ues.ingenieria.prn335.bolsatrabajoprn335.entity.Persona;

import java.io.Serializable;
import java.util.List;
import sv.edu.occ.ues.ingenieria.prn335.bolsatrabajoprn335.boundary.jsf.AbstractFrmBean.Genero;
import sv.edu.occ.ues.ingenieria.prn335.bolsatrabajoprn335.control.AbstractDataAccess;

@Named
@ViewScoped
public class FrmPersona implements Serializable {

    @Inject
    PersonaBean pBean;

    //@Inject
    @Default
    FacesContext fc;
    
    List<Persona>listaPersona;
    
    @PostConstruct
    public void inicializar(){
        inicializarModelo();
    }
    
    public void inicializarModelo(){
        this.listaPersona = pBean.findAll();
    }
    
    public List<Persona>getListaPersona(){
        return listaPersona;
    }
    
    public void setListaPersona(List<Persona>listaPersona){
        this.listaPersona = listaPersona;
    }
    
    protected int pasoActual;

    public void avanzarPasoActual(ActionEvent ae) {
        this.pasoActual++;
    }

    protected AbstractDataAccess<Persona> getDataAccessBean() {
        return pBean;
    }

    public FacesContext getFacesContext() {
        return fc;
    }

    public Persona getRegistroPorId() {
        return null;
    }

    public String getIdPorRegistro(Persona object) {
        if (object != null && object.getIdPersona() != null) {
            return object.getIdPersona().toString();
        }
        return null;
    }

    public int getPasoActual() {
        return pasoActual;
    }
    
    
    public Genero[] getListaGeneros() {
        return Genero.values();
    }
    
//    @Override
//    public Persona getRegistroPorId(String id) {
//        if (id != null && this.modelo != null  && this.modelo.getWrappedData != null) {
//            //falta codigo
//        }
//        return null;
//    }
//    
//    
//    public FrmDocumento getFrmDocumento(){
//        if (this.registro != null && this.frmDocumento != null) {
//            this.rmDocumento.setPerosna(this.registro);
//        }
//        return frmDocumento;
//    }
    
}
