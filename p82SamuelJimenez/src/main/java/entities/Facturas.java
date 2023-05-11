/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entities;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author sajm <sjimmaz322 at sjimmaz322@g.educaand.es>
 */
@Entity
@Table(name = "facturas")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Facturas.findAll", query = "SELECT f FROM Facturas f"),
    @NamedQuery(name = "Facturas.findByCodigoUnico", query = "SELECT f FROM Facturas f WHERE f.codigoUnico = :codigoUnico"),
    @NamedQuery(name = "Facturas.findByFechaEmision", query = "SELECT f FROM Facturas f WHERE f.fechaEmision = :fechaEmision"),
    @NamedQuery(name = "Facturas.findByDescripcion", query = "SELECT f FROM Facturas f WHERE f.descripcion = :descripcion"),
    @NamedQuery(name = "Facturas.findByTotalImporte", query = "SELECT f FROM Facturas f WHERE f.totalImporte = :totalImporte")})
public class Facturas implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "codigoUnico")
    private Integer codigoUnico;
    @Column(name = "fechaEmision")
    @Temporal(TemporalType.DATE)
    private Date fechaEmision;
    @Column(name = "descripcion")
    private String descripcion;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "totalImporte")
    private double totalImporte;

    public Facturas() {
    }

    public Facturas(Integer codigoUnico) {
        this.codigoUnico = codigoUnico;
    }

    public Integer getCodigoUnico() {
        return codigoUnico;
    }

    public void setCodigoUnico(Integer codigoUnico) {
        this.codigoUnico = codigoUnico;
    }

    public Date getFechaEmision() {
        return fechaEmision;
    }

    public void setFechaEmision(Date fechaEmision) {
        this.fechaEmision = fechaEmision;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public double getTotalImporte() {
        return totalImporte;
    }

    public void setTotalImporte(double totalImporte) {
        this.totalImporte = totalImporte;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (codigoUnico != null ? codigoUnico.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Facturas)) {
            return false;
        }
        Facturas other = (Facturas) object;
        if ((this.codigoUnico == null && other.codigoUnico != null) || (this.codigoUnico != null && !this.codigoUnico.equals(other.codigoUnico))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entities.Facturas[ codigoUnico=" + codigoUnico + " ]";
    }

}
