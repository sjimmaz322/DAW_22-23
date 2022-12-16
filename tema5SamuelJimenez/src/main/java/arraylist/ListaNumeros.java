/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package arraylist;

import java.util.ArrayList;

/**
 *
 * @author samuel
 */
public class ListaNumeros {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ArrayList<Integer> listaNums = new ArrayList<>();

        listaNums.add(2);
        listaNums.add(4);
        listaNums.add(8);
        listaNums.add(3);
        listaNums.add(5);

        System.out.println("El tamaño de la lista es : " + listaNums.size());

        for (int i = 0; i < listaNums.size(); i++) {
            System.out.println("Elemento " + (i + 1) + " - " + listaNums.get(i));
            //System.out.println("Posición " + (i) + " - " + listaNums.get(i));
        }

        String taEl7 = listaNums.contains(7) ? "El 7 está en la lista" : "El 7 no está en la lista";
        System.out.println(taEl7);

        System.out.println("El ocho está en la posición - " + listaNums.indexOf(8));
        
    }

}
