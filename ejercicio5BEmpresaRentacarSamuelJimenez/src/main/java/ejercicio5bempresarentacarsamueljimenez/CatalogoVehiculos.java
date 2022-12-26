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
public class CatalogoVehiculos {

    private int numeroVehiculos;

    private ArrayList<Vehiculo> listaVehiculos;

    // el construcutor recibe el tamaño del catalogo
    //inicializa la estructura de datos con vehiuclos aleatorios
    public CatalogoVehiculos(int tamanio) {

        tamanio = Math.abs(tamanio);

        this.listaVehiculos = new ArrayList<>();
        for (int i = 0; i < tamanio; i++) {

            this.listaVehiculos.add(new Vehiculo());// meto vehiculos en la estructura

        }

    }

    public void mostrarCatalogo() {

        for (Vehiculo v : listaVehiculos) {
            System.out.println(v);
        }

    }

    public int getNumeroVehiculos() {
        return numeroVehiculos;
    }

    public boolean borrarVehiculo(Vehiculo v) {

        return this.listaVehiculos.remove(v);
    }

    public Vehiculo buscarVehiculo(Vehiculo v) {

        if (this.listaVehiculos.contains(v)) {
            return v;
        } else {
            return null;
        }
    }

    public Vehiculo buscarVehiculoPorBastidor(String bastidor) {
        Vehiculo aux = new Vehiculo();
        for (int i = 0; i < listaVehiculos.size(); i++) {
            if (this.listaVehiculos.get(i).getBastidor().equalsIgnoreCase(bastidor)) {
                aux = this.listaVehiculos.get(i);
            } else {
                aux = null;
            }

        }
        return aux;
    }

    public void aniadirVehiculo(Vehiculo v) {
        this.listaVehiculos.add(v);
    }

    @Override
    public String toString() {
        String tmp = " ";
        for (Vehiculo v : listaVehiculos) {

            if (v != null) {
                tmp += v.toString() + "\n";
            }

        }
        return tmp;
    }

    private ArrayList<Vehiculo> copiar() {
        ArrayList<Vehiculo> aux = (ArrayList<Vehiculo>) this.listaVehiculos.clone();
        return aux;
    }
}
