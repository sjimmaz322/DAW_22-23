/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ej12;

/**
 *
 * @author sajm <sjimmaz322 at sjimmaz322@g.educaand.es>
 */
public class CuentaAhorro extends Cuenta {

    private double interes;
    private double comision;

    public CuentaAhorro(double interes, double comision, Persona cliente) {
        super(cliente);
        this.interes = interes;
        this.comision = comision;
    }

    public double getInteres() {
        return interes;
    }

    public void setInteres(double interes) {
        this.interes = interes;
    }

    public double getComision() {
        return comision;
    }

    public void setComision(double comision) {
        this.comision = comision;
    }

    @Override
    public void actualizarSaldo() {
        if (getSaldo() > 1000) {
            setSaldo((getSaldo() + (getSaldo() * interes)) - comision);
        }
    }

    @Override
    public void retirarSaldo(double cantidad) {

        if (getSaldo() - cantidad >= 0) {
            setSaldo(getSaldo() - cantidad);
        }
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.append("CuentaAhorro{");
        sb.append("interes=").append(interes);
        sb.append(", comision=").append(comision);
        sb.append('}');
        return sb.toString();
    }

}
