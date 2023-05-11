/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controladores;

import controladores.exceptions.NonexistentEntityException;
import controladores.exceptions.PreexistingEntityException;
import entidades.Infopedidos;
import entidades.InfopedidosPK;
import java.io.Serializable;
import javax.persistence.Query;
import javax.persistence.EntityNotFoundException;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;
import entidades.Pedidos;
import entidades.Productos;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;

/**
 *
 * @author sajm <sjimmaz322 at sjimmaz322@g.educaand.es>
 */
public class InfopedidosJpaController implements Serializable {

    public InfopedidosJpaController(EntityManagerFactory emf) {
        this.emf = emf;
    }
    private EntityManagerFactory emf = null;

    public EntityManager getEntityManager() {
        return emf.createEntityManager();
    }

    public void create(Infopedidos infopedidos) throws PreexistingEntityException, Exception {
        if (infopedidos.getInfopedidosPK() == null) {
            infopedidos.setInfopedidosPK(new InfopedidosPK());
        }
        infopedidos.getInfopedidosPK().setIdProducto(infopedidos.getProductos().getId());
        infopedidos.getInfopedidosPK().setNumPedido(infopedidos.getPedidos().getNumPedido());
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            Pedidos pedidos = infopedidos.getPedidos();
            if (pedidos != null) {
                pedidos = em.getReference(pedidos.getClass(), pedidos.getNumPedido());
                infopedidos.setPedidos(pedidos);
            }
            Productos productos = infopedidos.getProductos();
            if (productos != null) {
                productos = em.getReference(productos.getClass(), productos.getId());
                infopedidos.setProductos(productos);
            }
            em.persist(infopedidos);
            if (pedidos != null) {
                pedidos.getInfopedidosCollection().add(infopedidos);
                pedidos = em.merge(pedidos);
            }
            if (productos != null) {
                productos.getInfopedidosCollection().add(infopedidos);
                productos = em.merge(productos);
            }
            em.getTransaction().commit();
        } catch (Exception ex) {
            if (findInfopedidos(infopedidos.getInfopedidosPK()) != null) {
                throw new PreexistingEntityException("Infopedidos " + infopedidos + " already exists.", ex);
            }
            throw ex;
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public void edit(Infopedidos infopedidos) throws NonexistentEntityException, Exception {
        infopedidos.getInfopedidosPK().setIdProducto(infopedidos.getProductos().getId());
        infopedidos.getInfopedidosPK().setNumPedido(infopedidos.getPedidos().getNumPedido());
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            Infopedidos persistentInfopedidos = em.find(Infopedidos.class, infopedidos.getInfopedidosPK());
            Pedidos pedidosOld = persistentInfopedidos.getPedidos();
            Pedidos pedidosNew = infopedidos.getPedidos();
            Productos productosOld = persistentInfopedidos.getProductos();
            Productos productosNew = infopedidos.getProductos();
            if (pedidosNew != null) {
                pedidosNew = em.getReference(pedidosNew.getClass(), pedidosNew.getNumPedido());
                infopedidos.setPedidos(pedidosNew);
            }
            if (productosNew != null) {
                productosNew = em.getReference(productosNew.getClass(), productosNew.getId());
                infopedidos.setProductos(productosNew);
            }
            infopedidos = em.merge(infopedidos);
            if (pedidosOld != null && !pedidosOld.equals(pedidosNew)) {
                pedidosOld.getInfopedidosCollection().remove(infopedidos);
                pedidosOld = em.merge(pedidosOld);
            }
            if (pedidosNew != null && !pedidosNew.equals(pedidosOld)) {
                pedidosNew.getInfopedidosCollection().add(infopedidos);
                pedidosNew = em.merge(pedidosNew);
            }
            if (productosOld != null && !productosOld.equals(productosNew)) {
                productosOld.getInfopedidosCollection().remove(infopedidos);
                productosOld = em.merge(productosOld);
            }
            if (productosNew != null && !productosNew.equals(productosOld)) {
                productosNew.getInfopedidosCollection().add(infopedidos);
                productosNew = em.merge(productosNew);
            }
            em.getTransaction().commit();
        } catch (Exception ex) {
            String msg = ex.getLocalizedMessage();
            if (msg == null || msg.length() == 0) {
                InfopedidosPK id = infopedidos.getInfopedidosPK();
                if (findInfopedidos(id) == null) {
                    throw new NonexistentEntityException("The infopedidos with id " + id + " no longer exists.");
                }
            }
            throw ex;
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public void destroy(InfopedidosPK id) throws NonexistentEntityException {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            Infopedidos infopedidos;
            try {
                infopedidos = em.getReference(Infopedidos.class, id);
                infopedidos.getInfopedidosPK();
            } catch (EntityNotFoundException enfe) {
                throw new NonexistentEntityException("The infopedidos with id " + id + " no longer exists.", enfe);
            }
            Pedidos pedidos = infopedidos.getPedidos();
            if (pedidos != null) {
                pedidos.getInfopedidosCollection().remove(infopedidos);
                pedidos = em.merge(pedidos);
            }
            Productos productos = infopedidos.getProductos();
            if (productos != null) {
                productos.getInfopedidosCollection().remove(infopedidos);
                productos = em.merge(productos);
            }
            em.remove(infopedidos);
            em.getTransaction().commit();
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public List<Infopedidos> findInfopedidosEntities() {
        return findInfopedidosEntities(true, -1, -1);
    }

    public List<Infopedidos> findInfopedidosEntities(int maxResults, int firstResult) {
        return findInfopedidosEntities(false, maxResults, firstResult);
    }

    private List<Infopedidos> findInfopedidosEntities(boolean all, int maxResults, int firstResult) {
        EntityManager em = getEntityManager();
        try {
            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
            cq.select(cq.from(Infopedidos.class));
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

    public Infopedidos findInfopedidos(InfopedidosPK id) {
        EntityManager em = getEntityManager();
        try {
            return em.find(Infopedidos.class, id);
        } finally {
            em.close();
        }
    }

    public int getInfopedidosCount() {
        EntityManager em = getEntityManager();
        try {
            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
            Root<Infopedidos> rt = cq.from(Infopedidos.class);
            cq.select(em.getCriteriaBuilder().count(rt));
            Query q = em.createQuery(cq);
            return ((Long) q.getSingleResult()).intValue();
        } finally {
            em.close();
        }
    }
    
}
