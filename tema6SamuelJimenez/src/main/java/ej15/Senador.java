/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ej15;

/**
 *
 * @author sajm <sjimmaz322 at sjimmaz322@g.educaand.es>
 */
public class Senador extends Legislador {

    private double complemento;

    public Senador() {
    }

    public Senador(double complemento, String provincia, String partidoPolitico, String nombre, String apellidos) {
        super(provincia, partidoPolitico, nombre, apellidos);
        this.complemento = complemento;
    }

    public double getComplemento() {
        return complemento;
    }

    public void setComplemento(double complemento) {
        this.complemento = complemento;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.append("Complemento por sesión recibido: ").append(complemento).append("€\n");;
        sb.append("----------");
        return sb.toString();
    }

    @Override
    public String getCamara() {
        return "Soy " + getNombre() + " y pertenezco a la cámara del senado, recibiendo un complemento de " + this.complemento + "€ por sesión.";
    }

}
