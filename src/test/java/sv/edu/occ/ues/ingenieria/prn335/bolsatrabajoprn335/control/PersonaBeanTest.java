/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package sv.edu.occ.ues.ingenieria.prn335.bolsatrabajoprn335.control;

import jakarta.persistence.EntityGraph;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.FlushModeType;
import jakarta.persistence.LockModeType;
import jakarta.persistence.Query;
import jakarta.persistence.StoredProcedureQuery;
import jakarta.persistence.TypedQuery;
import jakarta.persistence.criteria.CriteriaBuilder;
import jakarta.persistence.criteria.CriteriaDelete;
import jakarta.persistence.criteria.CriteriaQuery;
import jakarta.persistence.criteria.CriteriaUpdate;
import jakarta.persistence.metamodel.Metamodel;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Map;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import org.mockito.ArgumentMatchers;
import org.mockito.Mockito;
import sv.edu.occ.ues.ingenieria.prn335.bolsatrabajoprn335.entity.Persona;

/**
 *
 * @author jcpenya
 */
public class PersonaBeanTest {

    protected List<Persona> findAllResult;

    protected EntityManager emNullGenerator;

    public PersonaBean prepararCutParaFind() {
        EntityManager em = Mockito.mock(EntityManager.class);
        TypedQuery tq = Mockito.mock(TypedQuery.class);
        Mockito.when(tq.getResultList()).thenReturn(findAllResult);

        PersonaBean cut = new PersonaBean();
        PersonaBean espia = Mockito.spy(cut);
        Mockito.doReturn(tq).when(espia).generarConsultaBase(em);

        espia.em = em;
        return espia;
    }

    public PersonaBeanTest() {
        findAllResult = new ArrayList<>();
        findAllResult.add(new Persona(1l));
        findAllResult.add(new Persona(2l));
        findAllResult.add(new Persona(3l));

        emNullGenerator = new EntityManager() {
            @Override
            public void persist(Object o) {
                throw new UnsupportedOperationException("Not supported yet.");
            }

            @Override
            public <T> T merge(T t) {
                throw new UnsupportedOperationException("Not supported yet.");
            }

            @Override
            public void remove(Object o) {
                throw new UnsupportedOperationException("Not supported yet.");
            }

            @Override
            public <T> T find(Class<T> type, Object o) {
                throw new UnsupportedOperationException("Not supported yet.");
            }

            @Override
            public <T> T find(Class<T> type, Object o, Map<String, Object> map) {
                throw new UnsupportedOperationException("Not supported yet.");
            }

            @Override
            public <T> T find(Class<T> type, Object o, LockModeType lmt) {
                throw new UnsupportedOperationException("Not supported yet.");
            }

            @Override
            public <T> T find(Class<T> type, Object o, LockModeType lmt, Map<String, Object> map) {
                throw new UnsupportedOperationException("Not supported yet.");
            }

            @Override
            public <T> T getReference(Class<T> type, Object o) {
                throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
            }

            @Override
            public void flush() {
                throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
            }

            @Override
            public void setFlushMode(FlushModeType fmt) {
                throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
            }

            @Override
            public FlushModeType getFlushMode() {
                throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
            }

            @Override
            public void lock(Object o, LockModeType lmt) {
                throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
            }

            @Override
            public void lock(Object o, LockModeType lmt, Map<String, Object> map) {
                throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
            }

            @Override
            public void refresh(Object o) {
                throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
            }

            @Override
            public void refresh(Object o, Map<String, Object> map) {
                throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
            }

            @Override
            public void refresh(Object o, LockModeType lmt) {
                throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
            }

            @Override
            public void refresh(Object o, LockModeType lmt, Map<String, Object> map) {
                throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
            }

            @Override
            public void clear() {
                throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
            }

            @Override
            public void detach(Object o) {
                throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
            }

            @Override
            public boolean contains(Object o) {
                throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
            }

            @Override
            public LockModeType getLockMode(Object o) {
                throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
            }

            @Override
            public void setProperty(String string, Object o) {
                throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
            }

            @Override
            public Map<String, Object> getProperties() {
                throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
            }

            @Override
            public Query createQuery(String string) {
                throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
            }

            @Override
            public <T> TypedQuery<T> createQuery(CriteriaQuery<T> cq) {
                throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
            }

            @Override
            public Query createQuery(CriteriaUpdate cu) {
                throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
            }

            @Override
            public Query createQuery(CriteriaDelete cd) {
                throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
            }

            @Override
            public <T> TypedQuery<T> createQuery(String string, Class<T> type) {
                throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
            }

            @Override
            public Query createNamedQuery(String string) {
                throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
            }

            @Override
            public <T> TypedQuery<T> createNamedQuery(String string, Class<T> type) {
                throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
            }

            @Override
            public Query createNativeQuery(String string) {
                throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
            }

            @Override
            public Query createNativeQuery(String string, Class type) {
                throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
            }

            @Override
            public Query createNativeQuery(String string, String string1) {
                throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
            }

            @Override
            public StoredProcedureQuery createNamedStoredProcedureQuery(String string) {
                throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
            }

            @Override
            public StoredProcedureQuery createStoredProcedureQuery(String string) {
                throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
            }

            @Override
            public StoredProcedureQuery createStoredProcedureQuery(String string, Class... types) {
                throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
            }

            @Override
            public StoredProcedureQuery createStoredProcedureQuery(String string, String... strings) {
                throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
            }

            @Override
            public void joinTransaction() {
                throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
            }

            @Override
            public boolean isJoinedToTransaction() {
                throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
            }

            @Override
            public <T> T unwrap(Class<T> type) {
                throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
            }

            @Override
            public Object getDelegate() {
                throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
            }

            @Override
            public void close() {
                throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
            }

            @Override
            public boolean isOpen() {
                throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
            }

            @Override
            public EntityTransaction getTransaction() {
                throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
            }

            @Override
            public EntityManagerFactory getEntityManagerFactory() {
                throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
            }

            @Override
            public CriteriaBuilder getCriteriaBuilder() {
                throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
            }

            @Override
            public Metamodel getMetamodel() {
                throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
            }

            @Override
            public <T> EntityGraph<T> createEntityGraph(Class<T> type) {
                throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
            }

            @Override
            public EntityGraph<?> createEntityGraph(String string) {
                throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
            }

            @Override
            public EntityGraph<?> getEntityGraph(String string) {
                throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
            }

            @Override
            public <T> List<EntityGraph<? super T>> getEntityGraphs(Class<T> type) {
                throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
            }
        };
    }

    /**
     * Test of getEntityManager method, of class PersonaBean.
     */
    @Test
    public void testGetEntityManager() {
        PersonaBean cut = new PersonaBean();
        EntityManager mockEm = Mockito.mock(EntityManager.class);
        cut.em = mockEm;
        EntityManager resultado = cut.getEntityManager();
        assertEquals(resultado, mockEm);
    }

    @Test
    public void testCrear() {
        PersonaBean cut = new PersonaBean();
        EntityManager mockEm = Mockito.mock(EntityManager.class);
        cut.em = mockEm;

        Persona registro = new Persona();
        registro.setNombres("Chepe");
        registro.setApellidos("Diablo");
        registro.setFechaNacimiento(new Date());
        cut.crear(registro);

        try {
            cut.crear(null);
        } catch (IllegalArgumentException ex) {

        }

        cut.em = null;
        try {
            cut.crear(registro);
        } catch (IllegalStateException ex) {

        }

        cut.em = emNullGenerator;

        try {
            cut.crear(registro);
        } catch (IllegalStateException ex) {

        }

    }

    @Test
    public void testFindById() throws Exception {
        System.out.println("findById");
        Long id = 1l;
        EntityManager mockEM = Mockito.mock(EntityManager.class);

        PersonaBean cut = new PersonaBean();
        Persona expResult = new Persona();
        Mockito.when(mockEM.find(Persona.class, id)).thenReturn(expResult);
        assertThrows(IllegalStateException.class, () -> {
            cut.findById(id);
        });
        assertThrows(IllegalArgumentException.class, () -> {
            cut.findById(null);
        });

        cut.em = mockEM;
        Persona encontrado = cut.findById(id);

        assertEquals(expResult, encontrado);

        PersonaBean spy = Mockito.spy(PersonaBean.class);
        spy.em = mockEM;
        spy.findById(id);
        Mockito.when(spy.getEntityManager()).thenThrow(NullPointerException.class);
        Mockito.verify(spy, Mockito.times(1)).getEntityManager();

        PersonaBean otroCut = new PersonaBean();
        otroCut.em = emNullGenerator;

        assertThrows(IllegalStateException.class, () -> {
            otroCut.findById(id);
        });
    }

    @Test
    public void testFindRange() throws Exception {
        System.out.println("findRange");
        int first = 0;
        int pageSize = 1000;
        PersonaBean cut = this.prepararCutParaFind();
        List<Persona> result = cut.findRange(first, pageSize);
        assertEquals(result.size(), this.findAllResult.size());
        cut.em = null;
       result = cut.findRange(0, 1000);
        assertTrue(result.isEmpty());       
    }
    
     @Test
    public void testFindAll() throws Exception {
        System.out.println("findAll");
        PersonaBean cut = this.prepararCutParaFind();
        List<Persona> resultado = cut.findAll();
        assertEquals(resultado.size(), findAllResult.size());
        cut.em = null;
        assertTrue(cut.findAll().isEmpty());
    }

    
    @Test
    public void testEliminar() throws Exception {
        System.out.println("eliminar");
        EntityManager em = Mockito.mock(EntityManager.class);
        PersonaBean cut = new PersonaBean();
        cut.em = em;
        Persona eliminado = new Persona(1l);
        cut.eliminar(eliminado);
        Mockito.verify(em, Mockito.times(1)).remove(ArgumentMatchers.any());
        try {
            cut.eliminar(null);
            fail("el parametro era nulo");
        } catch (IllegalArgumentException ex) {

        }
        try {
            cut.em = null;
            cut.eliminar(eliminado);
            fail("el entitymanager era nulo");
        } catch (IllegalStateException ex) {

        }
    }
    
     @Test
    public void testModificar() throws Exception {
        System.out.println("modificar");

        EntityManager em = Mockito.mock(EntityManager.class);
        PersonaBean cut = new PersonaBean();
        cut.em = em;
        cut.modificar(new Persona(1l));
        Mockito.verify(em, Mockito.times(1)).merge(ArgumentMatchers.any());
        try {
            cut.modificar(null);
            fail("el parametro era nulo");
        } catch (IllegalArgumentException ex) {

        }
        try {
            cut.em = null;
            cut.modificar(new Persona(1l));
            fail("el entitymanager era nulo");
        } catch (IllegalStateException ex) {

        }
    }
    
     @Test
    public void testContar() throws Exception {
        System.out.println("contar");
        EntityManager em = Mockito.mock(EntityManager.class);
        CriteriaBuilder cb = Mockito.mock(CriteriaBuilder.class);
        CriteriaQuery cq = Mockito.mock(CriteriaQuery.class);
        TypedQuery tq = Mockito.mock(TypedQuery.class);
        Mockito.when(cb.createQuery(Long.class)).thenReturn(cq);
        Mockito.when(em.getCriteriaBuilder()).thenReturn(cb);
        Mockito.when(em.createQuery(cq)).thenReturn(tq);
        Mockito.when(tq.getSingleResult()).thenReturn(Long.valueOf(1l));
        PersonaBean cut = new PersonaBean();
        cut.em = em;
        Long resultado = cut.contar();
        assertEquals(resultado, Long.valueOf(1));
        try {
            cut.em = null;
            cut.contar();
            fail("El EntityManager era nulo");
        } catch (Exception ex) {

        }
    }
}