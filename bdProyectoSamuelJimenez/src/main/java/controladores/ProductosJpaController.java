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
import entidades.Infopedidos;
import entidades.Productos;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;

/**
 *
 * @author sajm <sjimmaz322 at sjimmaz322@g.educaand.es>
 */
public class ProductosJpaController implements Serializable {

    public ProductosJpaController(EntityManagerFactory emf) {
        this.emf = emf;
    }
    private EntityManagerFactory emf = null;

    public EntityManager getEntityManager() {
        return emf.createEntityManager();
    }

    public void create(Productos productos) {
        if (productos.getInfopedidosCollection() == null) {
            productos.setInfopedidosCollection(new ArrayList<Infopedidos>());
        }
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            Collection<Infopedidos> attachedInfopedidosCollection = new ArrayList<Infopedidos>();
            for (Infopedidos infopedidosCollectionInfopedidosToAttach : productos.getInfopedidosCollection()) {
                infopedidosCollectionInfopedidosToAttach = em.getReference(infopedidosCollectionInfopedidosToAttach.getClass(), infopedidosCollectionInfopedidosToAttach.getInfopedidosPK());
                attachedInfopedidosCollection.add(infopedidosCollectionInfopedidosToAttach);
            }
            productos.setInfopedidosCollection(attachedInfopedidosCollection);
            em.persist(productos);
            for (Infopedidos infopedidosCollectionInfopedidos : productos.getInfopedidosCollection()) {
                Productos oldProductosOfInfopedidosCollectionInfopedidos = infopedidosCollectionInfopedidos.getProductos();
                infopedidosCollectionInfopedidos.setProductos(productos);
                infopedidosCollectionInfopedidos = em.merge(infopedidosCollectionInfopedidos);
                if (oldProductosOfInfopedidosCollectionInfopedidos != null) {
                    oldProductosOfInfopedidosCollectionInfopedidos.getInfopedidosCollection().remove(infopedidosCollectionInfopedidos);
                    oldProductosOfInfopedidosCollectionInfopedidos = em.merge(oldProductosOfInfopedidosCollectionInfopedidos);
                }
            }
            em.getTransaction().commit();
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public void edit(Productos productos) throws IllegalOrphanException, NonexistentEntityException, Exception {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            Productos persistentProductos = em.find(Productos.class, productos.getId());
            Collection<Infopedidos> infopedidosCollectionOld = persistentProductos.getInfopedidosCollection();
            Collection<Infopedidos> infopedidosCollectionNew = productos.getInfopedidosCollection();
            List<String> illegalOrphanMessages = null;
            for (Infopedidos infopedidosCollectionOldInfopedidos : infopedidosCollectionOld) {
                if (!infopedidosCollectionNew.contains(infopedidosCollectionOldInfopedidos)) {
                    if (illegalOrphanMessages == null) {
                        illegalOrphanMessages = new ArrayList<String>();
                    }
                    illegalOrphanMessages.add("You must retain Infopedidos " + infopedidosCollectionOldInfopedidos + " since its productos field is not nullable.");
                }
            }
            if (illegalOrphanMessages != null) {
                throw new IllegalOrphanException(illegalOrphanMessages);
            }
            Collection<Infopedidos> attachedInfopedidosCollectionNew = new ArrayList<Infopedidos>();
            for (Infopedidos infopedidosCollectionNewInfopedidosToAttach : infopedidosCollectionNew) {
                infopedidosCollectionNewInfopedidosToAttach = em.getReference(infopedidosCollectionNewInfopedidosToAttach.getClass(), infopedidosCollectionNewInfopedidosToAttach.getInfopedidosPK());
                attachedInfopedidosCollectionNew.add(infopedidosCollectionNewInfopedidosToAttach);
            }
            infopedidosCollectionNew = attachedInfopedidosCollectionNew;
            productos.setInfopedidosCollection(infopedidosCollectionNew);
            productos = em.merge(productos);
            for (Infopedidos infopedidosCollectionNewInfopedidos : infopedidosCollectionNew) {
                if (!infopedidosCollectionOld.contains(infopedidosCollectionNewInfopedidos)) {
                    Productos oldProductosOfInfopedidosCollectionNewInfopedidos = infopedidosCollectionNewInfopedidos.getProductos();
                    infopedidosCollectionNewInfopedidos.setProductos(productos);
                    infopedidosCollectionNewInfopedidos = em.merge(infopedidosCollectionNewInfopedidos);
                    if (oldProductosOfInfopedidosCollectionNewInfopedidos != null && !oldProductosOfInfopedidosCollectionNewInfopedidos.equals(productos)) {
                        oldProductosOfInfopedidosCollectionNewInfopedidos.getInfopedidosCollection().remove(infopedidosCollectionNewInfopedidos);
                        oldProductosOfInfopedidosCollectionNewInfopedidos = em.merge(oldProductosOfInfopedidosCollectionNewInfopedidos);
                    }
                }
            }
            em.getTransaction().commit();
        } catch (Exception ex) {
            String msg = ex.getLocalizedMessage();
            if (msg == null || msg.length() == 0) {
                Integer id = productos.getId();
                if (findProductos(id) == null) {
                    throw new NonexistentEntityException("The productos with id " + id + " no longer exists.");
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
            Productos productos;
            try {
                productos = em.getReference(Productos.class, id);
                productos.getId();
            } catch (EntityNotFoundException enfe) {
                throw new NonexistentEntityException("The productos with id " + id + " no longer exists.", enfe);
            }
            List<String> illegalOrphanMessages = null;
            Collection<Infopedidos> infopedidosCollectionOrphanCheck = productos.getInfopedidosCollection();
            for (Infopedidos infopedidosCollectionOrphanCheckInfopedidos : infopedidosCollectionOrphanCheck) {
                if (illegalOrphanMessages == null) {
                    illegalOrphanMessages = new ArrayList<String>();
                }
                illegalOrphanMessages.add("This Productos (" + productos + ") cannot be destroyed since the Infopedidos " + infopedidosCollectionOrphanCheckInfopedidos + " in its infopedidosCollection field has a non-nullable productos field.");
            }
            if (illegalOrphanMessages != null) {
                throw new IllegalOrphanException(illegalOrphanMessages);
            }
            em.remove(productos);
            em.getTransaction().commit();
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public List<Productos> findProductosEntities() {
        return findProductosEntities(true, -1, -1);
    }

    public List<Productos> findProductosEntities(int maxResults, int firstResult) {
        return findProductosEntities(false, maxResults, firstResult);
    }

    private List<Productos> findProductosEntities(boolean all, int maxResults, int firstResult) {
        EntityManager em = getEntityManager();
        try {
            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
            cq.select(cq.from(Productos.class));
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

    public Productos findProductos(Integer id) {
        EntityManager em = getEntityManager();
        try {
            return em.find(Productos.class, id);
        } finally {
            em.close();
        }
    }

    public int getProductosCount() {
        EntityManager em = getEntityManager();
        try {
            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
            Root<Productos> rt = cq.from(Productos.class);
            cq.select(em.getCriteriaBuilder().count(rt));
            Query q = em.createQuery(cq);
            return ((Long) q.getSingleResult()).intValue();
        } finally {
            em.close();
        }
    }
    
}
