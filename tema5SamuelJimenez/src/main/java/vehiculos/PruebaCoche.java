/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package vehiculos;

/**
 *
 * @author samuel
 */
public class PruebaCoche {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Rueda rdd = new Rueda(225, "Michellin");
        Rueda rdi = new Rueda(225, "Michellin");
        Rueda rtd = new Rueda(225, "Michellin: Low cost");
        Rueda rti = new Rueda(225, "Michellin: Low cost");
        //---
        Ventana ventanaPuertaPiloto = new Ventana(true);
        Ventana ventanaPuertaCopiloto = new Ventana(true);
        //---
        Puerta pPiloto = new Puerta(ventanaPuertaPiloto, false);
        Puerta pCopiloto = new Puerta(ventanaPuertaCopiloto, false);
        //---
        Motor motor = new Motor(1500, false);
        //---
        Coche miCoche = new Coche(rdi, rdd, rti, rtd, pCopiloto, pPiloto, "6219-FSN", motor);
        //---
        System.out.println(miCoche);
        //Abrimos la ventana de la puerta del piloto
        miCoche.getPuertaIzquierda().getVentana().abrir();
        //Arrancamos el motor del coche
        miCoche.getMotor().arrancar();
    }

}
