/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package daw;

/**
 *
 * @author samuel
 */
public class Casilla {

    //--- Creamos los atributos de la clase
    private int fila, columna;
    private TipoCasilla tipo;

    //--- Constructor parametrizado, a ser de atributos inmutables no se podrán cambiar una vez creados
    //--- por ello es inútil hacer un constructor por defecto
    public Casilla(int fila, int columna, TipoCasilla tipo) {
        this.fila = fila;
        this.columna = columna;
        this.tipo = tipo;
    }

    //--- Getters
    public int getFila() {
        return fila;
    }

    public int getColumna() {
        return columna;
    }

    public TipoCasilla getTipo() {
        return tipo;
    }

    //--- No setters porque una vez creado el objeto será inmutable, valdría hacer un Record.
    
    //--- toString que devuelve únicamente el tipo de casilla según el enunciado
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(tipo);
        return sb.toString();
    }

}
