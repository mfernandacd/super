package gestion;

import conexion.Conexion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class GestionVentas {

    public ResultSet buscarCliente(String textoBusqueda) {

        String sql = "SELECT * FROM clientes "
                + "WHERE nombre LIKE ? "
                + "OR dni LIKE ?";

        try {

            Connection con = Conexion.obtenerConexion();

            PreparedStatement ps = con.prepareStatement(sql);

            String criterio = "%" + textoBusqueda + "%";

            ps.setString(1, criterio);
            ps.setString(2, criterio);

            return ps.executeQuery();

        } catch (SQLException e) {

            System.out.println("Error al buscar cliente: "
                    + e.getMessage());

            return null;
        }
    }

    public ResultSet buscarProducto(String textoBusqueda) {

        String sql = "SELECT * FROM productos "
                + "WHERE nombre LIKE ? "
                + "OR codigo_producto LIKE ? "
                + "OR categoria LIKE ?";

        try {

            Connection con = Conexion.obtenerConexion();

            PreparedStatement ps = con.prepareStatement(sql);

            String criterio = "%" + textoBusqueda + "%";

            ps.setString(1, criterio);
            ps.setString(2, criterio);
            ps.setString(3, criterio);

            return ps.executeQuery();

        } catch (SQLException e) {

            System.out.println("Error al buscar producto: "
                    + e.getMessage());

            return null;
        }
    }

    public int guardarVenta(
            String codigoVenta,
            int idCliente,
            double total,
            String hora,
            String metodoPago) {

        int idVentaGenerado = 0;

        String sql =
                "INSERT INTO ventas "
                + "(codigo_venta,id_cliente,total,hora,metodo_pago) "
                + "VALUES (?,?,?,?,?)";

        try {

            Connection con =
                    Conexion.obtenerConexion();

            PreparedStatement ps =
                    con.prepareStatement(
                            sql,
                            Statement.RETURN_GENERATED_KEYS);

            ps.setString(1, codigoVenta);
            ps.setInt(2, idCliente);
            ps.setDouble(3, total);
            ps.setString(4, hora);
            ps.setString(5, metodoPago);

            ps.executeUpdate();

            ResultSet rs =
                    ps.getGeneratedKeys();

            if (rs.next()) {

                idVentaGenerado = rs.getInt(1);
            }

        } catch (SQLException e) {

            System.out.println(
                    "Error al guardar venta: "
                    + e.getMessage());
        }

        return idVentaGenerado;
    }

    public void guardarDetalleVenta(
            int idVenta,
            int idProducto,
            int cantidad,
            double precioUnitario,
            double subtotal) {

        String sql =
                "INSERT INTO detalle_ventas "
                + "(id_venta,id_producto,cantidad,"
                + "precio_unitario,subtotal) "
                + "VALUES (?,?,?,?,?)";

        try {

            Connection con =
                    Conexion.obtenerConexion();

            PreparedStatement ps =
                    con.prepareStatement(sql);

            ps.setInt(1, idVenta);
            ps.setInt(2, idProducto);
            ps.setInt(3, cantidad);
            ps.setDouble(4, precioUnitario);
            ps.setDouble(5, subtotal);

            ps.executeUpdate();

        } catch (SQLException e) {

            System.out.println(
                    "Error al guardar detalle: "
                    + e.getMessage());
        }
    }
    
   public void descontarStock(
        int idProducto,
        int cantidad) {

    String sql =
            "UPDATE productos "
            + "SET stock = stock - ? "
            + "WHERE id_producto = ?";

    try {

        Connection con =
                Conexion.obtenerConexion();

        PreparedStatement ps =
                con.prepareStatement(sql);

        ps.setInt(1, cantidad);
        ps.setInt(2, idProducto);

        ps.executeUpdate();

    } catch (SQLException e) {

        System.out.println(
                "Error al descontar stock: "
                + e.getMessage());
    }
}
}