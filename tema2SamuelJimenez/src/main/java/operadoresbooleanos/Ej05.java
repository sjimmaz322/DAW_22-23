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
            verdadero && verdadero  ---     %b
            verdadero && falso      ---     %b
            falso && verdadero      ---     %b
            falso && falso          ---     %b
            verdadero || verdadero  ---     %b
            verdadero || falso      ---     %b
            falso || verdadero      ---     %b
            falso || falso          ---     %b
            !verdadero              ---     %b
            !falso                  ---     %b
                           """.formatted(verdadero && verdadero, verdadero && falso, falso && verdadero, falso && falso, verdadero || verdadero, verdadero || falso, falso || verdadero, falso || falso, !verdadero, !falso));

    }

}
