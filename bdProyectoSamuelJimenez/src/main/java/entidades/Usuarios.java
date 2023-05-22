/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entidades;

import java.io.Serializable;
import java.time.LocalDate;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.Objects;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author samuel
 */
@Entity
@Table(name = "usuarios")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Usuarios.findAll", query = "SELECT u FROM Usuarios u"),
    @NamedQuery(name = "Usuarios.findByCodUsuario", query = "SELECT u FROM Usuarios u WHERE u.codUsuario = :codUsuario"),
    @NamedQuery(name = "Usuarios.findByNombre", query = "SELECT u FROM Usuarios u WHERE u.nombre = :nombre"),
    @NamedQuery(name = "Usuarios.findByEdad", query = "SELECT u FROM Usuarios u WHERE u.edad = :edad"),
    @NamedQuery(name = "Usuarios.findByDireccion", query = "SELECT u FROM Usuarios u WHERE u.direccion = :direccion"),
    @NamedQuery(name = "Usuarios.findByFecCumpleanios", query = "SELECT u FROM Usuarios u WHERE u.fecCumpleanios = :fecCumpleanios")})
public class Usuarios implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "codUsuario")
    private Integer codUsuario;
    @Column(name = "nombre")
    private String nombre;
    @Column(name = "edad")
    private Integer edad;
    @Column(name = "direccion")
    private String direccion;
    @Column(name = "fecCumpleanios")
    @Temporal(TemporalType.DATE)
    private Date fecCumpleanios;
    @OneToOne(mappedBy = "codUsuario")
    private Jugadores jugador;

    public Usuarios() {
    }

    public Usuarios(Integer codUsuario) {
        this.codUsuario = codUsuario;
    }

    public Usuarios(String nombre, Integer edad, String direccion, Date fecCumpleanios) {
        this.nombre = nombre;
        this.edad = edad;
        this.direccion = direccion;
        this.fecCumpleanios = fecCumpleanios;
        this.jugador = null;
    }

    public Integer getCodUsuario() {
        return codUsuario;
    }

    public void setCodUsuario(Integer codUsuario) {
        this.codUsuario = codUsuario;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Integer getEdad() {
        return edad;
    }

    public void setEdad(Integer edad) {
        this.edad = edad;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public LocalDate getFecCumpleanios() {
        return new Date(this.fecCumpleanios.getTime()).
                toInstant().
                atZone(ZoneId.systemDefault()).
                toLocalDate();
    }

    public void setFechaInicio(Date fechaInicio) {
        this.fecCumpleanios = fechaInicio;
    }

    @XmlTransient

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (codUsuario != null ? codUsuario.hashCode() : 0);
        return hash;
    }

    public Jugadores getJugador() {
        return jugador;
    }

    public void setJugador(Jugadores jugador) {
        this.jugador = jugador;
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
        final Usuarios other = (Usuarios) obj;
        if (!Objects.equals(this.nombre, other.nombre)) {
            return false;
        }
        if (!Objects.equals(this.direccion, other.direccion)) {
            return false;
        }
        if (!Objects.equals(this.edad, other.edad)) {
            return false;
        }
        return Objects.equals(this.fecCumpleanios, other.fecCumpleanios);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("---***---").append("\n");
        sb.append("Nombre: ").append(nombre).append("\n");
        sb.append("Edad: ").append(edad).append("\n");
        sb.append("Direccion: ").append(direccion).append("\n");
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd-MM-yyyy");
        sb.append("Cumpleaños: ").append(this.getFecCumpleanios().format(dtf)).append("\n");
        try {
            sb.append("A.k.a: ").append(jugador.getApodo()).append("\n");
        } catch (NullPointerException npe) {
            sb.append("No tiene jugador asociado").append("\n");
        }
        sb.append("---***---");
        return sb.toString();
    }

}
