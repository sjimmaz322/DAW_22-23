/*
 * Clase que implementa la interface IPersona
 */
package trabajobbdd;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import productos.Producto;
import samuel.conexionbd.ConexionCasa;
//--- import samuel.conexionbd.ConexionClase;

/**
 *
 * @author J. Carlos F. Vico <jcarlosvico@maralboran.es>
 */
public class ProductoDAO implements IProducto {

    private Connection con = null;

    public ProductoDAO() {
        con = ConexionCasa.getInstance();
        //---con = ConexionClase.getInstance();
    }

    @Override
    public List<Producto> getAll() throws SQLException {
        List<Producto> lista = new ArrayList<>();

        // Preparamos la consulta de datos mediante un objeto Statement
        // ya que no necesitamos parametrizar la sentencia SQL
        try ( Statement st = con.createStatement()) {
            // Ejecutamos la sentencia y obtenemos las filas en el objeto ResultSet
            ResultSet res = st.executeQuery("select * from productos");
            // Ahora construimos la lista, recorriendo el ResultSet y mapeando los datos
            while (res.next()) {
                Producto p = new Producto();
                // Recogemos los datos de la persona, guardamos en un objeto
                p.setId(res.getInt("id"));
                p.setDescripcion(res.getString("descripcion"));
                p.setPrecio(res.getDouble("precio"));

                //Añadimos el objeto a la lista
                lista.add(p);
            }
        }

        return lista;
    }

    @Override
    public Producto findByPk(int pk) throws SQLException {

        ResultSet res = null;
        Producto p = new Producto();

        String sql = "select * from productos where id=?";

        try ( PreparedStatement prest = con.prepareStatement(sql)) {
            // Preparamos la sentencia parametrizada
            prest.setInt(1, pk);

            // Ejecutamos la sentencia y obtenemos las filas en el objeto ResultSet
            res = prest.executeQuery();

            // Nos posicionamos en el primer registro del Resultset. Sólo debe haber una fila
            // si existe esa pk
            if (res.next()) {
                // Recogemos los datos de la persona, guardamos en un objeto
                p.setId(res.getInt("id"));
                p.setDescripcion(res.getString("descripcion"));
                p.setPrecio(res.getDouble("precio"));
                return p;
            }

            return null;
        }
    }

    @Override
    public int insertProducto(Producto p) throws SQLException {

        int numFilas = 0;
        String sql = "insert into productos values (?,?,?)";

        if (findByPk(p.getId()) != null) {
            // Existe un registro con esa pk
            // No se hace la inserción
            return numFilas;
        } else {
            // Instanciamos el objeto PreparedStatement para inserción
            // de datos. Sentencia parametrizada
            try ( PreparedStatement prest = con.prepareStatement(sql)) {

                // Establecemos los parámetros de la sentencia
                prest.setInt(1, p.getId());
                prest.setString(2, p.getDescripcion());
                prest.setDouble(3, p.getPrecio());

                numFilas = prest.executeUpdate();
            }
            return numFilas;
        }

    }

    @Override
    public int insertProducto(List<Producto> lista) throws SQLException {
        int numFilas = 0;

        for (Producto tmp : lista) {
            numFilas += insertProducto(tmp);
        }

        return numFilas;
    }

    @Override
    public int deleteProducto() throws SQLException {

        String sql = "delete from productos";

        int nfilas = 0;

        // Preparamos el borrado de datos  mediante un Statement
        // No hay parámetros en la sentencia SQL
        try ( Statement st = con.createStatement()) {
            // Ejecución de la sentencia
            nfilas = st.executeUpdate(sql);
        }

        // El borrado se realizó con éxito, devolvemos filas afectadas
        return nfilas;

    }

    @Override
    public int deleteProducto(Producto persona) throws SQLException {
        int numFilas = 0;

        String sql = "delete from productos where id = ?";

        // Sentencia parametrizada
        try ( PreparedStatement prest = con.prepareStatement(sql)) {

            // Establecemos los parámetros de la sentencia
            prest.setInt(1, persona.getId());
            // Ejecutamos la sentencia
            numFilas = prest.executeUpdate();
        }
        return numFilas;
    }

    @Override
    public int updateProducto(int pk, Producto nuevosDatos) throws SQLException {

        int numFilas = 0;
        String sql = "update productos set id = ?, descripcion = ? where id=?";

        if (findByPk(pk) == null) {
            // La persona a actualizar no existe
            return numFilas;
        } else {
            // Instanciamos el objeto PreparedStatement para inserción
            // de datos. Sentencia parametrizada
            try ( PreparedStatement prest = con.prepareStatement(sql)) {

                // Establecemos los parámetros de la sentencia
                prest.setInt(1, nuevosDatos.getId());
                prest.setString(2, nuevosDatos.getDescripcion());
                prest.setInt(3, pk);

                numFilas = prest.executeUpdate();
            }
            return numFilas;
        }
    }
}
