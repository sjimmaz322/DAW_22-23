/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package operadoresbooleanos;

/**
 *
 * @author sajm <sjimmaz322 at sjimmaz322@g.educaand.es>
 */
public class Ej07 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*
        a)
        67>20 && 13>12
        true && true
        true
        */
        
        /*
        b)
        12 % 2 == 0
        (12%2) == 0
        0 == 0
        true
        */
        
        /*
        c)
        (15 % 7) + 1 == 3
        1+1 == 3
        2 == 3
        false
        */
        
        /*
        d)
        10<=2*5&&3<4||!(8>7)&&3*2<=4*2-1
        10<=10&&false||!(true)&&6<=7
        true&&true||false&&true
        true||false
        true
        */
        
        /*
        e)
        !(a>b&&2*a<=b)  con a = 5 y b = 3
        !(5>3&&2*5<=3)
        !(true&&10<=3)
        !(true&&false)
        !(false)
        true
        */
        
        /*
        f)
        a/2<b&&((a++/2>b) || (a*2<b*4)) con a = 5 y b = 3
        5/2<3&&((5++/2>3) || (5*2<3*4))
        true&&false || true
        false || true
        true
        */
        
        /*
        g)
        b>3||a+b<=8&&!(a>b)   con a = 5 y b = 4
        4>3 || 5+4<=8 && !(5>4)
        true || 9<=8 && !true
        true || false && false
        true || false
        true       
        */

        
    }
    
}
