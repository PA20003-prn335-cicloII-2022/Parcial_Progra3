/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sv.edu.occ.ues.ingenieria.prn335.bolsatrabajoprn335.boundary.jsf.conversores;

/**
 *
 * @author Javier
 */
import jakarta.enterprise.context.RequestScoped;
import jakarta.faces.component.UIComponent;
import jakarta.faces.context.FacesContext;
import jakarta.faces.convert.Converter;
import jakarta.faces.convert.FacesConverter;
import jakarta.inject.Inject;
import sv.edu.occ.ues.ingenieria.prn335.bolsatrabajoprn335.control.TipoDocumentoBean;
import sv.edu.occ.ues.ingenieria.prn335.bolsatrabajoprn335.entity.TipoDocumento;

@FacesConverter(managed = true, value ="tipodocumentoconverter")
@RequestScoped
public class TipoDocumentoConverter implements Converter<TipoDocumento>{

@Inject
TipoDocumentoBean tdBean;

@Override
public TipoDocumento getAsObject (FacesContext context, UIComponent component,String value){

if (value!= null){
     return tdBean.findById(Integer.valueOf(value));
      } 
      
    return null;     
}

@Override
public String getAsString(FacesContext context, UIComponent component, TipoDocumento value){
    if (value!= null && value.getIdTipoDocumento()!=null ){
    return value.getIdTipoDocumento().toString();
    
    } 
   return null;
  }

}