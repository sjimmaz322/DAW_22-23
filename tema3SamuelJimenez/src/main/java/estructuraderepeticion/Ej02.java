/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package estructuraderepeticion;

import java.util.Scanner;

/**
 *
 * @author sajm <sjimmaz322 at sjimmaz322@g.educaand.es>
 */
public class Ej02 {

    /*
    El programa imprime números desde el 1 hasta el número que hayas introducido separados por " - "
     */
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int n, x;
        System.out.print("Ingrese el valor final:");
        n = teclado.nextInt();
        x = 1;
        while (x <= n) {
            System.out.print(x);
            System.out.print(" - ");
            x = x + 1;
        }
        x = 1;

        //Lo hacemos con un for
        for (int i = x; i <= n; i++) {
            System.out.print(i);
            System.out.print(" - ");
        }
    }

}
