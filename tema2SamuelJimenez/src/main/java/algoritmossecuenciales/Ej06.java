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
public class Ej06 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        double suma, inversion1, inversion2, inversion3, porcentaje1, porcentaje2, porcentaje3;
        final int PERCENT = 100;

        System.out.println("Introduza la cantidad aportada por el sujeto 1");
        inversion1 = sc.nextDouble();
        System.out.println("Introduza la cantidad aportada por el sujeto 2");
        inversion2 = sc.nextDouble();
        System.out.println("Introduza la cantidad aportada por el sujeto 3");
        inversion3 = sc.nextDouble();

        suma = inversion1 + inversion2 + inversion3;

        porcentaje1 = (inversion1 * PERCENT) / suma;
        porcentaje2 = (inversion2 * PERCENT) / suma;
        porcentaje3 = (inversion3 * PERCENT) / suma;

        System.out.println("El sujeto 1 aporta " + inversion1 + "€, siendo el " + porcentaje1 + "% del total de " + suma);
        System.out.println("El sujeto 1 aporta " + inversion2 + "€, siendo el " + porcentaje2 + "% del total de " + suma);
        System.out.println("El sujeto 1 aporta " + inversion3 + "€, siendo el " + porcentaje3 + "% del total de " + suma);

        //Hacemos la versión en JOptionPane
        String aporte1Txt = JOptionPane.showInputDialog("¿Cuánto aporta el primer sujeto?");
        double aporte1 = Double.parseDouble(aporte1Txt);
        String aporte2Txt = JOptionPane.showInputDialog("¿Cuánto aporta el segundo sujeto?");
        double aporte2 = Double.parseDouble(aporte2Txt);
        String aporte3Txt = JOptionPane.showInputDialog("¿Cuánto aporta el tercer sujeto?");
        double aporte3 = Double.parseDouble(aporte3Txt);

        double sumaTotal = aporte1 + aporte2 + aporte3;

        double porcentajeSujeto1 = (aporte1 * PERCENT) / sumaTotal;
        double porcentajeSujeto2 = (aporte2 * PERCENT) / sumaTotal;
        double porcentajeSujeto3 = (aporte3 * PERCENT) / sumaTotal;

        JOptionPane.showMessageDialog(null, "El sujeto 1 aporta un total de " + aporte1 + "€, siendo el " + porcentajeSujeto1 + "% de un total de " + sumaTotal
                + "\nEl sujeto 1 aporta un total de " + aporte2 + "€, siendo el " + porcentajeSujeto2 + "% de un total de " + sumaTotal
                + "\nEl sujeto 1 aporta un total de " + aporte3 + "€, siendo el " + porcentajeSujeto3 + "% de un total de " + sumaTotal);

    }

}
