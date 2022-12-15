package ejercicio5bempresarentacarsamueljimenez;

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

    private Vehiculo[] listaVehiculos;

    // el construcutor recibe el tamaño del catalogo
    //inicializa la estructura de datos con vehiuclos aleatorios
    public CatalogoVehiculos(int tamanio) {

        tamanio = Math.abs(tamanio);
        this.numeroVehiculos = tamanio;

        this.listaVehiculos = new Vehiculo[tamanio];// creo estructura
        for (int i = 0; i < listaVehiculos.length; i++) {

            this.listaVehiculos[i] = new Vehiculo();// meto vehiculos en la estructura

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
        int posicion = buscarVehiculo(v);
        if (posicion >= 0) {

            this.listaVehiculos[posicion] = null;
            this.numeroVehiculos--;
            return true;

        }
        return false;
    }

    public int buscarVehiculo(Vehiculo v) {

        for (int i = 0; i < this.listaVehiculos.length; i++) {
            if (v.equals(this.listaVehiculos[i])) {
                return i;

            }
        }
        return -1;
    }

    public Vehiculo buscarVehiculoPorBastidor(String bastidor) {
        Vehiculo aux = new Vehiculo();
        aux.setBastidor(bastidor);
        int pos = buscarVehiculo(aux);

        return (pos >= 0) ? this.listaVehiculos[pos] : null;
    }

    public int buscarCliente(Vehiculo c) {
        if (c != null) {
            for (int i = 0; i < this.listaVehiculos.length; i++) {

                if (this.listaVehiculos[i] != null && c.equals(this.listaVehiculos[i])) {
                    return i;
                }
            }

        }
        return -1;
    }

    public void aniadirVehiculo(Vehiculo v) {
        if (this.numeroVehiculos < this.listaVehiculos.length) {
            for (int i = 0; i < listaVehiculos.length; i++) {
                if (this.listaVehiculos[i] == null) {
                    this.listaVehiculos[i] = v;
                    this.numeroVehiculos++;
                    break;
                }
            }
        } else {
            this.numeroVehiculos++;
//            this.listaVehiculos = Arrays.copyOf(this.listaVehiculos, this.numeroVehiculos);
            this.listaVehiculos = copiar();
        }
    }

    public Vehiculo[] getListaVehiculos() {
        return listaVehiculos;
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

    private Vehiculo[] copiar() {
        Vehiculo[] aux = new Vehiculo[listaVehiculos.length + 1];

        for (int i = 0; i < listaVehiculos.length; i++) {
            aux[i] = listaVehiculos[i];
        }
        return aux;
    }
}
