package algoritmossecuenciales;

import java.util.Scanner;
import javax.swing.JOptionPane;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
/**
 *
 * @author sjimmaz322 <sjimmaz322@g.educaand.es>
 */
public class ejercicioClase {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*
        Algoritmo secuencial, pedir datos por Scanner y JOption, poner resultados con TextBlock.
         */
        String numeroEjerciciosTxt, nombre, apellido;
        double numeroEjercicios, participacion;
        final double VALORPOSITIVO = 0.2, extraEnNota, porcentajeParticipacion;

        Scanner sc = new Scanner(System.in);

        System.out.println("Introduzca su nombre");
        nombre = sc.nextLine();
        System.out.println("Introduzca su apellido");
        apellido = sc.nextLine();

        numeroEjerciciosTxt = JOptionPane.showInputDialog("¿Cuántos ejercicios ha mandado el profesor?");
        numeroEjercicios = Double.parseDouble(numeroEjerciciosTxt);

        participacion = Double.parseDouble(JOptionPane.showInputDialog("¿En cuántos ejercicios ha participado?"));

        extraEnNota = VALORPOSITIVO * participacion;

        porcentajeParticipacion = (participacion * 100.0) /numeroEjercicios;

        String mensaje = """
                         Usted D/Dñ %s %s.
                         Ha participado en el %.2f de los ejercicios.
                         Por lo tanto ha ganado %.0f positivos.
                         A un total de %.2f por positivo, ha ganado %.2f puntos.
                         PD: El extra se redondeará a la baja.
                         """.formatted(nombre, apellido, porcentajeParticipacion, participacion, VALORPOSITIVO, Math.floor(extraEnNota));

        System.out.println(mensaje);
        JOptionPane.showMessageDialog(null, mensaje);
    }

}
