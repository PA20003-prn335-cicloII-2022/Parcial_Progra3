/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sv.edu.occ.ues.ingenieria.prn335.bolsatrabajoprn335.boundary.jsf.conversores;

import jakarta.enterprise.context.RequestScoped;
import jakarta.faces.component.UIComponent;
import jakarta.faces.context.FacesContext;
import jakarta.faces.convert.Converter;
import jakarta.faces.convert.FacesConverter;
import jakarta.inject.Inject;

import sv.edu.occ.ues.ingenieria.prn335.bolsatrabajoprn335.control.TipoMedioContactoBean;

import sv.edu.occ.ues.ingenieria.prn335.bolsatrabajoprn335.entity.TipoMedioContacto;

/**
 *
 * @author Javier
 */

@FacesConverter(managed = true, value ="tipomedioconverter")
@RequestScoped
public class TipoMedioConverter implements Converter<TipoMedioContacto>{
   
@Inject
TipoMedioContactoBean tmBean;

@Override
public TipoMedioContacto getAsObject (FacesContext context, UIComponent component,String value){

if (value!= null){
     return tmBean.findById(Integer.valueOf(value));
      } 
      
    return null;     
}

@Override
public String getAsString(FacesContext context, UIComponent component, TipoMedioContacto value){
    if (value!= null && value.getIdTipoMedioContacto()!=null ){
    return value.getIdTipoMedioContacto().toString();
    
    } 
   return null;
  }
 
}
