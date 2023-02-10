/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ej1;

/**
 *
 * @author samuel
 */
public class Abatible extends Ventana {
    
    private int angulo;
    
    public Abatible() {
    }
    
    public Abatible(int angulo, String estado) {
        super(estado);
        this.angulo = angulo;
    }
    
    public int getAngulo() {
        return angulo;
    }
    
    public void setAngulo(int angulo) {
        this.angulo = angulo;
    }
    @Override
        public void abrir(){
        System.out.println("Abriendo la ventana abatible, no te des en la cabeza");
    }
    @Override
    public void cerrar(){
        System.out.println("Cerrando la ventana abatible, cuidado con los dedos");
    }
    
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString()).append("\n");
        sb.append("Ángulo de giro ").append(angulo).append(" grados.");
        return sb.toString();
    }
    
}
