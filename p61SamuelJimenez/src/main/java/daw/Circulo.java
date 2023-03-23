/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package daw;

import java.awt.Point;

/**
 *
 * @author samuel
 */
public class Circulo extends Figura implements Movible {

    private int longitudRadio;
    private Point p1;

    public Circulo(int longitudRadio, int id, String color) {
        super(id, color);
        this.longitudRadio = longitudRadio;
        this.p1 = new Point(0, 0);
    }

    public Circulo() {
    }

    public int getLongitudRadio() {
        return longitudRadio;
    }

    public void setLongitudRadio(int longitudRadio) {
        this.longitudRadio = longitudRadio;
    }

    public Point getP1() {
        return p1;
    }

    public void setP1(Point p1) {
        this.p1 = p1;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString()).append("\n");
        sb.append("Circulo{");
        sb.append("longitudRadio=").append(longitudRadio);
        sb.append(", Point =").append(p1);
        sb.append('}');
        return sb.toString();
    }

    @Override
    public double area() {
        return Math.PI * Math.pow(longitudRadio, 2);
    }

    @Override
    public void moverIzq(int x) {

        this.p1.setLocation(this.p1.getX() - x, this.p1.getY());

    }

    @Override
    public void moverDer(int x) {
        this.p1.setLocation(this.p1.getX() + x, this.p1.getY());

    }

    @Override
    public void moverArr(int y) {
        this.p1.setLocation(this.p1.getX(), this.p1.getY() + y);

    }

    @Override
    public void moverAba(int y) {
        this.p1.setLocation(this.p1.getX(), this.p1.getY() - y);

    }

}
