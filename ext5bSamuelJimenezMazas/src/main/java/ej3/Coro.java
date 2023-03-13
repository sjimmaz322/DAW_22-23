/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ej3;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.Set;
import java.util.TreeMap;

/**
 *
 * @author samuel
 */
public class Coro {

    private static Random rd = new Random();

    public static List<Voz> generarVoces(int num) {
        List<Voz> lista = new ArrayList<>();
        int random = 0;
        if (num >= 6) {
            for (int i = 0; i < num; i++) {
                random = rd.nextInt(6);
                switch (random) {
                    case 1:
                        lista.add(Voz.BARITONO);
                        break;
                    case 2:
                        lista.add(Voz.CONTRALTO);
                        break;
                    case 3:
                        lista.add(Voz.CONTRATENOR);
                        break;
                    case 4:
                        lista.add(Voz.MEZZOSOPRANO);
                        break;
                    case 5:
                        lista.add(Voz.SOPRANO);
                        break;
                    default:
                        lista.add(Voz.TENOR);
                }
            }
        } else {
            throw new IllegalArgumentException();
        }

        return lista;
    }

    public static int getNumeroCorosMixtos(List<Voz> lista) {
        int numCoros = 0;
        for (int i = 0; i < lista.size(); i++) {

            if (lista.contains(Voz.CONTRATENOR) && lista.contains(Voz.TENOR) && lista.contains(Voz.BARITONO)) {
                lista.remove(Voz.CONTRATENOR);
                lista.remove(Voz.TENOR);
                lista.remove(Voz.BARITONO);
            }
            if (lista.contains(Voz.SOPRANO) && lista.contains(Voz.MEZZOSOPRANO) && lista.contains(Voz.CONTRALTO)) {
                lista.remove(Voz.SOPRANO);
                lista.remove(Voz.MEZZOSOPRANO);
                lista.remove(Voz.CONTRALTO);
            }
        }
        for (int i = 0; i < lista.size(); i++) {

        }
        return numCoros;
    }

    public static Map<Voz, Integer> buscarVozMasRepetida(List<Voz> lista) {
        Map<Voz, Integer> aux = new TreeMap<>();

        for (int i = 0; i < lista.size(); i++) {
            int num = 0;
            if (aux.containsKey(lista.get(i))) {

                aux.put(lista.get(i), num++);

            } else {

                aux.put(lista.get(i), 1);

            }

        }
        Set<Voz> voces = aux.keySet();
        Object[] vc = voces.toArray();
        return aux;
    }
}
