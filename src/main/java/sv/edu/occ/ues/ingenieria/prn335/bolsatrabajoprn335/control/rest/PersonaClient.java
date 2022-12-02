/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sv.edu.occ.ues.ingenieria.prn335.bolsatrabajoprn335.control.rest;

import jakarta.annotation.PostConstruct;
import jakarta.ejb.LocalBean;
import jakarta.ejb.Stateless;
import jakarta.ws.rs.client.Client;
import jakarta.ws.rs.client.ClientBuilder;
import jakarta.ws.rs.client.WebTarget;
import jakarta.ws.rs.core.GenericType;
import jakarta.ws.rs.core.MediaType;
import jakarta.ws.rs.core.Response;
import java.io.Serializable;
import java.util.Collections;
import java.util.List;
import sv.edu.occ.ues.ingenieria.prn335.bolsatrabajoprn335.entity.Persona;

/**
 *
 * @author Javier
 */
@Stateless
@LocalBean
public class PersonaClient implements Serializable {
    final static String URL_SERVICIO = "http://localhost:8080/BolsaTrabajoPRN335/resources";
    
    Client cliente;
    WebTarget target;
    
    @PostConstruct
    void iniciarCliente(){
        cliente= ClientBuilder.newClient();
        target =cliente.target(URL_SERVICIO);
    }

    public List<Persona> findRange(int first, int pageSize) {
        Response respuesta = target.path("persona")
                .queryParam("first", first)
                .queryParam("pagesize", pageSize)
                .request(MediaType.APPLICATION_JSON)
                .get();
        if (respuesta.getStatus() == 200) {
            List<Persona> lista = respuesta.readEntity(
                    new GenericType<List<Persona>>() {
            }
            );
            return lista;
        }
        return Collections.EMPTY_LIST;
    }
}
