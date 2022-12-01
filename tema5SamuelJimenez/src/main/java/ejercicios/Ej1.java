/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */
package ejercicios;

/**
 *
 * @author samuel
 */
public class Ej1 {

    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4, 5, 6};
        int suma = 0;

        for (int i = 0; i < nums.length; i++) {
            System.out.println(nums[i]);
            suma += nums[i];
        }
        System.out.println("La suma es: " + suma);
    }
}
