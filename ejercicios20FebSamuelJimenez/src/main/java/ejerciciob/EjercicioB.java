/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejerciciob;

import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author sajm <sjimmaz322 at sjimmaz322@g.educaand.es>
 */
public class EjercicioB {

    /*
    b) Usando JOption, solicita al usuario que introduzca una frase cualquiera, guardando la frase en un objeto String.
    Muestra la frase por consola, así como su tamaño.
    Crea un método que devuelva el índice, dentro del String, de la primera ocurrencia del char que se pase como parámetro.
    Crea otro método para devolver, en un array, las posiciones dentro del String donde se encuentre el char que se pasa como parámetro.
    Recorre los elementos del String, imprimiendo su valor unicode e indicando si es una letra mayúscula o minúscula o un dígito (usa la clase envolvente Character).
    Elimina todos los espacios en blanco que haya en la cadena. 
    Imprime la nueva cadena y su tamaño.
     */
    public static void main(String[] args) {
        String frase = JOptionPane.showInputDialog("Introduza la frase que desee");
        //---
        System.out.println("La frase es:\n" + frase + "\nY está compuesta de " + frase.length() + " caracteres. (Contando Espacios)");
        //---
        int pos = encontradorDeCaracter(frase, 'm');
        System.out.println("\nm se encuentra en la posición " + pos + "\n");
        //---
        List<Integer> posiciones = encontradorDeTodosLosCaracteres(frase, 'm');
        posiciones.forEach(System.out::println);
        //---
        catalogadorCaracteres(frase);
        //---
        String fraseNoEspacios = eliminadorDeEspacios(frase);
        System.out.println("La frase es:\n" + fraseNoEspacios + "\nY está compuesta de " + fraseNoEspacios.length() + " caracteres. (Ya sin espacios)");
    }

    private static int encontradorDeCaracter(String s, char c) {
        s = s.toLowerCase();
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == c) {
                return i;
            }

        }
        return -1;
    }

    private static List<Integer> encontradorDeTodosLosCaracteres(String s, char c) {
        s = s.toLowerCase();
        List<Integer> lista = new ArrayList<>();
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == c) {
                lista.add(i);
            }
        }
        return lista;
    }

    private static void catalogadorCaracteres(String s) {
        for (int i = 0; i < s.length(); i++) {
            if (Character.isWhitespace(s.charAt(i))) {
                System.out.println("La posición " + i + " de la frase es un espacio en blanco que vale " + (int) s.charAt(i) + " en Unicode");
            } else if (Character.isLowerCase(s.charAt(i))) {
                System.out.println("La posición " + i + " de la frase es una letra minúscula que vale " + (int) s.charAt(i) + " en Unicode");
            } else if (Character.isDigit(s.charAt(i))) {
                System.out.println("La posición " + i + " de la frase es un dígito que vale " + (int) s.charAt(i) + " en Unicode");
            } else {
                System.out.println("La posición " + i + " de la frase es una letra mayúscula que vale " + (int) s.charAt(i) + " en Unicode");
            }
        }
        System.out.println("");

    }

    private static String eliminadorDeEspacios(String s) {
        return s.replaceAll(" ", "");
    }

}
