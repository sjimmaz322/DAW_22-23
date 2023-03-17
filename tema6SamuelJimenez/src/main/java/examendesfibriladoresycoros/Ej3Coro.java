/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package examendesfibriladoresycoros;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.Set;
import java.util.TreeMap;

/**
 *
 * @author sajm <sjimmaz322 at sjimmaz322@g.educaand.es>
 */
public class Ej3Coro {

    //--- Creamos nuestro objeto Random para ayudarnos a generar las voces
    private static Random rd = new Random();

    public static List<Ej3Voz> generarVoces(int num) {
        //--- Creamos la lista de voces que devolveremos
        List<Ej3Voz> lista = new ArrayList<>();
        int random = 0; //Creamos la variable random que usaremos para actualizar y almacenar los valores del random
        if (num >= 6) {//--- Si el número pasado como parámetro es mayor que 6 continúa el código
            for (int i = 0; i < num; i++) { //--- Realizamos el siguiente código tantas veces como sea el número introducido
                random = rd.nextInt(6);//--- Generamos un número entre 0 y 5 para determinar que Voz crearemos
                switch (random) {//--- En cada caso añadimos el tipo de Voz a la lista
                    case 1:
                        lista.add(Ej3Voz.BARITONO);
                        break;
                    case 2:
                        lista.add(Ej3Voz.CONTRALTO);
                        break;
                    case 3:
                        lista.add(Ej3Voz.CONTRATENOR);
                        break;
                    case 4:
                        lista.add(Ej3Voz.MEZZOSOPRANO);
                        break;
                    case 5:
                        lista.add(Ej3Voz.SOPRANO);
                        break;
                    default:
                        lista.add(Ej3Voz.TENOR);
                }
            }
        } else {//--- Si el número pasado como parámetro es menor que 6 lanzamos una excepción
            throw new IllegalArgumentException();
        }
        //--- Devolvemos la lista
        return lista;
    }

    public static int getNumeroCorosMixtos(List<Ej3Voz> lista) {
        //--- Creamos una lista auxiliar para trabajar con ella en el método
        List<Ej3Voz> listaAux = new ArrayList<>(lista);
        //--- Creamos la variable que usaremos para devolver el número de coros mixtos que podemos crear
        int numCoros = 0;
        do {//--- Se realizará el siguiente código mientras en la lista estén los 6 tipos de voces para el coro mixto a la vez
            if (listaAux.contains(Ej3Voz.BARITONO) && listaAux.contains(Ej3Voz.CONTRALTO) && listaAux.contains(Ej3Voz.CONTRATENOR)
                    && listaAux.contains(Ej3Voz.MEZZOSOPRANO) && listaAux.contains(Ej3Voz.SOPRANO) && listaAux.contains(Ej3Voz.TENOR)) {
                //--- Si están las 6 voces sumamos uno al número de coros que podemos crear borramos una de cada y damos otra vuelta al bucle
                numCoros++;
                listaAux.remove(Ej3Voz.BARITONO);
                listaAux.remove(Ej3Voz.CONTRALTO);
                listaAux.remove(Ej3Voz.CONTRATENOR);
                listaAux.remove(Ej3Voz.MEZZOSOPRANO);
                listaAux.remove(Ej3Voz.SOPRANO);
                listaAux.remove(Ej3Voz.TENOR);
            }
            //--- Mientras siga habiendo los 6 tipos de voces seguimos dentro del bucle
        } while ((listaAux.contains(Ej3Voz.BARITONO) && listaAux.contains(Ej3Voz.CONTRALTO) && listaAux.contains(Ej3Voz.CONTRATENOR)
                && listaAux.contains(Ej3Voz.MEZZOSOPRANO) && listaAux.contains(Ej3Voz.SOPRANO) && listaAux.contains(Ej3Voz.TENOR)));
        //--- Devolvemos el número de coros mixtos que podemos crear
        return numCoros;
    }

    public static Set<Ej3Voz> buscarVozMasRepetida(List<Ej3Voz> lista) {
        //--- Creamos dos Map, uno para trabajar con él y otro para devolverlo
        Map<Ej3Voz, Integer> aux = new TreeMap<>();
        Set<Ej3Voz> resultado = new HashSet<>();
        //---
        for (int i = 0; i < lista.size(); i++) {//--- Por cada voz de la lista
            if (aux.containsKey(lista.get(i))) {//--- Si la voz estaba en el Map
                aux.put(lista.get(i), aux.get(lista.get(i)) + 1); //--- Sumamos 1 a las veces que aparece
            } else {//--- Si no está en el Map
                aux.put(lista.get(i), 1);//--- Creamos el Entry poniendo las veces que aparece a 1
            }
        }
        //--- Creamos una variable que guardará el número maximo que se repite un Entry
        int mayor = 0;
        //--- Por cada Entry actualizamos el valor de mayor
        for (Map.Entry<Ej3Voz, Integer> entry : aux.entrySet()) {
            Integer val = entry.getValue(); //--- Guardamos en una variable el número de repeticiones de la Voz
            if (val > mayor) {
                mayor = val;
            }
        }
        //--- Por cada Entry del Map con el que hemos trabajado
        for (Map.Entry<Ej3Voz, Integer> entry : aux.entrySet()) {
            //--- Guardamos en variables la key y el value
            Ej3Voz key = entry.getKey();
            Integer val = entry.getValue();
            if (val == mayor) {//--- Si el value es igual al número máximo de ocurrencias de una voz lo guardamos
                resultado.add(key);
            }
        }
        //--- Devolvemos el Map con las voces que más se repiten
        return resultado;
    }
}
