/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package daw;

/**
 *
 * @author samuel
 */
public final class Musica extends Producto {

    private String grupo;

    public Musica() {
    }

    public Musica(String grupo, int codigo, int IVA, double precio, String descripcion) {
        super(codigo, IVA, precio, descripcion);
        this.grupo = grupo;
    }

    public String getGrupo() {
        return grupo;
    }

    public void setGrupo(String grupo) {
        this.grupo = grupo;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString()).append("\n");
        sb.append("Musica{");
        sb.append("grupo=").append(grupo);
        sb.append('}');
        return sb.toString();
    }

}
