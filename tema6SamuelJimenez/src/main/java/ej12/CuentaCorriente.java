/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ej12;

/**
 *
 * @author sajm <sjimmaz322 at sjimmaz322@g.educaand.es>
 */
public class CuentaCorriente extends Cuenta {

    private final double INTERES = 1.5;
    private final double SALDO_MINIMO = 100.00;

    public CuentaCorriente(Persona cliente) {
        super(cliente);
    }

    public double getINTERES() {
        return INTERES;
    }

    public double getSALDO_MINIMO() {
        return SALDO_MINIMO;
    }

    @Override
    public void actualizarSaldo() {
        if (getSaldo() > 1000) {
            setSaldo(getSaldo() + (SALDO_MINIMO * INTERES));
        } else {
            setSaldo(getSaldo() + (getSaldo() * INTERES));
        }
    }

    @Override
    public void retirarSaldo(double cantidad) {
        if (getSaldo() - cantidad >= SALDO_MINIMO) {
            setSaldo(getSaldo() - cantidad);
        } else {
            System.out.println("Saldo insuficiente para realizar la operación");
        }
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.append("CuentaCorriente{");
        sb.append("INTERES=").append(INTERES);
        sb.append(", SALDO_MINIMO=").append(SALDO_MINIMO);
        sb.append('}');
        return sb.toString();
    }

}
