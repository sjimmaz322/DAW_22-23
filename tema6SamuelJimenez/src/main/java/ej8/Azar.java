/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ej8;

/**
 *
 * @author samuel
 */
public abstract class Azar {

    protected int posibilidades;

    public Azar(int posibilidades) {
        this.posibilidades = posibilidades;
    }

    public Azar() {

    }

    public int getPosibilidades() {
        return posibilidades;
    }

    public abstract int lanzar();
}
