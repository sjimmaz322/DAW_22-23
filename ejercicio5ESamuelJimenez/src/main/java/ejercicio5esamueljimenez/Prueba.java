/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio5esamueljimenez;

/**
 *
 * @author samuel
 */
public class Prueba {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Producto p1 = new Producto("Patatas", 2, 4, 4);
        Producto p2 = new Producto("Gel Baño", 1, 5.15, 10);
        Caja c1 = new Caja();

        c1.aniadirProducto(p1);
        c1.aniadirProducto(p2);
        System.out.println(c1.toString());

    }

}
