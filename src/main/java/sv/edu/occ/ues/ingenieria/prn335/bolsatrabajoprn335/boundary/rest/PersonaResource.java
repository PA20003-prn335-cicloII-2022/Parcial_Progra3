/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sv.edu.occ.ues.ingenieria.prn335.bolsatrabajoprn335.boundary.rest;

import jakarta.enterprise.context.RequestScoped;
import jakarta.inject.Inject;
import jakarta.ws.rs.DefaultValue;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.QueryParam;
import jakarta.ws.rs.core.MediaType;
import jakarta.ws.rs.core.Response;
import java.io.Serializable;
import java.util.List;
import sv.edu.occ.ues.ingenieria.prn335.bolsatrabajoprn335.control.PersonaBean;
import sv.edu.occ.ues.ingenieria.prn335.bolsatrabajoprn335.entity.Persona;

/**
 *
 * @author Javier
 */
@Path(value = "persona")
@RequestScoped
public class PersonaResource implements Serializable {

    @Inject
    PersonaBean pBean;

    @GET
    @Produces({
        MediaType.APPLICATION_JSON

    })
    public List<Persona> findRange(
            @QueryParam(value = "first")
            @DefaultValue(value = "0") int first,
            @QueryParam(value = "pageSize")
            @DefaultValue(value = "5") int pageSize
    ) {
        List<Persona> lista = pBean.findRange(first, pageSize);
        Long total = pBean.contar();
        return (List<Persona>) Response.
                ok().
                entity(lista).
                header("total-registros", total).
                build();
    }
    
    @GET
    @Path("{id}")
    @Produces({MediaType.APPLICATION_JSON })
    
    
    public Response findById(
        @PathParam(value = "id")
        final Long idPersona
                
    ){
        if(idPersona!=null){
            Persona salida = pBean.findById(idPersona);
            return Response.ok(salida).build();
            
        }
        return Response.status(400).build();
        
    }
    
}