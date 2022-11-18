/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */
package cuenta;

import org.apache.commons.lang3.RandomStringUtils;

/**
 *
 * @author samuel
 */
public class Cuenta {

    private final String numCuenta;
    private String nifCliente;
    private String nomCliente;
    private double saldoActual;
    private double interes;

    public Cuenta() {
        this.numCuenta = generarNumeroCuenta();
    }

    public Cuenta(String nifCliente, String nomCliente, double saldoActual, double interes) {
        this.numCuenta = generarNumeroCuenta();
        this.nifCliente = nifCliente;
        this.nomCliente = nomCliente;
        this.saldoActual = saldoActual;
        if (interes < 0.1 || interes > 3) {
            interes = 0.1;
        }
        this.interes = interes;
    }

    public double getInteres() {
        return interes;
    }

    public void setInteres(double interes) {
        if (interes < 0.1 || interes > 3) {
            interes = 0.1;
        }
        this.interes = interes;
    }

    public String getNumCuenta() {
        return numCuenta;
    }

    public String getNifCliente() {
        return nifCliente;
    }

    public void setNifCliente(String nifCliente) {
        this.nifCliente = nifCliente;
    }

    public String getNomCliente() {
        return nomCliente;
    }

    public void setNomCliente(String nomCliente) {
        this.nomCliente = nomCliente;
    }

    public double getSaldoActual() {
        return saldoActual;
    }

    public void setSaldoActual(double saldoActual) {
        this.saldoActual = saldoActual;
    }

    private static String generarNumeroCuenta() {
        String numCuenta = RandomStringUtils.randomNumeric(20);
        return numCuenta;
    }

    @Override
    public String toString() {
        return "La cuenta de " + nomCliente + ".\n"
                + "Con NIF " + nifCliente + ".\n"
                + "Con número de cuenta " + numCuenta + ".\n"
                + "Posee un saldo de " + saldoActual + "€.\n"
                + "Y un interés del " + interes + "%.";
    }

}
