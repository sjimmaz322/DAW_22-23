/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ej8;

import java.util.Random;

/**
 *
 * @author samuel
 */
public class Moneda extends Azar {

    private static Random rd = new Random();

    public Moneda() {
        super(2);

    }

    @Override
    public int lanzar() {

        return rd.nextInt(this.posibilidades) + 1;
    }

}
