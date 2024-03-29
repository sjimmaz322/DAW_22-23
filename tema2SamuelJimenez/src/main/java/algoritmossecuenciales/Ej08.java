/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package algoritmossecuenciales;

import java.util.Scanner;
import javax.swing.JOptionPane;

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

        double presupuesto, partePresupuestoGinecologia, partePresupuestoPediatria, partePresupuestoTraumatologia;
        final int PORCENTAJEGINECOLOGIA = 30, PORCENTAJEPEDIATRIA = 30, PORCENTAJETRAUMATOLOGIA = 40, TOTAL = 100;

        System.out.println("Introduzca el presupuesto que recibirá el hospital");
        presupuesto = sc.nextDouble();

        partePresupuestoGinecologia = (presupuesto * PORCENTAJEGINECOLOGIA) / TOTAL;
        partePresupuestoPediatria = (presupuesto * PORCENTAJEPEDIATRIA) / TOTAL;
        partePresupuestoTraumatologia = (presupuesto * PORCENTAJETRAUMATOLOGIA) / TOTAL;

        System.out.println("Del total de " + presupuesto + " € de presupuesto."
                + "\nGinecología recibirá el 30% que es " + partePresupuestoGinecologia + "."
                + "\nPediatría recibirá el 30% que es " + partePresupuestoPediatria + "."
                + "\nTraumatología recibirá el 40% que es " + partePresupuestoTraumatologia);

        //Hacemos la versión en JOptionPane
        String presupuestoTxt = JOptionPane.showInputDialog("Introduzca el dinero que recibirá el hospital");
        double presupuestoRecibido = Double.parseDouble(presupuestoTxt);

        double parteRecibeGinecologia = (presupuesto * PORCENTAJEGINECOLOGIA) / TOTAL;
        double parteRecibePediatria = (presupuesto * PORCENTAJEPEDIATRIA) / TOTAL;
        double parteRecibeTraumatologia = (presupuesto * PORCENTAJETRAUMATOLOGIA) / TOTAL;

        JOptionPane.showMessageDialog(null, "Del total de " + presupuestoRecibido + " € de presupuesto."
                + "\nGinecología recibirá el 30% que es " + parteRecibeGinecologia + "."
                + "\nPediatría recibirá el 30% que es " + parteRecibePediatria + "."
                + "\nTraumatología recibirá el 40% que es " + parteRecibeTraumatologia);

    }

}
