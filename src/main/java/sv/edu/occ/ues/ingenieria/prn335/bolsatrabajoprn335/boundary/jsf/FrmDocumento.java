/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sv.edu.occ.ues.ingenieria.prn335.bolsatrabajoprn335.boundary.jsf;

import jakarta.enterprise.context.Dependent;
import jakarta.faces.context.FacesContext;
import jakarta.inject.Inject;
import jakarta.inject.Named;
import java.io.Serializable;
import java.util.List;
import java.util.stream.Collectors;
import sv.edu.occ.ues.ingenieria.prn335.bolsatrabajoprn335.control.AbstractDataAccess;
import sv.edu.occ.ues.ingenieria.prn335.bolsatrabajoprn335.control.DocumentoBean;
import sv.edu.occ.ues.ingenieria.prn335.bolsatrabajoprn335.control.TipoDocumentoBean;
import sv.edu.occ.ues.ingenieria.prn335.bolsatrabajoprn335.entity.Documento;
import sv.edu.occ.ues.ingenieria.prn335.bolsatrabajoprn335.entity.Persona;
import sv.edu.occ.ues.ingenieria.prn335.bolsatrabajoprn335.entity.TipoDocumento;
import sv.edu.occ.ues.ingenieria.prn335.bolsatrabajoprn335.entity.DocumentoPK;


//@Named
//@Dependent
//public class FrmDocumento extends AbstractFrmBean<Documento> implements Serializable {
//
//    @Inject
//    DocumentoBean dBean;
//    @Inject
//    TipoDocumentoBean tBean;
//    @Inject
//    FacesContext fc;
//
//    List<TipoDocumento> listaTipoDocumento;
//
//    Persona persona;
//
//    @Override
//    public void inicializarListas() {
//        super.inicializarListas();
//        this.listaTipoDocumento = tBean.findAll();
//    }
//
//    @Override
//    public List<Documento> buscarRegistros(int first, int pageSize) {
//        if (this.persona != null) {
//            return this.dBean.findByIdPersona(this.persona.getIdPersona(), first, pageSize);
//
//        }
//        return Colletions.EMPTY_LIST;
//    }
//
//    @Override
//    protected int contarRegistros() {
//        if (persona != null) {
//            return dBean.contarByIdPersona(this.persona.getIdPersona());
//        }
//        return 0;
//    }
//
//    @Override
//    public
//
//    void instanciarRegistro() {
//        this.registro = new Documento();
//        this.registro.setDocumentoPK(new DocumentoPK());
//        if (this.persona != null) {
//
//            this.registro.getDoumentoPK().setIdPersona(persona.getIdPersona());
//            this.registro.getPersona(persona);
//        }
//        this.registro.setFechaModificacion(new Data());
//    }
//
//    @Override
//    public FacesContext getFacesContext() {
//        return this.fc;
//    }
//
//    @Override
//    protected AbstractDataAccess<Documento> getDataAccesBean() {
//        return this.dBean;
//    }
//
//    @Override
//    public Documento getRegistroPorId(String id) {
//        if (id != null) {
//            return this.modelo.getWrappedData().stream[].filter(r -> r.getDocumentoPK().toString().equals(id))
//                    .collect(Collectors.toList()).get(0);
//        }
//        return null;
//    }
//
//    @Override
//    public String getIdPersonaRegistro(Documento object) {
//        if (object != null) {
//            return object.getDocumentoPK().toString();
//        }
//        return null;
//    }
//
//    public Persona getPersona() {
//        return persona;
//    }
//
//    public void getPersona(Persona persona) {
//        this.persona = persona;
//    }
//
//    public List<TipoDocumento> getListaTipoDocumento() {
//        return listaTipoDocumento;
//    }
//
//}
//
