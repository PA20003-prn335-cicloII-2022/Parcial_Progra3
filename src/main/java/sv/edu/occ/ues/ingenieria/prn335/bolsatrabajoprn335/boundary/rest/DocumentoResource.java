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
import sv.edu.occ.ues.ingenieria.prn335.bolsatrabajoprn335.control.DocumentoBean;
import sv.edu.occ.ues.ingenieria.prn335.bolsatrabajoprn335.entity.Documento;

/**
 *
 * @author Javier
 */
@Path(value = "persona/{idPersona}/documento")
@RequestScoped
public class DocumentoResource implements Serializable {
    @Inject
    DocumentoBean dBean;
    @GET
    @Produces({
        MediaType.APPLICATION_JSON

    })
    public Response findRange(@QueryParam(value = "first")
            @DefaultValue(value = "0") int first,
            @QueryParam(value = "pageSize")
            @DefaultValue(value = "5") int pageSize,
            @PathParam ("idPersona") Long idPersona){
        if (idPersona != null) {
            List<Documento> lista = dBean.findByIdPersona(idPersona, first, pageSize);
            int total = dBean.contarByIdPersona(idPersona);
            return Response.
                    ok().
                    entity(lista).
                    header("total-registros", total).
                    build();
        }
        return Response.status(400).build();
    }
            
}
