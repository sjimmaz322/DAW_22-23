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
public class CatalogoClientes {

    private ArrayList<Clientes> listaClientes;

    // el construcutor recibe el tamaño del catalogo
    //inicializa la estructura de datos con vehiuclos aleatorios
    public CatalogoClientes(int tamanio) {

        tamanio = Math.abs(tamanio);

        this.listaClientes = new ArrayList<>();
        for (int i = 0; i < tamanio; i++) {

            this.listaClientes.add(new Clientes());// meto vehiculos en la estructura

        }

    }

    public void mostrarCatalogo() {

        for (Clientes v : listaClientes) {
            System.out.println(v);
        }

    }

    public boolean borrarClientes(Clientes v) {

        return this.listaClientes.remove(v);
    }

    public Clientes buscarClientes(Clientes v) {

        if (this.listaClientes.contains(v)) {
            return v;
        } else {
            return null;
        }
    }

    public Clientes buscarClientesPorNif(String nif) {
        Clientes aux = new Clientes();
        for (int i = 0; i < listaClientes.size(); i++) {
            if (this.listaClientes.get(i).getNIF().equalsIgnoreCase(nif)) {
                aux = this.listaClientes.get(i);
            } else {
                aux = null;
            }

        }
        return aux;
    }

    public void aniadirClientes(Clientes v) {
        this.listaClientes.add(v);
    }

    @Override
    public String toString() {
        String tmp = " ";
        for (Clientes v : listaClientes) {

            if (v != null) {
                tmp += v.toString() + "\n";
            }

        }
        return tmp;
    }

    private ArrayList<Clientes> copiar() {
        ArrayList<Clientes> aux = (ArrayList<Clientes>) this.listaClientes.clone();
        return aux;
    }
}
