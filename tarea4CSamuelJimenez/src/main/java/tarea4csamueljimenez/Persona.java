/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tarea4csamueljimenez;

import org.apache.commons.lang3.RandomStringUtils;

/**
 *
 * @author samuel
 */
public class Persona {

    private final String[] letras = {"T", "R", "W", "A", "G", "M", "Y", "F", "P", "D", "X", "B", "N", "J", "Z", "S", "Q", "V", "H", "L", "C", "K", "E"};

    private String nombre;
    private final String NIF;
    private float peso, altura;
    private char sexo;

    public Persona() {
        this.nombre = "";
        this.sexo = 'O';
        this.peso = 0F;
        this.altura = 0F;
        this.NIF = generarNIF(letras);
    }

    public Persona(String nombre, char sexo, float peso, float altura) {
        this.nombre = nombre;
        if (!filtrarSexo(sexo)) {
            sexo = 'O';
        }
        this.sexo = sexo;
        this.peso = peso;
        this.altura = altura;
        this.NIF = generarNIF(letras);
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public char getSexo() {
        return sexo;
    }

    public void setSexo(char sexo) {
        if (!filtrarSexo(sexo)) {
            sexo = 'O';
        }
        this.sexo = sexo;
    }

    public String getDNI() {
        return NIF;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(float peso) {
        this.peso = peso;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(float altura) {
        this.altura = altura;
    }

    @Override
    public String toString() {
        return "Persona{" + "nombre=" + nombre + ", sexo=" + sexo + ", DNI=" + NIF + ", peso=" + peso + ", altura=" + altura + '}';
    }

    private static String generarNIF(String[] letras) {
        String DNI = RandomStringUtils.randomNumeric(8);
        int numDNI = Integer.parseInt(DNI);
        String letra = letras[numDNI % 23];
        String DNICompleto = DNI.concat(letra);

        return DNICompleto;
    }

    private static float calcularIMC(float altura, float peso) {
        float IMC = peso / (float) Math.pow(peso, 2);
        return IMC;
    }

    private static boolean esMayorEdad(int edad) {
        return edad >= 18;
    }

    private static boolean filtrarSexo(char sex) {
        return Character.compare(sex, 'H') == 0 || Character.compare(sex, 'M') == 0 || Character.compare(sex, 'O') == 0;
    }

    private static void darLikeSerie(Serie serie) {
        serie.darLike();
    }
}
