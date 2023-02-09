/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ej2;

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
        //---
        System.out.println(t1 + "\n");
        System.out.println(f1 + "\n");
        System.out.println(d1 + "\n");
        //---
    }

}
