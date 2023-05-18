/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entidades;

import java.io.Serializable;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author sajm <sjimmaz322 at sjimmaz322@g.educaand.es>
 */
@Entity
@Table(name = "jugadores")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Jugadores.findAll", query = "SELECT j FROM Jugadores j"),
    @NamedQuery(name = "Jugadores.findById", query = "SELECT j FROM Jugadores j WHERE j.id = :id"),
    @NamedQuery(name = "Jugadores.findByNombre", query = "SELECT j FROM Jugadores j WHERE j.nombre = :nombre"),
    @NamedQuery(name = "Jugadores.findByApodo", query = "SELECT j FROM Jugadores j WHERE j.apodo = :apodo"),
    @NamedQuery(name = "Jugadores.findByEdad", query = "SELECT j FROM Jugadores j WHERE j.edad = :edad")})
public class Jugadores implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private Integer id;
    @Column(name = "nombre")
    private String nombre;
    @Column(name = "apodo")
    private String apodo;
    @Column(name = "edad")
    private Integer edad;
    @OneToMany(mappedBy = "idJugador")
    private List<Personajes> personajesList;

    public Jugadores() {
    }

    public Jugadores(Integer id) {
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

    public String getApodo() {
        return apodo;
    }

    public void setApodo(String apodo) {
        this.apodo = apodo;
    }

    public Integer getEdad() {
        return edad;
    }

    public void setEdad(Integer edad) {
        this.edad = edad;
    }

    @XmlTransient
    public List<Personajes> getPersonajesList() {
        return personajesList;
    }

    public void setPersonajesList(List<Personajes> personajesList) {
        this.personajesList = personajesList;
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
        if (!(object instanceof Jugadores)) {
            return false;
        }
        Jugadores other = (Jugadores) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Jugadores{" + "id=" + id + ", nombre=" + nombre + ", apodo=" + apodo + ", edad=" + edad + ", personajesList=" + toStringPersonajes() + '}';
    }

    private String toStringPersonajes() {

        StringBuilder tmp = new StringBuilder();
        for (Personajes p : personajesList) {
            tmp.append(p.toString()).append(", ");
        }

        return tmp.length() == 0 ? tmp.toString() : tmp.toString() + "\b\b";
    }

}
