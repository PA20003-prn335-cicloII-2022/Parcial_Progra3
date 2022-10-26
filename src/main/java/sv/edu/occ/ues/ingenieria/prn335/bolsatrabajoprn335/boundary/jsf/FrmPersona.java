package sv.edu.occ.ues.ingenieria.prn335.bolsatrabajoprn335.boundary.jsf;

import jakarta.annotation.PostConstruct;
import jakarta.faces.view.ViewScoped;
import jakarta.inject.Inject;
import jakarta.inject.Named;
import sv.edu.occ.ues.ingenieria.prn335.bolsatrabajoprn335.control.PersonaBean;
import sv.edu.occ.ues.ingenieria.prn335.bolsatrabajoprn335.entity.Persona;

import java.io.Serializable;
import java.util.List;

@Named
@ViewScoped
public class FrmPersona implements Serializable {

    @Inject
    PersonaBean pBean;

    List <Persona> listaPersona;

    @PostConstruct
    public void inicializar (){
        inicializarModelo();
    }

    public void inicializarModelo  (){
        this.listaPersona=pBean.findAll();
    }

    public List<Persona> getListaPersona() {
        return listaPersona;
    }

    public void setListaPersona(List<Persona> listaPersona) {
        this.listaPersona = listaPersona;
    }
    
    //nuevo
//    public Genero[] getListaGeneros() {
//        return Genero.values();
//    }
//    
//    @Override
//    public Persona getRegistroPorId(String id) {
//        if (id != null && this.modelo != null  && this.modelo.getWrappedData != null) {
//            //falta codigo
//        }
//        return null;
//    }
//    
//    @Override
//    public String getIdPorRegistro(Persona object) {
//        if (object != null && object.getIdPersona() != null ) {
//            return object.getIdPersona().toString();
//        }
//        return null;
//    }
//    
//    public int getPasoActual(){
//        return pasoActual;
//    }
//    
//    public FrmDocumento getFrmDocumento(){
//        if (this.registro != null && this.frmDocumento != null) {
//            this.frmDocumento.setPerosna(this.registro);
//        }
//        return frmDocumento;
//    }
    
}
