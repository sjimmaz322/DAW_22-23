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
import entidades.Partidas;
import entidades.Personajes;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 *
 * @author sajm <sjimmaz322 at sjimmaz322@g.educaand.es>
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
        if (personajes.getPartidasList() == null) {
            personajes.setPartidasList(new ArrayList<Partidas>());
        }
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            Jugadores idJugador = personajes.getIdJugador();
            if (idJugador != null) {
                idJugador = em.getReference(idJugador.getClass(), idJugador.getId());
                personajes.setIdJugador(idJugador);
            }
            List<Partidas> attachedPartidasList = new ArrayList<Partidas>();
            for (Partidas partidasListPartidasToAttach : personajes.getPartidasList()) {
                partidasListPartidasToAttach = em.getReference(partidasListPartidasToAttach.getClass(), partidasListPartidasToAttach.getNumPartida());
                attachedPartidasList.add(partidasListPartidasToAttach);
            }
            personajes.setPartidasList(attachedPartidasList);
            em.persist(personajes);
            if (idJugador != null) {
                idJugador.getPersonajesList().add(personajes);
                idJugador = em.merge(idJugador);
            }
            for (Partidas partidasListPartidas : personajes.getPartidasList()) {
                Personajes oldIdPersonajeOfPartidasListPartidas = partidasListPartidas.getIdPersonaje();
                partidasListPartidas.setIdPersonaje(personajes);
                partidasListPartidas = em.merge(partidasListPartidas);
                if (oldIdPersonajeOfPartidasListPartidas != null) {
                    oldIdPersonajeOfPartidasListPartidas.getPartidasList().remove(partidasListPartidas);
                    oldIdPersonajeOfPartidasListPartidas = em.merge(oldIdPersonajeOfPartidasListPartidas);
                }
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
            List<Partidas> partidasListOld = persistentPersonajes.getPartidasList();
            List<Partidas> partidasListNew = personajes.getPartidasList();
            if (idJugadorNew != null) {
                idJugadorNew = em.getReference(idJugadorNew.getClass(), idJugadorNew.getId());
                personajes.setIdJugador(idJugadorNew);
            }
            List<Partidas> attachedPartidasListNew = new ArrayList<Partidas>();
            for (Partidas partidasListNewPartidasToAttach : partidasListNew) {
                partidasListNewPartidasToAttach = em.getReference(partidasListNewPartidasToAttach.getClass(), partidasListNewPartidasToAttach.getNumPartida());
                attachedPartidasListNew.add(partidasListNewPartidasToAttach);
            }
            partidasListNew = attachedPartidasListNew;
            personajes.setPartidasList(partidasListNew);
            personajes = em.merge(personajes);
            if (idJugadorOld != null && !idJugadorOld.equals(idJugadorNew)) {
                idJugadorOld.getPersonajesList().remove(personajes);
                idJugadorOld = em.merge(idJugadorOld);
            }
            if (idJugadorNew != null && !idJugadorNew.equals(idJugadorOld)) {
                idJugadorNew.getPersonajesList().add(personajes);
                idJugadorNew = em.merge(idJugadorNew);
            }
            for (Partidas partidasListOldPartidas : partidasListOld) {
                if (!partidasListNew.contains(partidasListOldPartidas)) {
                    partidasListOldPartidas.setIdPersonaje(null);
                    partidasListOldPartidas = em.merge(partidasListOldPartidas);
                }
            }
            for (Partidas partidasListNewPartidas : partidasListNew) {
                if (!partidasListOld.contains(partidasListNewPartidas)) {
                    Personajes oldIdPersonajeOfPartidasListNewPartidas = partidasListNewPartidas.getIdPersonaje();
                    partidasListNewPartidas.setIdPersonaje(personajes);
                    partidasListNewPartidas = em.merge(partidasListNewPartidas);
                    if (oldIdPersonajeOfPartidasListNewPartidas != null && !oldIdPersonajeOfPartidasListNewPartidas.equals(personajes)) {
                        oldIdPersonajeOfPartidasListNewPartidas.getPartidasList().remove(partidasListNewPartidas);
                        oldIdPersonajeOfPartidasListNewPartidas = em.merge(oldIdPersonajeOfPartidasListNewPartidas);
                    }
                }
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
            List<Partidas> partidasList = personajes.getPartidasList();
            for (Partidas partidasListPartidas : partidasList) {
                partidasListPartidas.setIdPersonaje(null);
                partidasListPartidas = em.merge(partidasListPartidas);
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
