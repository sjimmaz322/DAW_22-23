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
@Table(name = "partidas")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Partidas.findAll", query = "SELECT p FROM Partidas p"),
    @NamedQuery(name = "Partidas.findByNumPartida", query = "SELECT p FROM Partidas p WHERE p.numPartida = :numPartida"),
    @NamedQuery(name = "Partidas.findByNomDirector", query = "SELECT p FROM Partidas p WHERE p.nomDirector = :nomDirector"),
    @NamedQuery(name = "Partidas.findByNombreCampania", query = "SELECT p FROM Partidas p WHERE p.nombreCampania = :nombreCampania"),
    @NamedQuery(name = "Partidas.findByNumSesiones", query = "SELECT p FROM Partidas p WHERE p.numSesiones = :numSesiones"),
    @NamedQuery(name = "Partidas.findBySistema", query = "SELECT p FROM Partidas p WHERE p.sistema = :sistema")})
public class Partidas implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "numPartida")
    private Integer numPartida;
    @Column(name = "nomDirector")
    private String nomDirector;
    @Column(name = "nombreCampania")
    private String nombreCampania;
    @Column(name = "numSesiones")
    private Integer numSesiones;
    @Column(name = "sistema")
    private String sistema;
    @JoinColumn(name = "idPersonaje", referencedColumnName = "id")
    @ManyToOne
    private Personajes idPersonaje;

    public Partidas() {
    }

    public Partidas(Integer numPartida) {
        this.numPartida = numPartida;
    }

    public Integer getNumPartida() {
        return numPartida;
    }

    public void setNumPartida(Integer numPartida) {
        this.numPartida = numPartida;
    }

    public String getNomDirector() {
        return nomDirector;
    }

    public void setNomDirector(String nomDirector) {
        this.nomDirector = nomDirector;
    }

    public String getNombreCampania() {
        return nombreCampania;
    }

    public void setNombreCampania(String nombreCampania) {
        this.nombreCampania = nombreCampania;
    }

    public Integer getNumSesiones() {
        return numSesiones;
    }

    public void setNumSesiones(Integer numSesiones) {
        this.numSesiones = numSesiones;
    }

    public String getSistema() {
        return sistema;
    }

    public void setSistema(String sistema) {
        this.sistema = sistema;
    }

    public Personajes getIdPersonaje() {
        return idPersonaje;
    }

    public void setIdPersonaje(Personajes idPersonaje) {
        this.idPersonaje = idPersonaje;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (numPartida != null ? numPartida.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Partidas)) {
            return false;
        }
        Partidas other = (Partidas) object;
        if ((this.numPartida == null && other.numPartida != null) || (this.numPartida != null && !this.numPartida.equals(other.numPartida))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("---***---").append("\n");
        sb.append("Título: ").append(nombreCampania).append("\n");
        sb.append("Dirigida por: ").append(nomDirector).append("\n");
        sb.append("Nº Sesiones: ").append(numSesiones).append("\n");
        sb.append("Sistema: ").append(sistema).append("\n");
        sb.append("Participante: ").append(idPersonaje.getNombre()).append("\n");
        sb.append("---***---");
        return sb.toString();
    }

}
