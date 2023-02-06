/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejerciciopilagenerico;

import java.util.ArrayList;

/**
 *
 * @author samuel
 * @param <T>
 */
public class Pila<T> {

    private ArrayList<T> pila;
    private int tamanioMax;

    public Pila(int tamanio) {
        this.tamanioMax = tamanio;
        this.pila = new ArrayList();
    }

    public int getTamanioMax() {
        return tamanioMax;
    }

    public void setTamanioMax(int tamanioMax) {
        this.tamanioMax = tamanioMax;
    }

    public ArrayList<T> getPila() {
        return pila;
    }

    public void setPila(ArrayList<T> pila) {
        this.pila = pila;
    }

    public void push(T obj) {
        if (this.pila.size() < tamanioMax) {
            this.pila.add(obj);
        }
    }

    public void pop() {
        if (!pila.isEmpty()) {
            this.pila.remove(this.pila.size() - 1);
        }
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

    public void mostrarLista() {
        int pos = this.pila.size();
        for (int i = pila.size() - 1; i >= 0; i--) {
            System.out.println(this.pila.get(i));
            pos--;
        }
    }

    public void rellenar(T[] aux) {
        for (T aux1 : aux) {
            this.push(aux1);
        }

    }

    public Object[] sacarElementos() {
        Object[] aux = this.pila.toArray();

        this.pila.clear();

        return aux;
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
