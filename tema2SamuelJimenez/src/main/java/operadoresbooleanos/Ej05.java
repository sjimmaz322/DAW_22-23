package operadoresbooleanos;

/**
 *
 * @author sajm <sjimmaz322 at sjimmaz322@g.educaand.es>
 */
public class Ej05 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Declaramos e inicializamos las variables requeridas

        boolean verdadero = true, falso = false;
        
        //Imprimimos por consola el resultado de las operaciones lógicas directamente,
        //nos ahorramos crear variables para cada operación
        System.out.println("""
        verdadero && verdadero \t---\t""" + (verdadero && verdadero) + """
        \nverdadero && falso \t---\t""" + (verdadero && falso) + """                                                 
        \nfalso && verdadero \t---\t""" + (falso && verdadero) + """
        \nfalso && falso \t---\t""" + (falso && falso) + """
        \nverdadero || verdadero \t---\t""" + (verdadero || verdadero) + """
        \nverdadero || falso \t---\t""" + (verdadero || falso) + """
        \nfalso || verdadero \t---\t""" + (falso || verdadero) + """
        \nfalso || falso \t---\t""" + (falso || falso) + """
        \n!verdadero \t---\t""" + (!verdadero) + """
        \n!falso \t---\t""" + (!falso));
    }

}
