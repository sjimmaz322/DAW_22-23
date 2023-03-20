/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package daw;

/**
 *
 * @author sajm <sjimmaz322 at sjimmaz322@g.educaand.es>
 */
public abstract class Conservador extends Empleado implements Restaurador {

    private String numColegiado;

    public Conservador() {
    }

    public Conservador(String numColegiado, String nif, String nombre) {
        super(nif, nombre);
        this.numColegiado = numColegiado;
    }

    public String getNumColegiado() {
        return numColegiado;
    }

    public void setNumColegiado(String numColegiado) {
        this.numColegiado = numColegiado;
    }

    @Override
    public String toString() {
        return super.toString() + "\nConservador{" + "numColegiado=" + numColegiado + '}';
    }

}
