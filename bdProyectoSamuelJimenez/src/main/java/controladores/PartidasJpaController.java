/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controladores;

import controladores.exceptions.NonexistentEntityException;
import entidades.Partidas;
import java.io.Serializable;
import javax.persistence.Query;
import javax.persistence.EntityNotFoundException;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;
import entidades.Personajes;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 *
 * @author samuel
 */
public class PartidasJpaController implements Serializable {

    public PartidasJpaController(EntityManagerFactory emf) {
        this.emf = emf;
    }
    public PartidasJpaController() {
        this.emf = Persistence.createEntityManagerFactory("bdProyectoSamuelJimenez");
    }
    private EntityManagerFactory emf = null;

    public EntityManager getEntityManager() {
        return emf.createEntityManager();
    }

    public void create(Partidas partidas) {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            Personajes idPersonaje = partidas.getIdPersonaje();
            if (idPersonaje != null) {
                idPersonaje = em.getReference(idPersonaje.getClass(), idPersonaje.getId());
                partidas.setIdPersonaje(idPersonaje);
            }
            em.persist(partidas);
            if (idPersonaje != null) {
                idPersonaje.getPartidasList().add(partidas);
                idPersonaje = em.merge(idPersonaje);
            }
            em.getTransaction().commit();
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public void edit(Partidas partidas) throws NonexistentEntityException, Exception {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            Partidas persistentPartidas = em.find(Partidas.class, partidas.getNumPartida());
            Personajes idPersonajeOld = persistentPartidas.getIdPersonaje();
            Personajes idPersonajeNew = partidas.getIdPersonaje();
            if (idPersonajeNew != null) {
                idPersonajeNew = em.getReference(idPersonajeNew.getClass(), idPersonajeNew.getId());
                partidas.setIdPersonaje(idPersonajeNew);
            }
            partidas = em.merge(partidas);
            if (idPersonajeOld != null && !idPersonajeOld.equals(idPersonajeNew)) {
                idPersonajeOld.getPartidasList().remove(partidas);
                idPersonajeOld = em.merge(idPersonajeOld);
            }
            if (idPersonajeNew != null && !idPersonajeNew.equals(idPersonajeOld)) {
                idPersonajeNew.getPartidasList().add(partidas);
                idPersonajeNew = em.merge(idPersonajeNew);
            }
            em.getTransaction().commit();
        } catch (Exception ex) {
            String msg = ex.getLocalizedMessage();
            if (msg == null || msg.length() == 0) {
                Integer id = partidas.getNumPartida();
                if (findPartidas(id) == null) {
                    throw new NonexistentEntityException("The partidas with id " + id + " no longer exists.");
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
            Partidas partidas;
            try {
                partidas = em.getReference(Partidas.class, id);
                partidas.getNumPartida();
            } catch (EntityNotFoundException enfe) {
                throw new NonexistentEntityException("The partidas with id " + id + " no longer exists.", enfe);
            }
            Personajes idPersonaje = partidas.getIdPersonaje();
            if (idPersonaje != null) {
                idPersonaje.getPartidasList().remove(partidas);
                idPersonaje = em.merge(idPersonaje);
            }
            em.remove(partidas);
            em.getTransaction().commit();
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public List<Partidas> findPartidasEntities() {
        return findPartidasEntities(true, -1, -1);
    }

    public List<Partidas> findPartidasEntities(int maxResults, int firstResult) {
        return findPartidasEntities(false, maxResults, firstResult);
    }

    private List<Partidas> findPartidasEntities(boolean all, int maxResults, int firstResult) {
        EntityManager em = getEntityManager();
        try {
            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
            cq.select(cq.from(Partidas.class));
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

    public Partidas findPartidas(Integer id) {
        EntityManager em = getEntityManager();
        try {
            return em.find(Partidas.class, id);
        } finally {
            em.close();
        }
    }

    public int getPartidasCount() {
        EntityManager em = getEntityManager();
        try {
            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
            Root<Partidas> rt = cq.from(Partidas.class);
            cq.select(em.getCriteriaBuilder().count(rt));
            Query q = em.createQuery(cq);
            return ((Long) q.getSingleResult()).intValue();
        } finally {
            em.close();
        }
    }
    
}
