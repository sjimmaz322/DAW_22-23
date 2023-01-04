package ejercicio5bempresarentacarsamueljimenez;

import java.util.ArrayList;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 *
 * @author samuel
 */
public class CatalogoAlquileres {

    private ArrayList<Alquileres> listaAlquileres;
    private int numAlquileres;

    // el construcutor recibe el tamaño del catalogo
    //inicializa la estructura de datos con vehiuclos aleatorios
    public CatalogoAlquileres() {

        this.listaAlquileres = new ArrayList<>();

    }

    public void mostrarCatalogo() {

        for (Alquileres v : listaAlquileres) {
            System.out.println(v);
        }

    }

    public int getNumAlquileres() {
        return this.listaAlquileres.size();
    }

    public boolean borrarAlquileres(Alquileres v) {

        return this.listaAlquileres.remove(v);
    }

    public Alquileres buscarAlquileres(Alquileres v) {

        if (this.listaAlquileres.contains(v)) {
            return v;
        } else {
            return null;
        }
    }

    public Alquileres buscarAlquileresPorId(int id) {
        Alquileres aux = new Alquileres();
        for (int i = 0; i < listaAlquileres.size(); i++) {
            if (this.listaAlquileres.get(i).getAlquileresID() == id) {
                aux = this.listaAlquileres.get(i);
            } else {
                aux = null;
            }

        }
        return aux;
    }

    public void aniadirAlquileres(Alquileres v) {
        this.listaAlquileres.add(v);
    }

    @Override
    public String toString() {
        String tmp = " ";
        for (Alquileres v : listaAlquileres) {

            if (v != null) {
                tmp += v.toString() + "\n";
            }

        }
        return tmp;
    }

    private ArrayList<Alquileres> copiar() {
        ArrayList<Alquileres> aux = (ArrayList<Alquileres>) this.listaAlquileres.clone();
        return aux;
    }
}
