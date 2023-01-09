/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio5bempresarentacarsamueljimenez;

import java.time.LocalDate;

/**
 *
 * @author samuel
 */
public class Prueba {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Empresa e = new Empresa();
        e.setNombre("PacheCar");
        e.setCif("80085");
        System.out.println("-----");
        for (int i = 0; i < 5; i++) {
            e.aniadirCliente();
        }
        e.listadoClientes.getListaClientes().get(0).setNumAlquileres(1);
        
        System.out.println("----- Borramos Clientes sin Alquileres -----");
        e.borrarClientesSinAlquileres(e.listadoClientes.getListaClientes().get(0));
        System.out.println(e);
        
    }
    
}
