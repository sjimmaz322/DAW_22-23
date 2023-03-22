/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package daw;

/**
 *
 * @author samuel
 */
public final class LibroPapel extends Libro implements SeEnvia {

    private int numPaginas;

    public LibroPapel() {
    }

    public LibroPapel(int numPaginas, String isbn, int codigo, int IVA, double precio, String descripcion) {
        super(isbn, codigo, IVA, precio, descripcion);
        this.numPaginas = numPaginas;
    }

    public int getNumPaginas() {
        return numPaginas;
    }

    public void setNumPaginas(int numPaginas) {
        this.numPaginas = numPaginas;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString()).append("\n");
        sb.append("LibroPapel{");
        sb.append("numPaginas=").append(numPaginas);
        sb.append('}');
        return sb.toString();
    }

    @Override
    public void enviar(String direccion) {
        System.out.println("El libro se enviará a la siguiente dirección: " + direccion);
    }

    @Override
    public void encanto() {
        System.out.println("El encant del libro con " + numPaginas + " páginas es el olor a libro nuevo.");
    }

}
