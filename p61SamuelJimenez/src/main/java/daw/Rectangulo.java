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
public final class Rectangulo extends Poligono implements Dibujable, Movible {//--- Hacemos herencia múltiple gracias a las interfaces

    private Point p1, p2, p3, p4;

    public Rectangulo() {
    }

    public Rectangulo(int base, int altura, int id, String color) {
        super(base, altura, 4, id, color);
        this.p1 = new Point(0, 0);
        this.p2 = new Point(0, altura);
        this.p3 = new Point(base, altura);
        this.p4 = new Point(base, 0);
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

    public Point getP4() {
        return p4;
    }

    public void setP4(Point p4) {
        this.p4 = p4;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString()).append("\n");
        sb.append("Rectangulo{");
        sb.append("p1=").append(p1);
        sb.append(", p2=").append(p2);
        sb.append(", p3=").append(p3);
        sb.append(", p4=").append(p4);
        sb.append('}');
        return sb.toString();
    }

    @Override
    public void dibujar() {
        String[][] matriz = new String[this.getAltura()][this.getBase()];

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                if (i == 0 || i == matriz.length - 1 || j == 0 || j == matriz[i].length - 1) {
                    matriz[i][j] = "*";
                } else {
                    matriz[i][j] = " ";

                }

            }

        }

        for (String[] matriz1 : matriz) {
            for (String matriz11 : matriz1) {
                System.out.print(matriz11);
            }
            System.out.println("");
        }

    }

    @Override
    public void moverIzq(int x) {

        this.p1.setLocation(this.p1.getX() - x, this.p1.getY());
        this.p2.setLocation(this.p2.getX() - x, this.p2.getY());
        this.p3.setLocation(this.p3.getX() - x, this.p3.getY());
        this.p4.setLocation(this.p4.getX() - x, this.p4.getY());

    }

    @Override
    public void moverDer(int x) {
        this.p1.setLocation(this.p1.getX() + x, this.p1.getY());
        this.p2.setLocation(this.p2.getX() + x, this.p2.getY());
        this.p3.setLocation(this.p3.getX() + x, this.p3.getY());
        this.p4.setLocation(this.p4.getX() + x, this.p4.getY());
    }

    @Override
    public void moverArr(int y) {
        this.p1.setLocation(this.p1.getX(), this.p1.getY() + y);
        this.p2.setLocation(this.p2.getX(), this.p2.getY() + y);
        this.p3.setLocation(this.p3.getX(), this.p3.getY() + y);
        this.p4.setLocation(this.p4.getX(), this.p4.getY() + y);
    }

    @Override
    public void moverAba(int y) {
        this.p1.setLocation(this.p1.getX(), this.p1.getY() - y);
        this.p2.setLocation(this.p2.getX(), this.p2.getY() - y);
        this.p3.setLocation(this.p3.getX(), this.p3.getY() - y);
        this.p4.setLocation(this.p4.getX(), this.p4.getY() - y);
    }
}
