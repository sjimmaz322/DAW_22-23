/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ventanasabstractas;

import java.util.HashSet;
import java.util.Set;

/**
 *
 * @author samuel
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        VentanaAbstracta v1 = new VAbatible(90, true);
        VentanaAbstracta v2 = new Vcorredera(50, true);
        //---
        Set<VentanaAbstracta> listaVentanas = new HashSet<>();
        //---
        listaVentanas.add(v1);
        listaVentanas.add(v2);
        //---
        for (VentanaAbstracta v : listaVentanas) {
            v.abrir(100);
        }
        //---
    }

}
