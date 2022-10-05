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
public class Ej07 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double euros, dolares;

        final double FACTORCONVERSION = 0.997152;

        System.out.println("Introduzca los euros a convertir");
        euros = sc.nextDouble();

        dolares = euros * FACTORCONVERSION;

        System.out.println(euros + " son " + dolares + " dólares americanos");

        //Hacemos la opción en JOptionPane
        String eurosTxt = JOptionPane.showInputDialog("¿Cuantos euros vamos a convertir?");
        double eurosConvertir = Double.parseDouble(eurosTxt);

        double dolaresConvertidos = eurosConvertir * FACTORCONVERSION;

        JOptionPane.showMessageDialog(null, +eurosConvertir + " son " + dolaresConvertidos);
    }

}
