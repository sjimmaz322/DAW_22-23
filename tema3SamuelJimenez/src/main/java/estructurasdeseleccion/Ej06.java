/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package estructurasdeseleccion;

import java.util.Scanner;

/**
 *
 * @author sajm <sjimmaz322 at sjimmaz322@g.educaand.es>
 */
public class Ej06 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int opcion;
        double ladoCuadradoA, ladoCuadradoB, baseTriangulo, alturaTriangulo, radio;

        System.out.println("Menú de opciones");
        System.out.println("-------------------------");
        System.out.println("1. Calcular el área de un Cuadrado");
        System.out.println("2. Calcular el área de un Triángulo");
        System.out.println("3. Calcular el área de un Círculo");
        System.out.println("4. Finalizar");

        System.out.print("Elija una opción: ");
        opcion = entrada.nextInt();

        if (opcion == 1) {
            System.out.println("Ha seleccionado calcular el área de un cuadrado...");
            System.out.println("Introduza el primer lado del cuadrado");
            ladoCuadradoA = entrada.nextDouble();
            System.out.println("Introduza el segundo lado del cuadrado");
            ladoCuadradoB = entrada.nextDouble();

            double areaCuadrado = ladoCuadradoA * ladoCuadradoB;

            System.out.println("El área de un cuadrado de lados " + ladoCuadradoA + " por " + ladoCuadradoB + " es " + areaCuadrado + " unidades cuadradas.");

        } else if (opcion == 2) {
            System.out.println("Ha seleccionado calcular el área de un triángulo...");

            System.out.println("Introduza la base del triángulo");
            baseTriangulo = entrada.nextDouble();
            System.out.println("Introduza la altura del triángulo");
            alturaTriangulo = entrada.nextDouble();

            double areaTriangulo = (baseTriangulo * alturaTriangulo) / 2;

            System.out.println("El área del triángulo de base " + baseTriangulo + " y altura " + alturaTriangulo + " es " + areaTriangulo + " unidades cuadradas.");
        } else if (opcion == 3) {
            System.out.println("Ha seleccionado calcular el área de un círculo...");

            System.out.println("Introduza el radio de la circunferencia");
            radio = entrada.nextDouble();

            double areaCirculo = Math.PI * Math.pow(radio, 2);
            System.out.printf("El área de un círculo de radio %.2f es de %.2f unidades cuadradas.", radio, areaCirculo);
        } else {
            System.out.println("Ha seleccionado terminar");
        }
    }
}
