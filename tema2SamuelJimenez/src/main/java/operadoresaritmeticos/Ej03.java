package operadoresaritmeticos;

/**
 *
 * @author sajm
 */
public class Ej03 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        //Declaramos e inicializamos las variables con el nombre y el valor requerido
        int a = 10, b = 5, i = 0;
        double c = 71.3, d = 4.8;

        //Declaramos e inicializamos las variables que contendrán las operaciones requeridas
        int suma = a + b, resta = a - b, multiplicacion = a * b, division = a / b;
        double sumaDouble = c + d, restaDouble = c - d, multiplicacionDouble = c * d, divisionDouble = c / d;
        int multiplicacion2 = a *= 3;
        int resta2 = b -= 1;
        int division2 = a /= b;
        double suma2 = c += d;

        //Imprimimos los resultados en un textblock
        System.out.println("""
                           Suma                     -   %d
                           Resta                    -   %d
                           Multiplicación           -   %d
                           División                 -   %d
                           Suma double              -   %.2f
                           Resta double             -   %.2f
                           Multiplicación double    -   %.2f
                           División double          -   %.2f
                           a*=3                     -   %d
                           b-=1                     -   %d
                           a/=b                     -   %d
                           c+=d                     -   %.2f
                           i                        -   %d
                           i++                      -   %d
                           ++i                      -   %d
                           """.formatted(suma, resta, multiplicacion, division, sumaDouble, restaDouble, multiplicacionDouble,
                divisionDouble, multiplicacion2, resta2, division2, suma2, i, i++, ++i));

    }

}
