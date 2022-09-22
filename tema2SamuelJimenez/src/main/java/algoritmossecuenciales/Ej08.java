/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package algoritmossecuenciales;

import java.util.Scanner;

/**
 *
 * @author sajm <sjimmaz322 at sjimmaz322@g.educaand.es>
 */
public class Ej08 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        double presupuesto, parteGinecologia, partePediatria, parteTraumatologia;
        final int PORCENTAJEGINECOLOGIA = 30, PORCENTAJEPEDIATRIA = 30, PORCENTAJETRAUMATOLOGIA = 40, TOTAL = 100;

        System.out.println("Introduzca el presupuesto que recibirá el hospital");
        presupuesto = sc.nextDouble();

        parteGinecologia = (presupuesto * PORCENTAJEGINECOLOGIA) / TOTAL;
        partePediatria = parteGinecologia;
        parteTraumatologia = (presupuesto * PORCENTAJETRAUMATOLOGIA) / TOTAL;

        System.out.println("Del total de " + presupuesto + " € de presupuesto."
                + "\nGinecología recibirá el 30% que es " + parteGinecologia + "."
                + "\nPediatría recibirá el 30% que es " + partePediatria + "."
                + "\nTraumatología recibirá el 40% que es " + parteTraumatologia);

    }

}
