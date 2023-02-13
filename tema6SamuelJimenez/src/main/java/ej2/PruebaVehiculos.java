/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ej2;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author samuel
 */
public class PruebaVehiculos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Vehiculo t1 = new Turismo(987456321L, "1744-KHT", "Dacia", "Sandero", "Blanco", 105, 5, true);
        Vehiculo f1 = new Furgoneta(154789654L, "1324-ABC", "Renault", "Kangoo", "Verde", 120, 3400, 3000);
        Vehiculo d1 = new Deportivo(123654789L, "6582-RCC", "Ferrari", "Testarossa", "Rojo", 200, 1500);
        Vehiculo e1 = new Electrico(0, 0, 1463258L, "4789-HUY", "SEAT", "NIKOLA", "Azul", 100);
        Vehiculo c1 = new Combustion(0, TipoCombustible.DIESEL, 47869878L, "4521-LOI", "FIAT", "Supra", "Rosa", 20);
        //---
        System.out.println(t1 + "\n");
        System.out.println(f1 + "\n");
        System.out.println(d1 + "\n");
        System.out.println(e1 + "\n");
        System.out.println(c1 + "\n");
        //---
        List<Vehiculo> lista = new ArrayList<>();
        //---
        lista.add(t1);
        lista.add(f1);
        lista.add(d1);
        lista.add(e1);
        lista.add(c1);
        //---
        lista.forEach(System.out::println);
        //---
        for (Vehiculo v : lista) {
            if (v instanceof Electrico) {
                ((Electrico) v).cambiarBateria();
            }
        }
        //---
        for (Vehiculo v : lista) {
            v.arrancar();
        }

    }

}
