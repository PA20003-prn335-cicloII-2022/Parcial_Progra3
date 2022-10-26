/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sv.edu.occ.ues.ingenieria.prn335.bolsatrabajoprn335.control;

import jakarta.persistence.EntityManager;
import java.io.Serializable;
import java.util.Collections;
import java.util.List;
//import sv.edu.occ.ues.ingenieria.prn335.bolsatrabajoprn335.entity.Persona;
import jakarta.persistence.TypedQuery;
import jakarta.persistence.criteria.CriteriaBuilder;
import jakarta.persistence.criteria.CriteriaQuery;
import jakarta.persistence.criteria.Root;

/**
 *
 * @author Javier
 */
public abstract class AbstractDataAccess<T> implements Serializable {

    protected final Class clase;

    public AbstractDataAccess(Class persona) {
        this.clase = persona;
    }

    abstract EntityManager getEntityManager();

    public void crear(T registro) throws IllegalArgumentException, IllegalStateException {
        if (registro != null) {
            EntityManager em = null;
            try {
                em = this.getEntityManager();
            } finally {
               // throw new IllegalStateException("No se puede");
            }
            if (em != null) {
                try {
                    em.persist(registro);
                    return;
                } catch (Exception ex) {
                    throw new IllegalStateException("No se puede almacenar el registro");
                }
            }
            throw new IllegalStateException("Error");
        }
        throw new IllegalArgumentException();
    }
    
        // FALTA EL TEST PARA ESTE METODO
        protected TypedQuery generarConsultaBase(EntityManager em) {
        if (em != null) {
            CriteriaBuilder cb = em.getCriteriaBuilder();
            CriteriaQuery cq = cb.createQuery(clase);
            Root<T> raiz = cq.from(clase);
            cq.select(raiz);
            return em.createQuery(cq);

        }
        throw new IllegalArgumentException();
    }
    
    public T findById(final Object id) throws IllegalArgumentException, IllegalStateException {
        if (id != null) {
            EntityManager em = null;
            try {
                em = this.getEntityManager();
            } finally {
                //throw new IllegalStateException("No se puede");
            }
            if (em != null) {
                try {
                    return (T) em.find(clase, id);
                } catch (Exception e) {
                    //cualquier excepcion
                    //throw new IllegalStateException("No se puede");
                }
                
            }
            //return (T) Collections.EMPTY_LIST;
            throw new IllegalStateException("Error");
        }
        //return (T) Collections.EMPTY_LIST;
        throw new IllegalArgumentException();
        //return null;
    }

    public List<T> findAll() {
        EntityManager em = null;
        try {
            em = this.getEntityManager();
        } finally {
            //throw new IllegalStateException("No se puede");
        }
        if (em != null) {
            TypedQuery q = this.generarConsultaBase(em);
            List salida = q.getResultList();
            if (salida != null) {
                return salida;
            }
            //return Collections.EMPTY_LIST;
        }
        return Collections.EMPTY_LIST;
        //return null;
    }

    public List<T> findRange(int first, int pageSize) {
        
        EntityManager em = null;
        try {
            em = this.getEntityManager();
        } finally {
            //throw new IllegalStateException("No se puede");
        }
        if (em != null) {
            TypedQuery q = this.generarConsultaBase(em);
            q.setFirstResult(first);
            q.setMaxResults(pageSize);
            List salida = q.getResultList();
            if (salida != null) {
                return salida;
            }
            //return Collections.EMPTY_LIST;
        }
        //throw new IllegalStateException("Error");
        return Collections.EMPTY_LIST;
        //return null;      
    }

    public void eliminar(T registro) throws IllegalArgumentException, IllegalStateException {
         if (registro != null) {
            EntityManager em = null;
            try {
                em = getEntityManager();
            } finally {
                //throw new IllegalStateException("No se puede");
            }
            if (em != null) {
                if (!em.contains(registro)) {
                    registro =em.merge(registro);
                }
                em.remove(registro);
                return;
            }
            throw new IllegalStateException("Error");
        }
        throw new IllegalArgumentException("el registro es nulo");
    }

    public T modificar(T registro) throws IllegalArgumentException, IllegalStateException {
       if (registro != null) {
            EntityManager em = null;
            try {
                em = getEntityManager();
            } finally {
                //throw new IllegalStateException("No se puede");
            }
            if (em != null) {
                if (!em.contains(registro)) {
                    //registro =em.merge(registro);
                    return em.merge(registro);
                }
                //em.merge(registro);
                //return;
            }
            throw new IllegalStateException("Error");
        }
       throw new IllegalArgumentException("el registro es nulo");
    }

    public Long contar() throws IllegalArgumentException, IllegalStateException {
        EntityManager em = null;
        try {
            em = this.getEntityManager();
        } finally {
            //throw new IllegalStateException("No se puede");
        }
        if (em != null) {
            
            CriteriaBuilder cb = em.getCriteriaBuilder();
            CriteriaQuery <Long> cq = cb.createQuery(Long.class);
            cq.select(cb.count(cq.from(clase)));
            return em.createQuery(cq).getSingleResult();
              
        }
        throw new IllegalStateException("Error");
        //return null;

    }

}