/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package exprregulares;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 * @author samuel
 */
public class EjRegex {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*
        EJ1:
        Mirar si un String contiene uno de los siguientes puntos.
        
        Localizacion: N
        Localizacion: S
        Localizacion: E
        Localizacion: O
        
        EJ2:
        Encontrar si alguna linea de texto cumple: ini +2 numeros + fin. Ej: ini23fin.

        EJ3:
        Encontrar combinaciones de letra+numero, tantas como haya.
         */

 /*----- EJERCICIO 1 -----*/
        //---   Creamos nuestra expresión regular.
        String regex = "Localizacion: [N|S|E|O]";
        //---   Creamos nuestro texto que si contendrá el patrón buscado.
        String txt = "Curiosamente la anidación de las águilas tomó Localizacion: N cuando siempre fue Localizacion: O";
        //---   Compilamos el patrón a buscar
        Pattern pat = Pattern.compile(regex);
        //---   Creamos un buscador de patrones en el texto
        Matcher matcher = pat.matcher(txt);
        //---   Imprimimos todos los patrones encontrados en el texto
        while (matcher.find()) {

            System.out.println("Patrón encontrado: " + matcher.group());
        }

        /*----- EJERCICIO 2 -----*/
        //---
        String regex2 = "ini[0-9]{2}fin";
        //---
        String txt2 = "asogvihsuihgerhjtgbsevhgfini13finasjkfgyuegbhjaesbgyuhdgini87finajksfhbujewgbysdhuysdjt";
        //---
        Pattern pat2 = Pattern.compile(regex2);
        //---
        Matcher matcher2 = pat2.matcher(txt2);
        //---
        while (matcher2.find()) {

            System.out.println("Patrón encontrado: " + matcher2.group());
        }

        /*----- EJERCICIO 3 -----*/
        //---
        String regex3 = "[a-z|A-Z]{1}[0-9]{1}";
        //---
        String txt3 = "a4deslkjigbyfdhddfshdf8hjn48f7hdf8hy487748FDH4NFDGCJN7FXD8HJRD8H8DRB7FC87H89D/RF7HJ98DRF7JH89D";
        //---
        Pattern pat3 = Pattern.compile(regex3);
        //---
        Matcher matcher3 = pat3.matcher(txt3);
        //---
         while (matcher3.find()) {

            System.out.println("Patrón encontrado: " + matcher3.group());
        }
    }

}
