/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicios;

/**
 *
 * @author samuel
 */
public class Ej18 {

    /*
    Implementa el algoritmo de búsqueda binaria que hay en los apuntes y aplícalo sobre un array de números enteros ordenado.
    El programa debe devolver si ha encontrado o no el número y el número de comparaciones con elementos del array que ha requerido para encontrarlo.
    Probarlo con el vector int v[] = {2,3,4,5,6,7,8,9,10,11,12} y los números 11 y 13.
     */
    public static void main(String[] args) {
        //---
        int v[] = {2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12};
        //---
        int resultado = busquedaBinaria(v, 11);
        //---
        System.out.println(resultado);
        //---
        resultado = busquedaBinaria(v, 13);
        //---
        System.out.println(resultado);
    }

    private static int busquedaBinaria(int[] v, int num) {
        int mitad = 0;
        int izquierda = 0;
        int derecha = v.length - 1;
        int buscado = num;
        boolean encontrado = false;
        while ((izquierda <= derecha) && (!encontrado)) {
            mitad = (izquierda + derecha) / 2;
            if (v[mitad] == buscado) {
                encontrado = true;
            } else if (v[mitad] > buscado) {
                derecha = mitad - 1; //buscar en el trozo izquierdo
            } else {
                izquierda = mitad + 1; // buscar en el trozo derecho
            }
        }
        if (encontrado) {
            return mitad;
        } else {
            return -1;
        }
    }

}
