/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio4esamueljimenez;

/**
 *
 * @author samuel
 */
public record PersonaR(String nombre, int edad) {
    
        public void hacerCafe(Cafetera aux) {
        aux.llenarCafera();
    }

    public void beberCafe(Cafetera aux, int cantidad) {
        aux.servirTaza(cantidad);
    }
    
}
