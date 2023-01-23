/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package propuestosclase;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author sajm <sjimmaz322 at sjimmaz322@g.educaand.es>
 */
public class Arbolico {

    /*En este ejercicio hay que implementar un programa que pida al usuario por teclado la altura de la copa de un árbol,
    indicada como filas de una matriz (entre 2 y 10 ) y guarde la representación del árbol en un array de dos dimensiones,
    teniendo en cuenta que la altura del tronco siempre es 2 (filas). 
    Una vez solicitada la altura de la copa del árbol, este dato se pasará a un método que generará  
    y devolverá el array de dos dimensiones con la representación del arbolito, teniendo en cuenta las dimiensiones de copa y tronco del árbol.
    Este método debe permitir cualquier altura de copa (filas de la mátriz) positiva mayor que cero,
    aunque inicialmente nuestro programa limite la altura entre 2 y 10, teniendo en cuenta que el tronco siempre tiene una altura de dos filas.

    Una vez generado el árbol, debe mostrarse por consola. 
     */
    private static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        String[][] arbol;
        int altura;
        do {
            altura = pedirIntConsola("¿Cuál es la altura de la copa del arbolito?");
            if (altura >= 2 && altura <= 10) {
                break;
            }
            System.out.println("La altura debe estar entre 2 y 10");
        } while (true);

        arbol = generarArbolito(altura);

        mostrarMatriz(arbol);

    }

    public static int pedirIntConsola(String mensaje) {
        //--- Método de nuestra clase Utilidades para evitar Excepciones
        int num = 0;
        do {
            try {
                System.out.println(mensaje);
                num = sc.nextInt();
                break;
            } catch (NumberFormatException nfe) {
                System.out.println("Introduzca un número válido");
            } catch (InputMismatchException ime) {
                System.out.println("Introduza un número por favor");
                sc.nextLine();
            }
        } while (true);
        return num;
    }

    private static String[][] generarArbolito(int num) {
        int anchura = 1;
        //---
        for (int i = 0; i <= num; i++) {
            anchura += 2;
        }
        //---
        String[][] m = new String[num + 2][anchura];
        //---
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m[i].length; j++) {
                m[i][j] = " ";
            }
        }
        //---
        for (int i = 0; i < m.length - 2; i++) {
            //---
            m[i][anchura / 2] = "#";
            //---
            for (int j = (anchura / 2) - i; j < m.length; j++) {
                m[i][j] = "#";
            }
            for (int j = (anchura / 2); j < m.length + i; j++) {
                m[i][j] = "#";
            }
        }
        //--- Vaciamos la base usando el caracter espacio.
        for (int i = m.length - 2; i < m.length; i++) {
            for (int k = 0; k < m[i].length; k++) {
                m[i][k] = " ";
            }
        }
        //--- Ponemos el tronco en su sitio.
        m[m.length - 1][anchura / 2] = "@";
        m[m.length - 2][anchura / 2] = "@";
        //---
        String tmp = "";
        String[][] arbolReal = new String[num + 2][1];
        //---
        for (int i = 0; i < m.length; i++) {
            tmp = "";
            for (int j = 0; j < m[i].length; j++) {
                tmp += m[i][j];
            }
            arbolReal[i][0] = tmp;
        }

        return arbolReal;
    }

    private static void mostrarMatriz(String[][] m) {
        //--- Recorremos la matriz
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m[i].length; j++) {
                System.out.print(m[i][j]);
                //--- Cuando terminemos la fila metemos un salto de línea
                if (j == m[i].length - 1) {
                    System.out.println("");
                }
            }
        }

    }

}
