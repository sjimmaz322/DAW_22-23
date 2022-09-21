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
        System.out.println(
                """
        Suma =\t""" + suma + """
                                         
        Resta =\t""" + resta + """
                                          
        Multiplicación =\t""" + multiplicacion + """
                                                           
        División =\t""" + division + """
                                                     
        Suma Double =\t""" + sumaDouble + """
                                                         
        Resta Double =\t""" + restaDouble + """
                                                           
        Multipliación Double =\t""" + multiplicacionDouble + """
                                                                            
        División Double =\t""" + divisionDouble + """
                                                  
        a*=3 =\t """ + multiplicacion2 + """
                                                            
        b-=1 =\t """ + resta2 + """ 
                                                                                                   
        a/=b =\t """ + division2 + """
                                                                                    
        c+=d =\t """ + suma2 + """
                 
        i =\t """ + i + """
                    
        i++ = \t """ + i++ + """
                      
        ++i =\t """ + ++i + """
                                                                                                             
        """);
    }

}
