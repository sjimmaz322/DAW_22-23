/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package daw;

import java.util.Objects;

/**
 *
 * @author sajm <sjimmaz322 at sjimmaz322@g.educaand.es>
 */
public abstract class Obra {

    private int id;
    private String autor;
    private int numRestauraciones;

    public Obra() {
    }

    public Obra(int id, String autor) {
        this.id = id;
        this.autor = autor;
        this.numRestauraciones = 0;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getNumRestauraciones() {
        return numRestauraciones;
    }

    public void setNumRestauraciones(int numRestauraciones) {
        this.numRestauraciones = numRestauraciones;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 67 * hash + this.id;
        hash = 67 * hash + Objects.hashCode(this.autor);
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
        final Obra other = (Obra) obj;
        if (this.id != other.id) {
            return false;
        }
        return Objects.equals(this.autor, other.autor);
    }

    @Override
    public String toString() {
        return "Obra{" + "id=" + id + ", autor=" + autor + ", numRestauraciones=" + numRestauraciones + '}';
    }

}
