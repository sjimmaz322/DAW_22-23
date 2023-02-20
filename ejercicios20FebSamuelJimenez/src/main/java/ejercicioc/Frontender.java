/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicioc;

/**
 *
 * @author sajm <sjimmaz322 at sjimmaz322@g.educaand.es>
 */
public class Frontender extends Empleado {

    private String colorFavorito;

    public Frontender() {
    }

    public Frontender(String colorFavorito, String nombre, String apellido, int edad, int antiguedad) {
        super(nombre, apellido, edad, antiguedad);
        this.colorFavorito = colorFavorito;
    }

    public String getColorFavorito() {
        return colorFavorito;
    }

    public void setColorFavorito(String colorFavorito) {
        this.colorFavorito = colorFavorito;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.append("Frontender{");
        sb.append("colorFavorito=").append(colorFavorito);
        sb.append('}');
        return sb.toString();
    }

    @Override
    protected void trabajar() {
        System.out.println("Como Frontender " + super.getNombre() + " lo está poniendo todo de color " + this.colorFavorito + " porque es su color favorito.");
    }

    public void buscarPaleta() {
        System.out.println(super.getNombre() + " está buscando nueva paleta de colores para ajustar el CSS.");
    }

}
