/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package trenes;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 *
 * @author sajm <sjimmaz322 at sjimmaz322@g.educaand.es>
 */
public class Estacion {

    /*
    En una matriz de NxM casillas, las filas representan los diferentes trenes que tiene una compañía de transportes
    y las columnas los distintos vagones de un tren.
    Cada casilla almacena un valor numérico, que es el número de pasajeros de cada vagón.
    La primera columna representa el ID del tren y si el valor de la casilla del vagón es cero, es porque no existen más vagones en ese tren.
    Implementa un programa para que dada una matriz, se genere una estructura Map con la información solicitada en clase.
    El map contiene como keys los valores ID de los trenes y como values los objetos tipo Tren,
    que incluyen como atributos (ID tren, nº vagones, nº pasajeros totales que puede llevar el tren).
     */
    public static void main(String[] args) {
        //--- Creamos nuestra matriz con nuestros trenes
        int[][] matrizDeTrenes = {
            {100, 15, 25, 0, 0},
            {101, 40, 35, 5, 0},
            {102, 20, 0, 0, 0},
            {103, 10, 10, 10, 15}};
        //-- Guardamos el Map con la información que queremos gracias al método que hemos creado
        Map<Integer, Tren> registro = recorrerMatriz(matrizDeTrenes);
        //--- Comprobamos que guarda las claves
        Set<Integer> idTrenes = registro.keySet();
        idTrenes.forEach(System.out::println);
        //--- Comprobamos que nos imprime el toString de los trenes ya que guardamos el objeto
        Collection registroTrenes = registro.values();
        registroTrenes.forEach(System.out::println);

    }

    private static Map<Integer, Tren> recorrerMatriz(int[][] m) {
        //Creamos el Map para devolverlo
        Map<Integer, Tren> trenes = new HashMap<>();
        //--- Creamos e inicializamos las variables que usaremos

        int numPasajeros = 0;
        int numVagones = 0;
        //--- Recorremos la matriz
        for (int i = 0; i < m.length; i++) {
            //--- Reiniciamos variables con cada nuevo tren 
            numPasajeros = 0; 
            numVagones = 0;

            for (int j = 1; j < m[i].length; j++) {

                numPasajeros += m[i][j];//--- Vamos guardando el total de pasajeros
                if (m[i][j] > 0) {//--- Solo sumamos un vagón si contiene pasajeros
                    numVagones++;
                }

            }
            //--- Creamos un nuevo tren para añadirlo al Map
            Tren t = new Tren(m[i][0], numVagones, numPasajeros);
            //--- Añadimos el tren al Map
            trenes.put(t.getID(), t);
            //---
        }
        return trenes;
    }
}
