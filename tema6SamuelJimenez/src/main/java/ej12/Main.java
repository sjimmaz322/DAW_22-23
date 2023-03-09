/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ej12;

/**
 *
 * @author sajm <sjimmaz322 at sjimmaz322@g.educaand.es>
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //---
        Cuenta c1 = new CuentaCorriente(new Persona("Samuel", "Jiménez", "31014322H"));
        Cuenta c2 = new CuentaCorriente(new Persona("Ezio", "Auditore", "14587965A"));
        Cuenta c3 = new CuentaAhorro(2.5, 133, new Persona("Lara", "Croft", "47851213T"));
        Cuenta c4 = new CuentaAhorro(3.8, 85, new Persona("Ahmed", "Mahmod", "X54789112Y"));
        //---
        c1.setSaldo(1000);
        System.out.println(c1.getSaldo());
        c1.actualizarSaldo();
        System.out.println(c1.getSaldo());
        //---
        c3.setSaldo(1001);
        System.out.println(c3.getSaldo());
        c3.actualizarSaldo();
        System.out.println(c3.getSaldo());

    }

}
