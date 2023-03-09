/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ej15;

/**
 *
 * @author sajm <sjimmaz322 at sjimmaz322@g.educaand.es>
 */
public abstract class Legislador extends Persona {

    private String provincia, partidoPolitico;

    public Legislador() {
    }

    public Legislador(String provincia, String partidoPolitico, String nombre, String apellidos) {
        super(nombre, apellidos);
        this.provincia = provincia;
        this.partidoPolitico = partidoPolitico;
    }

    public String getProvincia() {
        return provincia;
    }

    public void setProvincia(String provincia) {
        this.provincia = provincia;
    }

    public String getPartidoPolitico() {
        return partidoPolitico;
    }

    public void setPartidoPolitico(String partidoPolitico) {
        this.partidoPolitico = partidoPolitico;
    }

    public abstract String getCamara();

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.append("Provincia representada: ").append(provincia).append("\n");
        sb.append("Partido Politico al que pertenece: ").append(partidoPolitico).append("\n");
        return sb.toString();
    }

}
