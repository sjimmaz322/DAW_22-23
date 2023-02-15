/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejerciciosclase;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/**
 *
 * @author samuel
 */
public class EjemploIterator {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Set<Integer> conjunto = new HashSet<>();
        //---
        conjunto.add(20);
        conjunto.add(10);
        conjunto.add(30);
        //---
        for (Integer i : conjunto) {
            System.out.println("Elemento: " + i);
            //--- No puedes borrar un elemento de un cojnunto que se está recorriendo
            //--- Excepción de cambio mientras se recorría
            //            if(i ==20){
            //                conjunto.remove(i);
            //            }
            //--- Hay que usar un iterator
        }
        Iterator<Integer> it = conjunto.iterator();
        while (it.hasNext()) {
            Integer numerico = it.next();
            if (numerico == 20) {
                it.remove();//--- Borra el elemento de la colección con la cual se hizo el Iterator
            }
        }
        
        conjunto.forEach(System.out::println);
    }

}
