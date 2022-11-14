/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicios;

/**
 *
 * @author samuel
 */
public class Serie {

    /*
    Serie: Título, genero (Acción, comedia, Scifi,Drama),sinopsis,  número de temporadas, director/productor.
     */
    private String titulo, genero, sinopsis, directorProductor;
    private int numTemporadas, numLikes;

    public Serie() {
        this.titulo = "";
        this.genero = "";
        this.sinopsis = "";
        this.directorProductor = "";
        this.numTemporadas = 0;
        this.numLikes = 0;
    }

    public Serie(String titulo, String genero, String sinopsis, String directorProductor, int numTemporadas) {
        this.titulo = titulo;
        this.genero = genero;
        this.sinopsis = sinopsis;
        this.directorProductor = directorProductor;
        this.numTemporadas = numTemporadas;
    }

    public Serie(String titulo, String genero, String sinopsis, String directorProductor, int numTemporadas, int numLikes) {
        this.titulo = titulo;
        this.genero = genero;
        this.sinopsis = sinopsis;
        this.directorProductor = directorProductor;
        this.numTemporadas = numTemporadas;
        this.numLikes = numLikes;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getSinopsis() {
        return sinopsis;
    }

    public void setSinopsis(String sinopsis) {
        this.sinopsis = sinopsis;
    }

    public String getDirectorProductor() {
        return directorProductor;
    }

    public void setDirectorProductor(String directorProductor) {
        this.directorProductor = directorProductor;
    }

    public int getNumTemporadas() {
        return numTemporadas;
    }

    public void setNumTemporadas(int numTemporadas) {
        this.numTemporadas = numTemporadas;
    }

    @Override
    public String toString() {
        return "La serie " + titulo + "\n"
                + "Es del género " + genero + "\n"
                + "Dirigida/Producida por " + directorProductor + "\n"
                + "Con " + numTemporadas + " temporadas \n"
                + "Y cuya sinopsis es \n" + sinopsis;

    }

}
