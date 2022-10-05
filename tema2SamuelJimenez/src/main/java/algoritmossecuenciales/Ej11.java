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
public class Ej11 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        double radio, hipotenusa, areaSemicirculo, areaTriangulo, alturaTriangulo, area;

        System.out.println("Introduzca el radio de la circunferencia");
        radio = sc.nextDouble();

        System.out.println("Introduzca la hipotenusa del triángulo");
        hipotenusa = sc.nextDouble();

        alturaTriangulo = Math.sqrt((Math.pow(hipotenusa, 2) - (Math.pow(radio, 2))));

        areaSemicirculo = (Math.PI * Math.pow(radio, 2) / 2);

        areaTriangulo = (alturaTriangulo * (2 * radio)) / 2;

        area = areaSemicirculo + areaTriangulo;

        System.out.println("El área de la figura es de " + area + " unidades cuadradas.");

        //Hacemos la versión con JOptionPane
        String radioTxt = JOptionPane.showInputDialog("Introduza el radio de la circunferencia");
        double radioCircunferencia = Double.parseDouble(radioTxt);
        String hipotenusaTxt = JOptionPane.showInputDialog("Introduza la hipotenusa del triángulo");
        double hipotenusaTriangulo = Double.parseDouble(hipotenusaTxt);

        double altura = Math.sqrt((Math.pow(hipotenusaTriangulo, 2) - (Math.pow(radioCircunferencia, 2))));

        double areaDelSemicirculo = (Math.PI * Math.pow(radioCircunferencia, 2) / 2);
        double areaDelTriangulo = (altura * (2 * radioCircunferencia)) / 2;

        double areaTotal = areaDelSemicirculo + areaDelTriangulo;

        JOptionPane.showMessageDialog(null, "El área de la figura es de " + areaTotal + " unidades cuadradas.");

    }

}
