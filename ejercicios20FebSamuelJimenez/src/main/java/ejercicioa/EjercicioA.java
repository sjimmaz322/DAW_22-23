/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */
package ejercicioa;

import javax.swing.JOptionPane;

/**
 *
 * @author sajm <sjimmaz322 at sjimmaz322@g.educaand.es>
 */
public class EjercicioA {

    /*
    a) Lee un número por teclado usando JOption. Si no es un número, se debe leer de nuevo.
    Convierte el número leído a un array de char.
    Implementa un método recursivo para saber si el array de char contiene un número capicúa.

     */
    public static void main(String[] args) {
        String num = "";
        String resultado;
        //---
        do {
            num = JOptionPane.showInputDialog("Introduza un número");
            if (esNumero(num)) {
                break;
            } else {
                JOptionPane.showMessageDialog(null, "Solo se admiten números");
            }
        } while (true);
        //---
        char[] numero = pasarAArray(num);
        //---
        resultado = esCapicua(numero, 0, numero.length - 1) ? "Es capicúa" : "No es capicúa";
        JOptionPane.showMessageDialog(null, num + ": " + resultado);
    }

    private static boolean esNumero(String s) {
        if (s.equals("")) {
            return false;
        }
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) < '0' || s.charAt(i) > '9') {
                return false;
            }
        }
        return true;
    }

    private static char[] pasarAArray(String s) {

        return s.toCharArray();
    }

    private static boolean esCapicua(char[] c, int ini, int fin) {
        if (c.length == 1) {
            return true;
        }
        if (c[ini] != c[fin]) {
            return false;
        }
        if (ini > (c.length / 2)) {
            return false;
        } else {
            esCapicua(c, ini + 1, fin - 1);
        }
        return true;
    }
}
