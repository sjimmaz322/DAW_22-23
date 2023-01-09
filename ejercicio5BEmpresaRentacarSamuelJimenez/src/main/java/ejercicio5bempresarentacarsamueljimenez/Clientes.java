package ejercicio5bempresarentacarsamueljimenez;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
import java.util.Objects;
import org.apache.commons.lang3.RandomStringUtils;

/**
 *
 * @author samuel
 */
public class Clientes {

    private String nombre, apellido1, apellido2;
    private String NIF;
//    private final String[] letras = {"T", "R", "W", "A", "G", "M", "Y", "F", "P", "D", "X", "B", "N", "J", "Z", "S", "Q", "V", "H", "L", "C", "K", "E"};
    private static int contador = 0;
    private int numAlquileres;

    public Clientes() {
        this.nombre = RandomStringUtils.randomAlphabetic(6);
        this.apellido1 = RandomStringUtils.randomAlphabetic(6);
        this.apellido2 = RandomStringUtils.randomAlphabetic(6);
        contador++;
        this.NIF = String.valueOf(contador);
        this.numAlquileres = 0;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido1() {
        return apellido1;
    }

    public void setApellido1(String apellido1) {
        this.apellido1 = apellido1;
    }

    public String getApellido2() {
        return apellido2;
    }

    public void setApellido2(String apellido2) {
        this.apellido2 = apellido2;
    }

    public String getNIF() {
        return NIF;
    }

    public void setNIF(String NIF) {
        this.NIF = NIF;
    }

    public static int getContador() {
        return contador;
    }

    public int getNumAlquileres() {
        return numAlquileres;
    }

    public void setNumAlquileres(int numAlquileres) {
        this.numAlquileres = numAlquileres;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 67 * hash + Objects.hashCode(this.NIF);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Clientes other = (Clientes) obj;
        return Objects.equals(this.NIF, other.NIF);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("\n---------");
        sb.append("\nNombre: ").append(nombre);
        sb.append("\nPrimer apellido: ").append(apellido1);
        sb.append("\nSegundo apellido: ").append(apellido2);
        sb.append("\nDNI: ").append(NIF);
        sb.append("\nHa alquilado: ").append(numAlquileres).append(" coches.");
        sb.append("\n---------");
        return sb.toString();
    }

}
