/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entidades;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author samuel
 */
@Entity
@Table(name = "jugadores")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Jugadores.findAll", query = "SELECT j FROM Jugadores j"),
    @NamedQuery(name = "Jugadores.findById", query = "SELECT j FROM Jugadores j WHERE j.id = :id"),
    @NamedQuery(name = "Jugadores.findByApodo", query = "SELECT j FROM Jugadores j WHERE j.apodo = :apodo"),
    @NamedQuery(name = "Jugadores.findBySistemaPredilecto", query = "SELECT j FROM Jugadores j WHERE j.sistemaPredilecto = :sistemaPredilecto"),
    @NamedQuery(name = "Jugadores.findByRolPreferido", query = "SELECT j FROM Jugadores j WHERE j.rolPreferido = :rolPreferido")})
public class Jugadores implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private Integer id;
    @Column(name = "apodo")
    private String apodo;
    @Column(name = "sistemaPredilecto")
    private String sistemaPredilecto;
    @Column(name = "rolPreferido")
    private String rolPreferido;
    @OneToMany(mappedBy = "idJugador")
    private List<Personajes> personajesList;
    @JoinColumn(name = "codUsuario", referencedColumnName = "codUsuario")
    @OneToOne
    private Usuarios codUsuario;

    public Jugadores() {
    }

    public Jugadores(Integer id) {
        this.id = id;
    }

    public Jugadores(String apodo, String sistemaPredilecto, String rolPreferido, List<Personajes> personajesList) {
        this.apodo = apodo;
        this.sistemaPredilecto = sistemaPredilecto;
        this.rolPreferido = rolPreferido;
        this.personajesList = new ArrayList<>();
        this.codUsuario = null;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getApodo() {
        return apodo;
    }

    public void setApodo(String apodo) {
        this.apodo = apodo;
    }

    public String getSistemaPredilecto() {
        return sistemaPredilecto;
    }

    public void setSistemaPredilecto(String sistemaPredilecto) {
        this.sistemaPredilecto = sistemaPredilecto;
    }

    public String getRolPreferido() {
        return rolPreferido;
    }

    public void setRolPreferido(String rolPreferido) {
        this.rolPreferido = rolPreferido;
    }

    @XmlTransient
    public List<Personajes> getPersonajesList() {
        return personajesList;
    }

    public void setPersonajesList(List<Personajes> personajesList) {
        this.personajesList = personajesList;
    }

    public Usuarios getCodUsuario() {
        return codUsuario;
    }

    public void setCodUsuario(Usuarios codUsuario) {
        this.codUsuario = codUsuario;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Jugadores other = (Jugadores) obj;
        if (!Objects.equals(this.apodo, other.apodo)) {
            return false;
        }
        if (!Objects.equals(this.sistemaPredilecto, other.sistemaPredilecto)) {
            return false;
        }
        if (!Objects.equals(this.rolPreferido, other.rolPreferido)) {
            return false;
        }
        return Objects.equals(this.codUsuario, other.codUsuario);
    }



    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("---***---").append("\n");
        sb.append("Conocido como: ").append(apodo).append("\n");
        sb.append("Suele jugar a: ").append(sistemaPredilecto).append("\n");
        sb.append("Juega como: ").append(rolPreferido).append("\n");
        if (!toStringPersonajes().equalsIgnoreCase("")) {
            sb.append("Sus personajes son: \n").append(toStringPersonajes()).append("\n");
        } else {
            sb.append("Sus personajes son: \n").append("No hay personajes asociados").append("\n");
        }
        try {
            sb.append("Se llama: ").append(codUsuario.getNombre()).append("\n");
        } catch (NullPointerException npe) {
            sb.append("No hay usuario asociado").append("\n");
        }
        sb.append("---***---");
        return sb.toString();
    }

    private String toStringPersonajes() {
        StringBuilder tmp = new StringBuilder();
        for (Personajes p : personajesList) {
            tmp.append("\t").append(p.getNombre());
        }
        return tmp.toString();
    }
}