/*
 * Interface que usa el patrón DAO sobre la tabla Persona
 */
package trabajobbdd;

import java.sql.SQLException;
import java.util.List;
import productos.Producto;

/**
 *
 * @author J. Carlos F. Vico <jcarlosvico@maralboran.es>
 */
public interface IProducto {

    // Método para obtener todos los registros de la tabla
    List<Producto> getAll() throws SQLException;

    // Méodo para obtener un registro a partir de la PK
    Producto findByPk(int pk) throws SQLException;

    // Método para insertar un registro
    int insertProducto(Producto persona) throws SQLException;

    // Método para insertar varios registros
    int insertProducto(List<Producto> lista) throws SQLException;

    // Método para borrar una persona
    int deleteProducto(Producto p) throws SQLException;

    // Método para borrar toda la tabla
    int deleteProducto() throws SQLException;

    // Método para modificar una persona. Se modifica a la persona que tenga esa 'pk'
    // con los nuevos datos que traiga la persona 'nuevosDatos'
    int updateProducto(int pk, Producto nuevosDatos) throws SQLException;

}
