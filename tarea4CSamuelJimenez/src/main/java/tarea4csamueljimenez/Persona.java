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
    private String NIF = "";
    private int edad;
    private double peso, altura;
    private char sexo;

    public Persona() {
        this.nombre = "";
        this.sexo = 'O';
        this.edad = 0;
        this.peso = 0F;
        this.altura = 0F;
        this.NIF = generarNIF(letras);
    }

    public Persona(String nombre, char sexo, int edad, double peso, double altura) {
        this.nombre = nombre;
        if (!filtrarSexo(sexo)) {
            sexo = 'O';
        }
        this.edad = edad;
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

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    @Override
    public String toString() {
        return nombre + " tiene los siguientes datos\nNif: " + NIF + "\nSexo: " + sexo + "\nEdad: " + edad + "\nAltura: " + altura + " m \nPeso " + peso + " kg.";
    }

    private static String generarNIF(String[] letras) {
        String DNI = RandomStringUtils.randomNumeric(8);
        int numDNI = Integer.parseInt(DNI);
        String letra = letras[numDNI % 23];
        String DNICompleto = DNI.concat(letra);

        return DNICompleto;
    }

    protected float calcularIMC() {
        float IMC = (float) (this.peso / Math.pow(this.altura, 2));
        return IMC;
    }

    protected boolean esMayorEdad() {
        return this.edad >= 18;
    }

    private static boolean filtrarSexo(char sex) {
        return Character.compare(sex, 'H') == 0 || Character.compare(sex, 'M') == 0 || Character.compare(sex, 'O') == 0;
    }

    protected void darLikeSerie(Serie serie) {
        serie.darLike();
    }
}
