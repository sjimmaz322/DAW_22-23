/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controladores;

import controladores.exceptions.NonexistentEntityException;
import entidades.Jugadores;
import java.io.Serializable;
import javax.persistence.Query;
import javax.persistence.EntityNotFoundException;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;
import entidades.Personajes;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 *
 * @author samuel
 */
public class JugadoresJpaController implements Serializable {

    public JugadoresJpaController(EntityManagerFactory emf) {
        this.emf = emf;
    }
      public JugadoresJpaController() {
        this.emf = emf = Persistence.createEntityManagerFactory("bdProyectoSamuelJimenez");
    }
    private EntityManagerFactory emf = null;

    public EntityManager getEntityManager() {
        return emf.createEntityManager();
    }

    public void create(Jugadores jugadores) {
        if (jugadores.getPersonajesList() == null) {
            jugadores.setPersonajesList(new ArrayList<Personajes>());
        }
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            List<Personajes> attachedPersonajesList = new ArrayList<Personajes>();
            for (Personajes personajesListPersonajesToAttach : jugadores.getPersonajesList()) {
                personajesListPersonajesToAttach = em.getReference(personajesListPersonajesToAttach.getClass(), personajesListPersonajesToAttach.getId());
                attachedPersonajesList.add(personajesListPersonajesToAttach);
            }
            jugadores.setPersonajesList(attachedPersonajesList);
            em.persist(jugadores);
            for (Personajes personajesListPersonajes : jugadores.getPersonajesList()) {
                Jugadores oldIdJugadorOfPersonajesListPersonajes = personajesListPersonajes.getIdJugador();
                personajesListPersonajes.setIdJugador(jugadores);
                personajesListPersonajes = em.merge(personajesListPersonajes);
                if (oldIdJugadorOfPersonajesListPersonajes != null) {
                    oldIdJugadorOfPersonajesListPersonajes.getPersonajesList().remove(personajesListPersonajes);
                    oldIdJugadorOfPersonajesListPersonajes = em.merge(oldIdJugadorOfPersonajesListPersonajes);
                }
            }
            em.getTransaction().commit();
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public void edit(Jugadores jugadores) throws NonexistentEntityException, Exception {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            Jugadores persistentJugadores = em.find(Jugadores.class, jugadores.getId());
            List<Personajes> personajesListOld = persistentJugadores.getPersonajesList();
            List<Personajes> personajesListNew = jugadores.getPersonajesList();
            List<Personajes> attachedPersonajesListNew = new ArrayList<Personajes>();
            for (Personajes personajesListNewPersonajesToAttach : personajesListNew) {
                personajesListNewPersonajesToAttach = em.getReference(personajesListNewPersonajesToAttach.getClass(), personajesListNewPersonajesToAttach.getId());
                attachedPersonajesListNew.add(personajesListNewPersonajesToAttach);
            }
            personajesListNew = attachedPersonajesListNew;
            jugadores.setPersonajesList(personajesListNew);
            jugadores = em.merge(jugadores);
            for (Personajes personajesListOldPersonajes : personajesListOld) {
                if (!personajesListNew.contains(personajesListOldPersonajes)) {
                    personajesListOldPersonajes.setIdJugador(null);
                    personajesListOldPersonajes = em.merge(personajesListOldPersonajes);
                }
            }
            for (Personajes personajesListNewPersonajes : personajesListNew) {
                if (!personajesListOld.contains(personajesListNewPersonajes)) {
                    Jugadores oldIdJugadorOfPersonajesListNewPersonajes = personajesListNewPersonajes.getIdJugador();
                    personajesListNewPersonajes.setIdJugador(jugadores);
                    personajesListNewPersonajes = em.merge(personajesListNewPersonajes);
                    if (oldIdJugadorOfPersonajesListNewPersonajes != null && !oldIdJugadorOfPersonajesListNewPersonajes.equals(jugadores)) {
                        oldIdJugadorOfPersonajesListNewPersonajes.getPersonajesList().remove(personajesListNewPersonajes);
                        oldIdJugadorOfPersonajesListNewPersonajes = em.merge(oldIdJugadorOfPersonajesListNewPersonajes);
                    }
                }
            }
            em.getTransaction().commit();
        } catch (Exception ex) {
            String msg = ex.getLocalizedMessage();
            if (msg == null || msg.length() == 0) {
                Integer id = jugadores.getId();
                if (findJugadores(id) == null) {
                    throw new NonexistentEntityException("The jugadores with id " + id + " no longer exists.");
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
            Jugadores jugadores;
            try {
                jugadores = em.getReference(Jugadores.class, id);
                jugadores.getId();
            } catch (EntityNotFoundException enfe) {
                throw new NonexistentEntityException("The jugadores with id " + id + " no longer exists.", enfe);
            }
            List<Personajes> personajesList = jugadores.getPersonajesList();
            for (Personajes personajesListPersonajes : personajesList) {
                personajesListPersonajes.setIdJugador(null);
                personajesListPersonajes = em.merge(personajesListPersonajes);
            }
            em.remove(jugadores);
            em.getTransaction().commit();
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public List<Jugadores> findJugadoresEntities() {
        return findJugadoresEntities(true, -1, -1);
    }

    public List<Jugadores> findJugadoresEntities(int maxResults, int firstResult) {
        return findJugadoresEntities(false, maxResults, firstResult);
    }

    private List<Jugadores> findJugadoresEntities(boolean all, int maxResults, int firstResult) {
        EntityManager em = getEntityManager();
        try {
            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
            cq.select(cq.from(Jugadores.class));
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

    public Jugadores findJugadores(Integer id) {
        EntityManager em = getEntityManager();
        try {
            return em.find(Jugadores.class, id);
        } finally {
            em.close();
        }
    }

    public int getJugadoresCount() {
        EntityManager em = getEntityManager();
        try {
            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
            Root<Jugadores> rt = cq.from(Jugadores.class);
            cq.select(em.getCriteriaBuilder().count(rt));
            Query q = em.createQuery(cq);
            return ((Long) q.getSingleResult()).intValue();
        } finally {
            em.close();
        }
    }
    
}
