/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package daw;

/**
 *
 * @author samuel
 */
public final class LibroDigital extends Libro implements SeDescarga {

    private int numKBytes;

    public LibroDigital() {
    }

    public LibroDigital(int numKBytes, String isbn, int codigo, int IVA, double precio, String descripcion) {
        super(isbn, codigo, IVA, precio, descripcion);
        this.numKBytes = numKBytes;
    }

    public int getNumKBytes() {
        return numKBytes;
    }

    public void setNumKBytes(int numKBytes) {
        this.numKBytes = numKBytes;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString()).append("\n");
        sb.append("LibroDigital{");
        sb.append("numKBytes=").append(numKBytes);
        sb.append('}');
        return sb.toString();
    }

    @Override
    public void descargar() {
        System.out.println("https://SamuelJimenez.daw/" + this.hashCode());
    }

    @Override
    public void encanto() {
        System.out.println("El encanto de lo libros digitales aunque ocupen " + numKBytes + " es que realmente no ocupan espacio físico.");
    }

}
