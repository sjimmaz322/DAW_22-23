/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controladores;

import controladores.exceptions.NonexistentEntityException;
import entidades.Clientes;
import java.io.Serializable;
import javax.persistence.Query;
import javax.persistence.EntityNotFoundException;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;
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
public class ClientesJpaController implements Serializable {

    public ClientesJpaController(EntityManagerFactory emf) {
        this.emf = emf;
    }
    private EntityManagerFactory emf = null;

    public EntityManager getEntityManager() {
        return emf.createEntityManager();
    }

    public void create(Clientes clientes) {
        if (clientes.getPedidosCollection() == null) {
            clientes.setPedidosCollection(new ArrayList<Pedidos>());
        }
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            Collection<Pedidos> attachedPedidosCollection = new ArrayList<Pedidos>();
            for (Pedidos pedidosCollectionPedidosToAttach : clientes.getPedidosCollection()) {
                pedidosCollectionPedidosToAttach = em.getReference(pedidosCollectionPedidosToAttach.getClass(), pedidosCollectionPedidosToAttach.getNumPedido());
                attachedPedidosCollection.add(pedidosCollectionPedidosToAttach);
            }
            clientes.setPedidosCollection(attachedPedidosCollection);
            em.persist(clientes);
            for (Pedidos pedidosCollectionPedidos : clientes.getPedidosCollection()) {
                Clientes oldClienteOfPedidosCollectionPedidos = pedidosCollectionPedidos.getCliente();
                pedidosCollectionPedidos.setCliente(clientes);
                pedidosCollectionPedidos = em.merge(pedidosCollectionPedidos);
                if (oldClienteOfPedidosCollectionPedidos != null) {
                    oldClienteOfPedidosCollectionPedidos.getPedidosCollection().remove(pedidosCollectionPedidos);
                    oldClienteOfPedidosCollectionPedidos = em.merge(oldClienteOfPedidosCollectionPedidos);
                }
            }
            em.getTransaction().commit();
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public void edit(Clientes clientes) throws NonexistentEntityException, Exception {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            Clientes persistentClientes = em.find(Clientes.class, clientes.getId());
            Collection<Pedidos> pedidosCollectionOld = persistentClientes.getPedidosCollection();
            Collection<Pedidos> pedidosCollectionNew = clientes.getPedidosCollection();
            Collection<Pedidos> attachedPedidosCollectionNew = new ArrayList<Pedidos>();
            for (Pedidos pedidosCollectionNewPedidosToAttach : pedidosCollectionNew) {
                pedidosCollectionNewPedidosToAttach = em.getReference(pedidosCollectionNewPedidosToAttach.getClass(), pedidosCollectionNewPedidosToAttach.getNumPedido());
                attachedPedidosCollectionNew.add(pedidosCollectionNewPedidosToAttach);
            }
            pedidosCollectionNew = attachedPedidosCollectionNew;
            clientes.setPedidosCollection(pedidosCollectionNew);
            clientes = em.merge(clientes);
            for (Pedidos pedidosCollectionOldPedidos : pedidosCollectionOld) {
                if (!pedidosCollectionNew.contains(pedidosCollectionOldPedidos)) {
                    pedidosCollectionOldPedidos.setCliente(null);
                    pedidosCollectionOldPedidos = em.merge(pedidosCollectionOldPedidos);
                }
            }
            for (Pedidos pedidosCollectionNewPedidos : pedidosCollectionNew) {
                if (!pedidosCollectionOld.contains(pedidosCollectionNewPedidos)) {
                    Clientes oldClienteOfPedidosCollectionNewPedidos = pedidosCollectionNewPedidos.getCliente();
                    pedidosCollectionNewPedidos.setCliente(clientes);
                    pedidosCollectionNewPedidos = em.merge(pedidosCollectionNewPedidos);
                    if (oldClienteOfPedidosCollectionNewPedidos != null && !oldClienteOfPedidosCollectionNewPedidos.equals(clientes)) {
                        oldClienteOfPedidosCollectionNewPedidos.getPedidosCollection().remove(pedidosCollectionNewPedidos);
                        oldClienteOfPedidosCollectionNewPedidos = em.merge(oldClienteOfPedidosCollectionNewPedidos);
                    }
                }
            }
            em.getTransaction().commit();
        } catch (Exception ex) {
            String msg = ex.getLocalizedMessage();
            if (msg == null || msg.length() == 0) {
                Integer id = clientes.getId();
                if (findClientes(id) == null) {
                    throw new NonexistentEntityException("The clientes with id " + id + " no longer exists.");
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
            Clientes clientes;
            try {
                clientes = em.getReference(Clientes.class, id);
                clientes.getId();
            } catch (EntityNotFoundException enfe) {
                throw new NonexistentEntityException("The clientes with id " + id + " no longer exists.", enfe);
            }
            Collection<Pedidos> pedidosCollection = clientes.getPedidosCollection();
            for (Pedidos pedidosCollectionPedidos : pedidosCollection) {
                pedidosCollectionPedidos.setCliente(null);
                pedidosCollectionPedidos = em.merge(pedidosCollectionPedidos);
            }
            em.remove(clientes);
            em.getTransaction().commit();
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public List<Clientes> findClientesEntities() {
        return findClientesEntities(true, -1, -1);
    }

    public List<Clientes> findClientesEntities(int maxResults, int firstResult) {
        return findClientesEntities(false, maxResults, firstResult);
    }

    private List<Clientes> findClientesEntities(boolean all, int maxResults, int firstResult) {
        EntityManager em = getEntityManager();
        try {
            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
            cq.select(cq.from(Clientes.class));
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

    public Clientes findClientes(Integer id) {
        EntityManager em = getEntityManager();
        try {
            return em.find(Clientes.class, id);
        } finally {
            em.close();
        }
    }

    public int getClientesCount() {
        EntityManager em = getEntityManager();
        try {
            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
            Root<Clientes> rt = cq.from(Clientes.class);
            cq.select(em.getCriteriaBuilder().count(rt));
            Query q = em.createQuery(cq);
            return ((Long) q.getSingleResult()).intValue();
        } finally {
            em.close();
        }
    }
    
}
