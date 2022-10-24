/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejerciciosclase;

import javax.swing.JOptionPane;
import utilidadespropias.MisUtilidades;

/**
 *
 * @author samuel
 */
public class NumerosRomanos {

    //ENUNCIADO
    /*
    Implementa un programa que muestre tres opciones.
    La primera será la opción que represente un número romano a partir de su número decimal (Entre 1 y 10).
    La segunda debe contar las vocales que tiene un nombre.
    La tercera será salir.
    El programa debe ejecutarse hasta que el usuario decida salir. Se puede usar Scanner y/o JOptionPane.
     */
    public static void main(String[] args) {
        //Creamos las variables y las constantes necesarias
        int opcion, num, numVocales = 0;
        String nombre, numRomano;
        boolean repetir = true;
        final String mensaje1 = "Introduza el número que desee ver en números romanos (Entre 1 y 10)";
        final String mensaje2 = "Introduza el nombre a comprobar";

         String menu = """
                      -------------------------------------------------------------------------
                      Seleccione que desea.
                      1 - Ver un número entre el 1 y 10 en números romanos.
                      2 - Ver cuantas vocales tiene un nombre.
                      3 - Salir del programa.
                      -------------------------------------------------------------------------
                      """;
        do {//Bucle principal, mientras no seleccionemos la opción 3 se seguirá repitiendo
           

            opcion = MisUtilidades.pedirIntVentana(menu);//Guardamos la opción elegida

            switch (opcion) {//Switch para ir a cada opción seleccionada
                case 1:
                    do {//Bucle para que se repita en caso de meter un número que no esté entre 1 y 10
                        repetir = false;//Actualización de condición
                        num = MisUtilidades.pedirIntVentana(mensaje1);//Guardamos el numero que queremos convertir
                        numRomano = switch (num) {//Switch con flecha para guardar el String del número romano
                            case 1 ->
                                "I";
                            case 2 ->
                                "II";
                            case 3 ->
                                "III";
                            case 4 ->
                                "IV";
                            case 5 ->
                                "V";
                            case 6 ->
                                "VI";
                            case 7 ->
                                "VII";
                            case 8 ->
                                "VIII";
                            case 9 ->
                                "IX";
                            case 10 ->
                                "X";
                            default -> {//Caso defaulto con yield ya que es más de una operación
                                //OJO!!! El yield debe ser SIEMPRE lo último que se pone, es como marcar el break
                                repetir = true;//Actualización de variable para que se repita el proceso de pedir el número
                                yield "Error";
                            }
                        };
                    } while (repetir);

                    //Mostramos el resultado
                    JOptionPane.showMessageDialog(null, num + " en números romanos es " + numRomano);

                    break;
                case 2:
                    //Guardamos el nombre y lo pasamos a minúsculas
                    nombre = MisUtilidades.pedirString(mensaje2).toLowerCase();
                    numVocales = 0;//Actualizamos el número de vocales por si repetirmos la operación
                    for (int i = 0; i < nombre.length(); i++) {//For para recorrer el nombre
                        //Si la posición i es una vocal, sumamos 1 al contador
                        if (nombre.charAt(i) == 'a' || nombre.charAt(i) == 'e' || nombre.charAt(i) == 'i' || nombre.charAt(i) == 'o' || nombre.charAt(i) == 'u') {
                            numVocales++;
                        }
                    }
                    //Imprimimos el resultado
                    JOptionPane.showMessageDialog(null, "El nombre " + nombre + " contiene " + numVocales + " vocales.");
                    break;
            }

        } while (opcion != 3);//Salimos del bucle y mostramos un mensaje de despedida
        JOptionPane.showMessageDialog(null, "Gracias por participar.");

    }

}
