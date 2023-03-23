/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package daw;

/**
 *
 * @author samuel
 */
public abstract class Poligono extends Figura {

    private int base, altura, numLados;

    public Poligono() {
    }

    public Poligono(int base, int altura, int numLados, int id, String color) {
        super(id, color);
        this.base = base;
        this.altura = altura;
        this.numLados = numLados;
    }

    public int getBase() {
        return base;
    }

    public void setBase(int base) {
        this.base = base;
    }

    public int getAltura() {
        return altura;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }

    public int getNumLados() {
        return numLados;
    }

    public void setNumLados(int numLados) {
        this.numLados = numLados;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString()).append("\n");
        sb.append("Poligono{");
        sb.append("base=").append(base);
        sb.append(", altura=").append(altura);
        sb.append(", numLados=").append(numLados);
        sb.append('}');
        return sb.toString();
    }

    @Override
    public double area() {
        return this.base * this.altura;
    }

}
