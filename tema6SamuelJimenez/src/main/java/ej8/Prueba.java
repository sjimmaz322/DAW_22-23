/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ej8;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author samuel
 */
public class Prueba {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //---
        List<Azar> destino = new ArrayList<>();
        //---
        Azar d4 = new Dado(4);
        Azar d6 = new Dado(6);
        Azar d8 = new Dado(8);
        Azar d10 = new Dado(10);
        Azar d12 = new Dado(12);
        Azar d20 = new Dado(20);
        Azar d100 = new Dado(100);
        Azar moneda = new Moneda();
        //---
        destino.add(d4);
        destino.add(d6);
        destino.add(d8);
        destino.add(d10);
        destino.add(d12);
        destino.add(d20);
        destino.add(d100);
        destino.add(moneda);
        //---
        for (Azar a : destino) {
            if (a instanceof Dado) {
                ((Dado) a).metodoDado();
                System.out.println( a.lanzar());
            } else {
                System.out.println("En la moneda salió " + a.lanzar());
            }
        }
    }

}
