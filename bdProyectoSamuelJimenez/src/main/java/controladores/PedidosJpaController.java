/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controladores;

import controladores.exceptions.IllegalOrphanException;
import controladores.exceptions.NonexistentEntityException;
import java.io.Serializable;
import javax.persistence.Query;
import javax.persistence.EntityNotFoundException;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;
import entidades.Clientes;
import entidades.Infopedidos;
import entidades.Pedidos;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;

/**
 *
 * @author sajm <sjimmaz322 at sjimmaz322@g.educaand.es>
 */
public class PedidosJpaController implements Serializable {

    public PedidosJpaController(EntityManagerFactory emf) {
        this.emf = emf;
    }
    private EntityManagerFactory emf = null;

    public EntityManager getEntityManager() {
        return emf.createEntityManager();
    }

    public void create(Pedidos pedidos) {
        if (pedidos.getInfopedidosCollection() == null) {
            pedidos.setInfopedidosCollection(new ArrayList<Infopedidos>());
        }
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            Clientes cliente = pedidos.getCliente();
            if (cliente != null) {
                cliente = em.getReference(cliente.getClass(), cliente.getId());
                pedidos.setCliente(cliente);
            }
            Collection<Infopedidos> attachedInfopedidosCollection = new ArrayList<Infopedidos>();
            for (Infopedidos infopedidosCollectionInfopedidosToAttach : pedidos.getInfopedidosCollection()) {
                infopedidosCollectionInfopedidosToAttach = em.getReference(infopedidosCollectionInfopedidosToAttach.getClass(), infopedidosCollectionInfopedidosToAttach.getInfopedidosPK());
                attachedInfopedidosCollection.add(infopedidosCollectionInfopedidosToAttach);
            }
            pedidos.setInfopedidosCollection(attachedInfopedidosCollection);
            em.persist(pedidos);
            if (cliente != null) {
                cliente.getPedidosCollection().add(pedidos);
                cliente = em.merge(cliente);
            }
            for (Infopedidos infopedidosCollectionInfopedidos : pedidos.getInfopedidosCollection()) {
                Pedidos oldPedidosOfInfopedidosCollectionInfopedidos = infopedidosCollectionInfopedidos.getPedidos();
                infopedidosCollectionInfopedidos.setPedidos(pedidos);
                infopedidosCollectionInfopedidos = em.merge(infopedidosCollectionInfopedidos);
                if (oldPedidosOfInfopedidosCollectionInfopedidos != null) {
                    oldPedidosOfInfopedidosCollectionInfopedidos.getInfopedidosCollection().remove(infopedidosCollectionInfopedidos);
                    oldPedidosOfInfopedidosCollectionInfopedidos = em.merge(oldPedidosOfInfopedidosCollectionInfopedidos);
                }
            }
            em.getTransaction().commit();
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public void edit(Pedidos pedidos) throws IllegalOrphanException, NonexistentEntityException, Exception {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            Pedidos persistentPedidos = em.find(Pedidos.class, pedidos.getNumPedido());
            Clientes clienteOld = persistentPedidos.getCliente();
            Clientes clienteNew = pedidos.getCliente();
            Collection<Infopedidos> infopedidosCollectionOld = persistentPedidos.getInfopedidosCollection();
            Collection<Infopedidos> infopedidosCollectionNew = pedidos.getInfopedidosCollection();
            List<String> illegalOrphanMessages = null;
            for (Infopedidos infopedidosCollectionOldInfopedidos : infopedidosCollectionOld) {
                if (!infopedidosCollectionNew.contains(infopedidosCollectionOldInfopedidos)) {
                    if (illegalOrphanMessages == null) {
                        illegalOrphanMessages = new ArrayList<String>();
                    }
                    illegalOrphanMessages.add("You must retain Infopedidos " + infopedidosCollectionOldInfopedidos + " since its pedidos field is not nullable.");
                }
            }
            if (illegalOrphanMessages != null) {
                throw new IllegalOrphanException(illegalOrphanMessages);
            }
            if (clienteNew != null) {
                clienteNew = em.getReference(clienteNew.getClass(), clienteNew.getId());
                pedidos.setCliente(clienteNew);
            }
            Collection<Infopedidos> attachedInfopedidosCollectionNew = new ArrayList<Infopedidos>();
            for (Infopedidos infopedidosCollectionNewInfopedidosToAttach : infopedidosCollectionNew) {
                infopedidosCollectionNewInfopedidosToAttach = em.getReference(infopedidosCollectionNewInfopedidosToAttach.getClass(), infopedidosCollectionNewInfopedidosToAttach.getInfopedidosPK());
                attachedInfopedidosCollectionNew.add(infopedidosCollectionNewInfopedidosToAttach);
            }
            infopedidosCollectionNew = attachedInfopedidosCollectionNew;
            pedidos.setInfopedidosCollection(infopedidosCollectionNew);
            pedidos = em.merge(pedidos);
            if (clienteOld != null && !clienteOld.equals(clienteNew)) {
                clienteOld.getPedidosCollection().remove(pedidos);
                clienteOld = em.merge(clienteOld);
            }
            if (clienteNew != null && !clienteNew.equals(clienteOld)) {
                clienteNew.getPedidosCollection().add(pedidos);
                clienteNew = em.merge(clienteNew);
            }
            for (Infopedidos infopedidosCollectionNewInfopedidos : infopedidosCollectionNew) {
                if (!infopedidosCollectionOld.contains(infopedidosCollectionNewInfopedidos)) {
                    Pedidos oldPedidosOfInfopedidosCollectionNewInfopedidos = infopedidosCollectionNewInfopedidos.getPedidos();
                    infopedidosCollectionNewInfopedidos.setPedidos(pedidos);
                    infopedidosCollectionNewInfopedidos = em.merge(infopedidosCollectionNewInfopedidos);
                    if (oldPedidosOfInfopedidosCollectionNewInfopedidos != null && !oldPedidosOfInfopedidosCollectionNewInfopedidos.equals(pedidos)) {
                        oldPedidosOfInfopedidosCollectionNewInfopedidos.getInfopedidosCollection().remove(infopedidosCollectionNewInfopedidos);
                        oldPedidosOfInfopedidosCollectionNewInfopedidos = em.merge(oldPedidosOfInfopedidosCollectionNewInfopedidos);
                    }
                }
            }
            em.getTransaction().commit();
        } catch (Exception ex) {
            String msg = ex.getLocalizedMessage();
            if (msg == null || msg.length() == 0) {
                Integer id = pedidos.getNumPedido();
                if (findPedidos(id) == null) {
                    throw new NonexistentEntityException("The pedidos with id " + id + " no longer exists.");
                }
            }
            throw ex;
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public void destroy(Integer id) throws IllegalOrphanException, NonexistentEntityException {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            Pedidos pedidos;
            try {
                pedidos = em.getReference(Pedidos.class, id);
                pedidos.getNumPedido();
            } catch (EntityNotFoundException enfe) {
                throw new NonexistentEntityException("The pedidos with id " + id + " no longer exists.", enfe);
            }
            List<String> illegalOrphanMessages = null;
            Collection<Infopedidos> infopedidosCollectionOrphanCheck = pedidos.getInfopedidosCollection();
            for (Infopedidos infopedidosCollectionOrphanCheckInfopedidos : infopedidosCollectionOrphanCheck) {
                if (illegalOrphanMessages == null) {
                    illegalOrphanMessages = new ArrayList<String>();
                }
                illegalOrphanMessages.add("This Pedidos (" + pedidos + ") cannot be destroyed since the Infopedidos " + infopedidosCollectionOrphanCheckInfopedidos + " in its infopedidosCollection field has a non-nullable pedidos field.");
            }
            if (illegalOrphanMessages != null) {
                throw new IllegalOrphanException(illegalOrphanMessages);
            }
            Clientes cliente = pedidos.getCliente();
            if (cliente != null) {
                cliente.getPedidosCollection().remove(pedidos);
                cliente = em.merge(cliente);
            }
            em.remove(pedidos);
            em.getTransaction().commit();
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public List<Pedidos> findPedidosEntities() {
        return findPedidosEntities(true, -1, -1);
    }

    public List<Pedidos> findPedidosEntities(int maxResults, int firstResult) {
        return findPedidosEntities(false, maxResults, firstResult);
    }

    private List<Pedidos> findPedidosEntities(boolean all, int maxResults, int firstResult) {
        EntityManager em = getEntityManager();
        try {
            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
            cq.select(cq.from(Pedidos.class));
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

    public Pedidos findPedidos(Integer id) {
        EntityManager em = getEntityManager();
        try {
            return em.find(Pedidos.class, id);
        } finally {
            em.close();
        }
    }

    public int getPedidosCount() {
        EntityManager em = getEntityManager();
        try {
            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
            Root<Pedidos> rt = cq.from(Pedidos.class);
            cq.select(em.getCriteriaBuilder().count(rt));
            Query q = em.createQuery(cq);
            return ((Long) q.getSingleResult()).intValue();
        } finally {
            em.close();
        }
    }
    
}
