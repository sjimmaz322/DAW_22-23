/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cuenta;

/**
 *
 * @author samuel
 */
public class CalculosCuenta {

    public static void ingresarIntereses(Cuenta aux) {
        double nuevoSaldo = aux.getSaldoActual() + (aux.getSaldoActual() * aux.getInteres());
        aux.setSaldoActual(nuevoSaldo);
    }

    public static void ingresarDinero(Cuenta aux, double cantidad) {
        cantidad = Math.abs(cantidad);
        aux.setSaldoActual(aux.getSaldoActual() + cantidad);
    }

    public static void retirarDinero(Cuenta aux, double cantidad) {
        cantidad = Math.abs(cantidad);
        if ((aux.getSaldoActual() - cantidad) >= 0) {
            aux.setSaldoActual(aux.getSaldoActual() - cantidad);
        } else {
            System.out.println("Saldo insuficiente para realizar la operción, proceso cancelado");
        }
    }

}
