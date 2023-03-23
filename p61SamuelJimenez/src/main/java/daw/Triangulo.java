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
public final class Triangulo extends Poligono implements Comparable<Triangulo> {

    private Point p1, p2, p3;

    public Triangulo() {
    }

    public Triangulo(int base, int altura, int id, String color) {
        super(base, altura, 3, id, color);
        this.p1 = new Point(0, 0);
        this.p2 = new Point(0, altura);
        this.p3 = new Point(base, 0);
    }

    public Point getP1() {
        return p1;
    }

    public void setP1(Point p1) {
        this.p1 = p1;
    }

    public Point getP2() {
        return p2;
    }

    public void setP2(Point p2) {
        this.p2 = p2;
    }

    public Point getP3() {
        return p3;
    }

    public void setP3(Point p3) {
        this.p3 = p3;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString()).append("\n");
        sb.append("Triangulo{");
        sb.append("p1=").append(p1);
        sb.append(", p2=").append(p2);
        sb.append(", p3=").append(p3);
        sb.append('}');
        return sb.toString();
    }

    @Override
    public double area() {
        return ((double) this.getBase() * (double) this.getAltura()) / 2;
    }

    @Override
    public int compareTo(Triangulo o) {
        return Integer.compare(this.getBase(), o.getBase());
    }

}
