/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package daw;

/**
 *
 * @author samuel
 */
public abstract class Ropa extends Producto implements SeEnvia {

    private String marca;

    public Ropa() {
    }

    public Ropa(String marca, int codigo, int IVA, double precio, String descripcion) {
        super(codigo, IVA, precio, descripcion);
        this.marca = marca;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString()).append("\n");
        sb.append("Ropa{");
        sb.append("marca=").append(marca);
        sb.append('}');
        return sb.toString();
    }


}
