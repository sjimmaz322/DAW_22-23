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
public class Ej11 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        //Área es PI * r*r
        Scanner sc = new Scanner(System.in);

        double radio, hipotenusa, areaSemicirculo, areaTriangulo, alturaTriangulo, area;

        System.out.println("Introduzca el radio de la circunferencia");
        radio = sc.nextDouble();

        System.out.println("Introduzca la hipotenusa del triángulo");
        hipotenusa = sc.nextDouble();

        alturaTriangulo = Math.sqrt((Math.pow(radio, 2)) + (Math.pow(hipotenusa, 2)));

        areaSemicirculo = (Math.PI * Math.pow(radio, 2) / 2);

        areaTriangulo = alturaTriangulo * (2 * radio);

        area = areaSemicirculo + areaTriangulo;

        System.out.println("El área de la figura es de " + area + " unidades cuadradas.");

    }

}
