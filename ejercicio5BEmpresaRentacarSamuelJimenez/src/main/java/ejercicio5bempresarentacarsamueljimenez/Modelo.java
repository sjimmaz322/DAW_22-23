package ejercicio5bempresarentacarsamueljimenez;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Enum.java to edit this template
 */
import java.util.Random;

/**
 *
 * @author samuel
 */
public enum Modelo {
    SEAT_PANDA("Seat", "Panda", "48"),
    FORD_KUGA("Ford", "Kuga", "120"),
    CUPRA("Seat", "Cupra", "95");

    String marca;
    String modelo;
    String cilindrada;

    private Modelo(String marca, String modelo, String cilindrada) {

        this.marca = marca;
        this.modelo = modelo;
        this.cilindrada = cilindrada;

    }

    public String getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }

    public String getCilindrada() {
        return cilindrada;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("\nMarca : ").append(marca);
        sb.append("\nModelo : ").append(modelo);
        sb.append("\nCilindrada : ").append(cilindrada);
        return sb.toString();
    }

    public static Modelo getAleatorio() {
        Random r = new Random();
        Modelo[] modelos = Modelo.values();

        int posicionValida = r.nextInt(0, modelos.length);

        return modelos[posicionValida];

    }
}
