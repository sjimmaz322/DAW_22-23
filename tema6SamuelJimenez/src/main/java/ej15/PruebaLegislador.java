/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ej15;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author sajm <sjimmaz322 at sjimmaz322@g.educaand.es>
 */
public class PruebaLegislador {

    public static void main(String[] args) {
        //---
        Legislador l1 = new Diputado(69, "Málaga", "Robemos", "Nacho", "Salcedo");
        Legislador l2 = new Diputado(42, "Málaga", "Partido Masoquista Obrero Español", "Victoria", "Sampalo");
        Legislador l3 = new Senador(5, "Málaga", "Comisiones Comunistas", "Samuel", "Jiménez ");
        Legislador l4 = new Senador(150, "Málaga", "Partido Animal", "Jessica", "Macioszek");
        //---
        List<Legislador> listado = new ArrayList<>();
        //---
        listado.add(l1);
        listado.add(l2);
        listado.add(l3);
        listado.add(l4);
        //---
        System.out.println("Imprimimos la información de los legisladores");
        listado.forEach(l -> System.out.print(l));
        //---
        System.out.println("\nImprimimos la cámara a la que pertenecen cada uno");
        listado.forEach(l -> System.out.println(l.getCamara()));

    }

}
