/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Record.java to edit this template
 */
package repasoclase;

/**
 *
 * @author samuel
 */
public record Jugador(String nombre, int dorsal) implements Comparable<Jugador> {

    @Override
    public int compareTo(Jugador o) {
        return Integer.compare(this.dorsal, o.dorsal);
    }

}
