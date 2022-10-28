/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sv.edu.occ.ues.ingenieria.prn335.bolsatrabajoprn335.boundary.jsf;

import jakarta.annotation.PostConstruct;
import jakarta.faces.context.FacesContext;
import java.io.Serializable;
import sv.edu.occ.ues.ingenieria.prn335.bolsatrabajoprn335.control.AbstractDataAccess;

/**
 *
 * @author Javier
 */
public abstract class AbstractFrmBean<T> implements Serializable {

    protected T registro;
    protected T modelo;
    protected Estados estado;

    public abstract void instanciarRegistro();

    protected abstract AbstractDataAccess<T> getDataAccessBean();

    public abstract FacesContext getFacesContext();

    @PostConstruct
    protected void inicializar() {
        this.estado = Estados.NINGUNO;
    }

    public void inicializarListas() {
    }

    public void inicializarModelo() {
    }

    public enum Estados {
        CREAR, MODIFICAR, NINGUNO;
    }

    public void btnNuevoHandler() {
        instanciarRegistro();
        this.estado = Estados.CREAR;
    }

    public void limpiar() {
        this.estado = Estados.NINGUNO;
    }

    public enum Genero {
        m, f;
    }

    public abstract T getRegistroPorId(String id);

    public abstract String getIdPorRegistro(T object);

    public T getRegistro() {
        return registro;
    }

    public void setRegistro(T registro) {
        this.registro = registro;
    }

    public Estados getEstado() {
        return estado;
    }

    public void setEstado(Estados estado) {
        this.estado = estado;
    }
}
