/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejerciciosclase;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author samuel
 */
public class BusquedaSecuencialRecursiva {

    //---
    private static Random rd = new Random();
    private static Scanner sc = new Scanner(System.in);

    //---
    public static void main(String[] args) {
        List<Integer> listaNum = new ArrayList<>();
        int cantNumeros = rd.nextInt(20) + 1;
        //---
        System.out.println("Introduza el número que buscamos");
        int num = sc.nextInt();
        //---
        for (int i = 0; i < cantNumeros; i++) {
            listaNum.add(rd.nextInt(30));
        }
        //---
        System.out.println("La posición del número buscado es "+buscarNumero(listaNum, 15, 0));
        //---
        System.out.println("Los números de la lista son:");
        for (int i = 0; i < listaNum.size(); i++) {
            System.out.print(listaNum.get(i) + " - ");

        }
    }

    private static int buscarNumero(List<Integer> lista, int numBuscado, int pos) {
        if (pos < lista.size()) {
            if (numBuscado == lista.get(pos)) {
                return pos;
            } else {
                return buscarNumero(lista, numBuscado, pos + 1);
            }
        }
        return -1;
    }

}
