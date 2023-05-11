/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entidades;

import java.io.Serializable;
import java.math.BigDecimal;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author sajm <sjimmaz322 at sjimmaz322@g.educaand.es>
 */
@Entity
@Table(name = "infopedidos")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Infopedidos.findAll", query = "SELECT i FROM Infopedidos i"),
    @NamedQuery(name = "Infopedidos.findByIdProducto", query = "SELECT i FROM Infopedidos i WHERE i.infopedidosPK.idProducto = :idProducto"),
    @NamedQuery(name = "Infopedidos.findByNumPedido", query = "SELECT i FROM Infopedidos i WHERE i.infopedidosPK.numPedido = :numPedido"),
    @NamedQuery(name = "Infopedidos.findByTotalPedido", query = "SELECT i FROM Infopedidos i WHERE i.totalPedido = :totalPedido")})
public class Infopedidos implements Serializable {

    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected InfopedidosPK infopedidosPK;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "totalPedido")
    private BigDecimal totalPedido;
    @JoinColumn(name = "numPedido", referencedColumnName = "numPedido", insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private Pedidos pedidos;
    @JoinColumn(name = "idProducto", referencedColumnName = "id", insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private Productos productos;

    public Infopedidos() {
    }

    public Infopedidos(InfopedidosPK infopedidosPK) {
        this.infopedidosPK = infopedidosPK;
    }

    public Infopedidos(int idProducto, int numPedido) {
        this.infopedidosPK = new InfopedidosPK(idProducto, numPedido);
    }

    public InfopedidosPK getInfopedidosPK() {
        return infopedidosPK;
    }

    public void setInfopedidosPK(InfopedidosPK infopedidosPK) {
        this.infopedidosPK = infopedidosPK;
    }

    public BigDecimal getTotalPedido() {
        return totalPedido;
    }

    public void setTotalPedido(BigDecimal totalPedido) {
        this.totalPedido = totalPedido;
    }

    public Pedidos getPedidos() {
        return pedidos;
    }

    public void setPedidos(Pedidos pedidos) {
        this.pedidos = pedidos;
    }

    public Productos getProductos() {
        return productos;
    }

    public void setProductos(Productos productos) {
        this.productos = productos;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (infopedidosPK != null ? infopedidosPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Infopedidos)) {
            return false;
        }
        Infopedidos other = (Infopedidos) object;
        if ((this.infopedidosPK == null && other.infopedidosPK != null) || (this.infopedidosPK != null && !this.infopedidosPK.equals(other.infopedidosPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entidades.Infopedidos[ infopedidosPK=" + infopedidosPK + " ]";
    }
    
}
