/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package museo;

/**
 *
 * @author sajm <sjimmaz322 at sjimmaz322@g.educaand.es>
 */
public final class Vigilante extends Empleado {

    private String empresa;

    public Vigilante() {
    }

    public Vigilante(String empresa, String nif, String nombre) {
        super(nif, nombre);
        this.empresa = empresa;
    }

    public String getEmpresa() {
        return empresa;
    }

    public void setEmpresa(String empresa) {
        this.empresa = empresa;
    }

    @Override
    public String toString() {
        return super.toString() + "Vigilante{" + "empresa=" + empresa + '}';
    }

}
