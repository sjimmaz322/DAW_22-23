package samuel.conexionbd;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
//--- Samuel Jiménez

public class ConexionCasa {

    private static final String SERVIDOR = "jdbc:mysql://localhost/";
    private static final String NOMBRE_BASE_DATOS = "bdProg";
    private static final String USER = "root";
    private static final String PASS = "admin";

    private static Connection instancia = null;

    // Patrón Singleton
    // Constructor privado no accesible desde otras clases
    private ConexionCasa() {

    }

    // Método de clase para acceder a la instancia del objeto Connection
    public static Connection getInstance() {
        // Si el objeto Connection no está creado, se crea
        if (instancia == null) {
            try {

                // Se crea el objeto Connection	
                instancia = DriverManager.getConnection(SERVIDOR + NOMBRE_BASE_DATOS, USER, PASS);

                System.out.println("Conexión realizada con éxito.");

            } catch (SQLException e) {

                // Error en la conexión
                System.out.println("Conexión fallida: " + e.getMessage());
            }
        }
        return instancia;
    }

}
