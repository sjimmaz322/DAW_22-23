package ejercicio5bempresarentacarsamueljimenez;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */


import java.util.Arrays;

/**
 *
 * @author samuel
 */
public class CatalogoClientes {

    private int numeroClientes;

    private Clientes[] listaClientes;

    public CatalogoClientes(int tamanio) {

        tamanio = Math.abs(tamanio);
        this.numeroClientes = tamanio;

        this.listaClientes = new Clientes[tamanio];
        for (int i = 0; i < listaClientes.length; i++) {

            this.listaClientes[i] = new Clientes();// meto vehiculos en la estructura

        }

    }

    public Clientes[] getListaClientes() {
        return listaClientes;
    }

    public int getNumeroClientes() {
        return numeroClientes;
    }

    public boolean borrarCliente(Clientes c) {
        int posicion = buscarCliente(c);
        if (posicion >= 0) {

            this.listaClientes[posicion] = null;
            this.numeroClientes--;
            return true;

        }
        return false;
    }

    public Clientes buscarClientePorNif(String nif) {
        Clientes aux = new Clientes();
        aux.setNIF(nif);
        int pos = buscarCliente(aux);

        return (pos >= 0) ? this.listaClientes[pos] : null;
    }

    public int buscarCliente(Clientes c) {
        if (c != null) {
            for (int i = 0; i < this.listaClientes.length; i++) {

                if (this.listaClientes[i] != null && c.equals(this.listaClientes[i])) {
                    return i;
                }
            }

        }
        return -1;
    }

    public void aniadirCliente(Clientes c) {
        if (this.numeroClientes < this.listaClientes.length) {
            for (int i = 0; i < listaClientes.length; i++) {
                if (this.listaClientes[i] == null) {
                    this.listaClientes[i] = c;
                    this.numeroClientes++;
                    break;
                }

            }
        } else {
            this.numeroClientes++;
            this.listaClientes = Arrays.copyOf(this.listaClientes, this.numeroClientes);
            this.listaClientes[this.numeroClientes - 1] = c;
        }
    }

    private Clientes[] copiar() {
        Clientes[] aux = new Clientes[listaClientes.length + 1];

        for (int i = 0; i < listaClientes.length; i++) {
            aux[i] = listaClientes[i];
        }
        return aux;
    }

    @Override
    public String toString() {
        String tmp = "";
        for (Clientes c : listaClientes) {

            if (c != null) {
                tmp += c.toString() + "\n";
            }

        }
        return tmp;
    }
}
