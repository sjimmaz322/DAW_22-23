/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package museo;

/**
 *
 * @author sajm <sjimmaz322 at sjimmaz322@g.educaand.es>
 */
public class Cuadro extends Obra {

    private String estilo, titulo;

    public Cuadro() {
    }

    public Cuadro(String estilo, String titulo, int id, String autor) {
        super(id, autor);
        this.estilo = estilo;
        this.titulo = titulo;
    }

    public String getEstilo() {
        return estilo;
    }

    public void setEstilo(String estilo) {
        this.estilo = estilo;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    @Override
    public String toString() {
        return super.toString() + "Cuadro{" + "estilo=" + estilo + ", titulo=" + titulo + '}';
    }

}
