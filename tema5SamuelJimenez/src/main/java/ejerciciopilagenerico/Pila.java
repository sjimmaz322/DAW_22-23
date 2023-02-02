/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejerciciopilagenerico;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author samuel
 */
public class Pila<T> {

    /*
    Implementa una Pila (Stack, en inglés) usando clases genéricas. Una pila es un almacén de datos en el que se sigue una política específica a la hora de introducir y sacar los elementos.
    Una pila sigue una política LIFO (Last In First Out), es decir, el último elemento en entrar (apilar) es el primero en salir (desapilar). 
    La pila tiene un tamaño máximo, de forma que no se pueden guardar más elementos que los indicados en ese tamaño. 
    Gráficamente, una pila de números se puede representar según la siguiente imagen:


    En este ejercicio se pide implementar una clase que modele el comportamiento de una pila, para cualquier tipo de objetos, mediante un ArrayList, ofreciendo la siguiente funcionalidad:
    La pila siempre se creará vacía. X
    apilar elemento (en inglés push), lo inserta donde proceda. X
    desapilar (en inglés pop), que saca el elemento que toque. X
    Saber si la pila está vacía. X
    Saber si la pila está llena. X
    Saber el número de elementos que contiene la pila. X
    Mostrar por consola los elementos de la pila, según el orden en el que saldrían los elementos de la pila. Esta operación no debe alterar la estructura de datos.
    rellenar (T[] array), almacena en la pila los objetos que hay en el array. La pila se ajusta su tamaño según el número de elementos que tenga el array.
    T[] sacarElementos(), saca los elementos de la pila y los devuelve en un array de T. La pila, después de llamar a este método, queda vacía.  
     */
    
    private ArrayList<T> pila;

    public Pila() {
        this.pila = new ArrayList<>();
    }

    public ArrayList<T> getPila() {
        return pila;
    }

    public void setPila(ArrayList<T> pila) {
        this.pila = pila;
    }

    public void push(T obj) {
        this.pila.add(obj);
    }

    public void pop() {
        this.pila.remove(this.pila.size() - 1);
    }

    public String pilaVacia() {
        return this.pila.isEmpty() ? "La pila está vacía" : "La pila contiene elementos";
    }

    public String pilaLlena() {
        return this.pila.isEmpty() ? "La pila está vacía" : "La pila contiene elementos";
    }

    public int tamanioPila() {
        return this.pila.size();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Pila{");
        sb.append("pila=").append(pila);
        sb.append('}');
        return sb.toString();
    }

}
