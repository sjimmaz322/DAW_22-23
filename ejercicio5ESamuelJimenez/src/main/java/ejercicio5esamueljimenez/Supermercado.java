/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio5esamueljimenez;

/**
 *
 * @author samuel
 */
public class Supermercado {

    /**
     * @param args the command line arguments
     */
    private static Ticket generarTicket(Caja c) {
        Ticket t = c.generarTicket();
        return t;
    }

    public static void main(String[] args) {
        //-----
        Producto p1 = new Producto("Patata", 2, 4, 4);
        Producto p2 = new Producto("Gel Baño", 1, 5.15, 10);
        Producto p3 = new Producto("Queso", 4, 9, 21);
        Producto p4 = new Producto("Colonia", 1, 2.99, 10);
        //-----
        Caja c1 = new Caja();
        //-----
        c1.getCinta().aniadirProducto(p1);
        c1.getCinta().aniadirProducto(p2);
        c1.getCinta().aniadirProducto(p3);
        c1.getCinta().aniadirProducto(p4);
        //-----
        Ticket t = generarTicket(c1);
        //-----
        t.setNombreSuper("PacheMás");
        //-----
        System.out.println(t);
        //-----

    }

}
