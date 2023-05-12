/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package p81samueljimenez;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author samuel
 */
public class FacturaDAO implements IFactura {

    private Connection con = null;

    public FacturaDAO() {
        //con = ConexionCasa.getInstance();
        con = ConexionClase.getInstance();
    }

    @Override
    public List<Factura> getAll() throws SQLException {
        List<Factura> lista = new ArrayList<>();

        // Preparamos la consulta de datos mediante un objeto Statement
        // ya que no necesitamos parametrizar la sentencia SQL
        try ( Statement st = con.createStatement()) {
            // Ejecutamos la sentencia y obtenemos las filas en el objeto ResultSet
            ResultSet res = st.executeQuery("select * from facturas");
            // Ahora construimos la lista, recorriendo el ResultSet y mapeando los datos
            while (res.next()) {
                Factura f = new Factura();
                // Recogemos los datos de la persona, guardamos en un objeto
                f.setCodigoUnico(res.getInt("codigoUnico"));
                f.setDescripcion(res.getString("descripcion"));
                f.setTotalImporte(res.getDouble("totalImporte"));
                f.setFechaEmision(res.getDate("fechaEmision").toLocalDate());

                //Añadimos el objeto a la lista
                lista.add(f);
            }
        }

        return lista;
    }

    @Override
    public Factura findByPk(int pk) throws SQLException {

        ResultSet res = null;
        Factura f = new Factura();

        String sql = "select * from facturas where codigoUnico=?";

        try ( PreparedStatement prest = con.prepareStatement(sql)) {
            // Preparamos la sentencia parametrizada
            prest.setInt(1, pk);

            // Ejecutamos la sentencia y obtenemos las filas en el objeto ResultSet
            res = prest.executeQuery();

            // Nos posicionamos en el primer registro del Resultset. Sólo debe haber una fila
            // si existe esa pk
            if (res.next()) {
                // Recogemos los datos de la persona, guardamos en un objeto
                f.setCodigoUnico(res.getInt("codigoUnico"));
                f.setDescripcion(res.getString("descripcion"));
                f.setTotalImporte(res.getDouble("totalImporte"));
                f.setFechaEmision(res.getDate("fechaEmision").toLocalDate());
                return f;
            }

            return null;
        }
    }

    @Override
    public int insertFactura(Factura f) throws SQLException {

        int numFilas = 0;
        String sql = "insert into facturas values (?,?,?,?)";

        if (findByPk(f.getCodigoUnico()) != null) {
            // Instanciamos el objeto PreparedStatement para inserción
            // de datos. Sentencia parametrizada
            return numFilas;
        } else {
            try ( PreparedStatement prest = con.prepareStatement(sql)) {

                // Establecemos los parámetros de la sentencia
                prest.setInt(1, f.getCodigoUnico());
                prest.setDate(2, Date.valueOf(f.getFechaEmision()));
                prest.setString(3, f.getDescripcion());
                prest.setDouble(4, f.getTotalImporte());

                numFilas = prest.executeUpdate();
            }
            return numFilas;
        }

    }

    @Override
    public int insertFactura(List<Factura> lista) throws SQLException {
        int numFilas = 0;

        for (Factura tmp : lista) {
            numFilas += insertFactura(tmp);
        }

        return numFilas;
    }

    @Override
    public int deleteAll() throws SQLException {

        String sql = "delete from facturas";

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
    public int deleteFactura(Factura f) throws SQLException {
        int numFilas = 0;

        String sql = "delete from facturas where codigoUnico = ?";

        // Sentencia parametrizada
        try ( PreparedStatement prest = con.prepareStatement(sql)) {

            // Establecemos los parámetros de la sentencia
            prest.setInt(1, f.getCodigoUnico());
            // Ejecutamos la sentencia
            numFilas = prest.executeUpdate();
        }
        return numFilas;
    }

    @Override
    public int updateFactura(int pk, Factura nuevosDatos) throws SQLException {

        int numFilas = 0;
        String sql = "update facturas set fechaEmision = ?, descripcion = ?, totalImporte = ? where codigoUnico=?";

        if (findByPk(pk) == null) {
            // La factura a actualizar no existe
            return numFilas;
        } else {
            // Instanciamos el objeto PreparedStatement para actualización
            // de datos. Sentencia parametrizada
            try ( PreparedStatement prest = con.prepareStatement(sql)) {

                // Establecemos los parámetros de la sentencia
                prest.setDate(1, Date.valueOf(nuevosDatos.getFechaEmision()));
                prest.setString(2, nuevosDatos.getDescripcion());
                prest.setDouble(3, nuevosDatos.getTotalImporte());
                prest.setInt(4, nuevosDatos.getCodigoUnico());

                numFilas = prest.executeUpdate();
            }
            return numFilas;
        }
    }
}
