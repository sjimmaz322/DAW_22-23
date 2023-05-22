/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controladores;

import controladores.exceptions.NonexistentEntityException;
import java.io.Serializable;
import javax.persistence.Query;
import javax.persistence.EntityNotFoundException;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;
import entidades.Jugadores;
import entidades.Personajes;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 *
 * @author samuel
 */
public class PersonajesJpaController implements Serializable {

    public PersonajesJpaController(EntityManagerFactory emf) {
        this.emf = emf;
    }

    public PersonajesJpaController() {
        this.emf = Persistence.createEntityManagerFactory("bdProyectoSamuelJimenez");
    }
    private EntityManagerFactory emf = null;

    public EntityManager getEntityManager() {
        return emf.createEntityManager();
    }

    public void create(Personajes personajes) {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            Jugadores idJugador = personajes.getIdJugador();
            if (idJugador != null) {
                idJugador = em.getReference(idJugador.getClass(), idJugador.getId());
                personajes.setIdJugador(idJugador);
            }
            em.persist(personajes);
            if (idJugador != null) {
                idJugador.getPersonajesList().add(personajes);
                idJugador = em.merge(idJugador);
            }
            em.getTransaction().commit();
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public void edit(Personajes personajes) throws NonexistentEntityException, Exception {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            Personajes persistentPersonajes = em.find(Personajes.class, personajes.getId());
            Jugadores idJugadorOld = persistentPersonajes.getIdJugador();
            Jugadores idJugadorNew = personajes.getIdJugador();
            if (idJugadorNew != null) {
                idJugadorNew = em.getReference(idJugadorNew.getClass(), idJugadorNew.getId());
                personajes.setIdJugador(idJugadorNew);
            }
            personajes = em.merge(personajes);
            if (idJugadorOld != null && !idJugadorOld.equals(idJugadorNew)) {
                idJugadorOld.getPersonajesList().remove(personajes);
                idJugadorOld = em.merge(idJugadorOld);
            }
            if (idJugadorNew != null && !idJugadorNew.equals(idJugadorOld)) {
                idJugadorNew.getPersonajesList().add(personajes);
                idJugadorNew = em.merge(idJugadorNew);
            }
            em.getTransaction().commit();
        } catch (Exception ex) {
            String msg = ex.getLocalizedMessage();
            if (msg == null || msg.length() == 0) {
                Integer id = personajes.getId();
                if (findPersonajes(id) == null) {
                    throw new NonexistentEntityException("The personajes with id " + id + " no longer exists.");
                }
            }
            throw ex;
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public void destroy(Integer id) throws NonexistentEntityException {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            Personajes personajes;
            try {
                personajes = em.getReference(Personajes.class, id);
                personajes.getId();
            } catch (EntityNotFoundException enfe) {
                throw new NonexistentEntityException("The personajes with id " + id + " no longer exists.", enfe);
            }
            Jugadores idJugador = personajes.getIdJugador();
            if (idJugador != null) {
                idJugador.getPersonajesList().remove(personajes);
                idJugador = em.merge(idJugador);
            }
            em.remove(personajes);
            em.getTransaction().commit();
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public List<Personajes> findPersonajesEntities() {
        return findPersonajesEntities(true, -1, -1);
    }

    public List<Personajes> findPersonajesEntities(int maxResults, int firstResult) {
        return findPersonajesEntities(false, maxResults, firstResult);
    }

    private List<Personajes> findPersonajesEntities(boolean all, int maxResults, int firstResult) {
        EntityManager em = getEntityManager();
        try {
            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
            cq.select(cq.from(Personajes.class));
            Query q = em.createQuery(cq);
            if (!all) {
                q.setMaxResults(maxResults);
                q.setFirstResult(firstResult);
            }
            return q.getResultList();
        } finally {
            em.close();
        }
    }

    public Personajes findPersonajes(Integer id) {
        EntityManager em = getEntityManager();
        try {
            return em.find(Personajes.class, id);
        } finally {
            em.close();
        }
    }

    public int getPersonajesCount() {
        EntityManager em = getEntityManager();
        try {
            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
            Root<Personajes> rt = cq.from(Personajes.class);
            cq.select(em.getCriteriaBuilder().count(rt));
            Query q = em.createQuery(cq);
            return ((Long) q.getSingleResult()).intValue();
        } finally {
            em.close();
        }
    }

}
