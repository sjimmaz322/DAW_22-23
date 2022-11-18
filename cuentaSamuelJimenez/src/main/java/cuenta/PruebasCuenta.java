/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package cuenta;

/**
 *
 * @author samuel
 */
public class PruebasCuenta {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Cuenta cuenta1 = new Cuenta("31014322H", "Samuel Jiménez", 544.86, 0.25);
        Cuenta cuenta2 = new Cuenta();

        System.out.println(cuenta1);
        System.out.println(" ");
        System.out.println(cuenta2);
        System.out.println(" ");

        System.out.println("Sumamos dinero a la cuenta 1");
        CalculosCuenta.ingresarDinero(cuenta1, 15.14);
        System.out.println(cuenta1);

        System.out.println(" ");

        System.out.println("Quitamos 160 euros a la cuenta 1, lo cual está permitido por saldo disponible");
        CalculosCuenta.retirarDinero(cuenta1, 160.0);
        System.out.println(cuenta1);

        System.out.println(" ");

        System.out.println("Retiramos 1000 euros de la cuenta 1, no debe permitirlo por falta de saldo");
        CalculosCuenta.retirarDinero(cuenta1, 1000);

        System.out.println(" ");
        System.out.println(cuenta1);
        System.out.println(" ");

        System.out.println("Sumamos los intereses a la cuenta 1");

        double sumaIntereses = (cuenta1.getSaldoActual() * cuenta1.getInteres());
        System.out.println("Sería una suma de " + sumaIntereses);

        CalculosCuenta.ingresarIntereses(cuenta1);
        System.out.println(cuenta1);

    }

}
