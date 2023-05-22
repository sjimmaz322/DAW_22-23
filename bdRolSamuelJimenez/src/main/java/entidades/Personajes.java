/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entidades;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.Lob;
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
@Table(name = "personajes")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Personajes.findAll", query = "SELECT p FROM Personajes p"),
    @NamedQuery(name = "Personajes.findById", query = "SELECT p FROM Personajes p WHERE p.id = :id"),
    @NamedQuery(name = "Personajes.findByNombre", query = "SELECT p FROM Personajes p WHERE p.nombre = :nombre"),
    @NamedQuery(name = "Personajes.findByArquetipo", query = "SELECT p FROM Personajes p WHERE p.arquetipo = :arquetipo"),
    @NamedQuery(name = "Personajes.findByNivel", query = "SELECT p FROM Personajes p WHERE p.nivel = :nivel"),
    @NamedQuery(name = "Personajes.findByAlineacion", query = "SELECT p FROM Personajes p WHERE p.alineacion = :alineacion")})
public class Personajes implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private Integer id;
    @Column(name = "nombre")
    private String nombre;
    @Column(name = "arquetipo")
    private String arquetipo;
    @Lob
    @Column(name = "trasfondo")
    private String trasfondo;
    @Column(name = "nivel")
    private Integer nivel;
    @Column(name = "alineacion")
    private String alineacion;
    @JoinColumn(name = "idJugador", referencedColumnName = "id")
    @ManyToOne
    private Jugadores idJugador;

    public Personajes() {
    }

    public Personajes(Integer id) {
        this.id = id;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getArquetipo() {
        return arquetipo;
    }

    public void setArquetipo(String arquetipo) {
        this.arquetipo = arquetipo;
    }

    public String getTrasfondo() {
        return trasfondo;
    }

    public void setTrasfondo(String trasfondo) {
        this.trasfondo = trasfondo;
    }

    public Integer getNivel() {
        return nivel;
    }

    public void setNivel(Integer nivel) {
        this.nivel = nivel;
    }

    public String getAlineacion() {
        return alineacion;
    }

    public void setAlineacion(String alineacion) {
        this.alineacion = alineacion;
    }

    public Jugadores getIdJugador() {
        return idJugador;
    }

    public void setIdJugador(Jugadores idJugador) {
        this.idJugador = idJugador;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Personajes)) {
            return false;
        }
        Personajes other = (Personajes) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entidades.Personajes[ id=" + id + " ]";
    }
    
}
