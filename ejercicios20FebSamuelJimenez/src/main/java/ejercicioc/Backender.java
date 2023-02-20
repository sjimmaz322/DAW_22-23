/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicioc;

/**
 *
 * @author sajm <sjimmaz322 at sjimmaz322@g.educaand.es>
 */
public class Backender extends Empleado {

    private String lenguajePredilecto;

    public Backender() {
    }

    public Backender(String lenguajePredilecto, String nombre, String apellido, int edad, int antiguedad) {
        super(nombre, apellido, edad, antiguedad);
        this.lenguajePredilecto = lenguajePredilecto;
    }

    public String getLenguajePredilecto() {
        return lenguajePredilecto;
    }

    public void setLenguajePredilecto(String lenguajePredilecto) {
        this.lenguajePredilecto = lenguajePredilecto;
    }
    
    

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.append("Backender{");
        sb.append("lenguajePredilecto=").append(lenguajePredilecto);
        sb.append('}');
        return sb.toString();
    }

    @Override
    protected void trabajar() {
        System.out.println("Como Backender " + this.getNombre() + " está trasteando el código.");
    }

    public void documentarCodigo() {
        System.out.println(super.getNombre() + " está comentando el código, tardará un total de horas de: Sí");
    }

}
