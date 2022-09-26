/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package algoritmossecuenciales;

import java.text.Format;
import java.util.Scanner;
import javax.swing.plaf.synth.Region;

/**
 *
 * @author sajm <sjimmaz322 at sjimmaz322@g.educaand.es>
 */
public class Ej02 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        //Declaramos e inicializamos un objeto de la clase Scanner.
        Scanner sc = new Scanner(System.in);
        //Declaramos e inicializamos las variables constantes.
        double radio, area, volumen, longitud;
        final double CONSTANTEVOLUMENESFERA = (4.0 / 3.0);

        //Solicitamos los datos por teclado 
        System.out.println("Introduzca el radio de la circunferencia");
        radio = sc.nextDouble();

        //Inicializamos las variables con las fórmulas correspondientes.
        //Longitud 2pi·r
        //Área pi·r^2
        //Volumen 4/3·pi·r^3
        longitud = (2 * Math.PI * radio);
        area = (Math.PI * Math.pow(radio, 2));
        volumen = (CONSTANTEVOLUMENESFERA * Math.PI * Math.pow(radio, 3));

        //Imprimimos el resultado por consola.
        System.out.println("""
                           El radio de la circunferencia es: %.2f unidades.
                           La longitud de la circunferencia es: %.2f unidades.
                           El área de la circunferencia es: %.2f unidades cuadradas.
                           El volumen de la esfera es: %.2f unidades cúbicas.
                           """.formatted(radio, longitud, area, volumen));

    }

}
