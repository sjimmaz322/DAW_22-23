/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entidades;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 *
 * @author sajm <sjimmaz322 at sjimmaz322@g.educaand.es>
 */
@Embeddable
public class InfopedidosPK implements Serializable {

    @Basic(optional = false)
    @Column(name = "idProducto")
    private int idProducto;
    @Basic(optional = false)
    @Column(name = "numPedido")
    private int numPedido;

    public InfopedidosPK() {
    }

    public InfopedidosPK(int idProducto, int numPedido) {
        this.idProducto = idProducto;
        this.numPedido = numPedido;
    }

    public int getIdProducto() {
        return idProducto;
    }

    public void setIdProducto(int idProducto) {
        this.idProducto = idProducto;
    }

    public int getNumPedido() {
        return numPedido;
    }

    public void setNumPedido(int numPedido) {
        this.numPedido = numPedido;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (int) idProducto;
        hash += (int) numPedido;
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof InfopedidosPK)) {
            return false;
        }
        InfopedidosPK other = (InfopedidosPK) object;
        if (this.idProducto != other.idProducto) {
            return false;
        }
        if (this.numPedido != other.numPedido) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entidades.InfopedidosPK[ idProducto=" + idProducto + ", numPedido=" + numPedido + " ]";
    }
    
}
