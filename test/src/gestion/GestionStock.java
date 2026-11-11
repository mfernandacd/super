package gestion;

import clases.Producto;
import conexion.Conexion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class GestionStock {

    public boolean guardarProducto(Producto producto) {

        String sql = "INSERT INTO productos "
                + "(codigo_producto, nombre, categoria, "
                + "precio_compra, precio_venta, stock, id_proveedor) "
                + "VALUES (?, ?, ?, ?, ?, ?, ?)";

        try {

            Connection con = Conexion.obtenerConexion();

            PreparedStatement ps = con.prepareStatement(sql);

            ps.setString(1, producto.getCodigoProducto());
            ps.setString(2, producto.getNombre());
            ps.setString(3, producto.getCategoria());
            ps.setDouble(4, producto.getPrecioCompra());
            ps.setDouble(5, producto.getPrecioVenta());
            ps.setInt(6, producto.getStock());
            ps.setInt(7, producto.getIdProveedor());

            ps.executeUpdate();

            ps.close();
            con.close();

            return true;

        } catch (SQLException e) {

            System.out.println("Error al guardar producto: "
                    + e.getMessage());

            return false;
        }
    }

    public ResultSet buscarProductos(String textoBusqueda) {

        String sql = "SELECT * FROM productos "
                + "WHERE codigo_producto LIKE ? "
                + "OR nombre LIKE ? "
                + "OR categoria LIKE ?";

        try {

            Connection con = Conexion.obtenerConexion();

            PreparedStatement ps =
                    con.prepareStatement(sql);

            String criterio =
                    "%" + textoBusqueda + "%";

            ps.setString(1, criterio);
            ps.setString(2, criterio);
            ps.setString(3, criterio);

            return ps.executeQuery();

        } catch (SQLException e) {

            System.out.println("Error al buscar productos: "
                    + e.getMessage());

            return null;
        }
    }

    public boolean modificarProducto(Producto producto) {

        String sql = "UPDATE productos "
                + "SET nombre = ?, "
                + "categoria = ?, "
                + "precio_compra = ?, "
                + "precio_venta = ?, "
                + "stock = ?, "
                + "id_proveedor = ? "
                + "WHERE codigo_producto = ?";

        try {

            Connection con = Conexion.obtenerConexion();

            PreparedStatement ps =
                    con.prepareStatement(sql);

            ps.setString(1, producto.getNombre());
            ps.setString(2, producto.getCategoria());
            ps.setDouble(3, producto.getPrecioCompra());
            ps.setDouble(4, producto.getPrecioVenta());
            ps.setInt(5, producto.getStock());
            ps.setInt(6, producto.getIdProveedor());
            ps.setString(7,
                    producto.getCodigoProducto());

            int filas = ps.executeUpdate();

            ps.close();
            con.close();

            return filas > 0;

        } catch (SQLException e) {

            System.out.println("Error al modificar producto: "
                    + e.getMessage());

            return false;
        }
    }

    public boolean eliminarProducto(
            String codigoProducto) {

        String sql = "DELETE FROM productos "
                + "WHERE codigo_producto = ?";

        try {

            Connection con = Conexion.obtenerConexion();

            PreparedStatement ps =
                    con.prepareStatement(sql);

            ps.setString(1, codigoProducto);

            ps.executeUpdate();

            ps.close();
            con.close();

            return true;

        } catch (SQLException e) {

            System.out.println("Error al eliminar producto: "
                    + e.getMessage());

            return false;
        }
    }

    public String generarCodigoProducto() {

    String codigo = "P001";

    try {

        Connection con = Conexion.obtenerConexion();

        String sql =
                "SELECT MAX(CAST(SUBSTRING(codigo_producto,2) AS UNSIGNED)) "
                + "AS ultimo_codigo "
                + "FROM productos";

        PreparedStatement ps =
                con.prepareStatement(sql);

        ResultSet rs = ps.executeQuery();

        if (rs.next()) {

            int numero = rs.getInt("ultimo_codigo");

            numero++;

            codigo = String.format("P%03d", numero);
        }

        rs.close();
        ps.close();
        con.close();

    } catch (Exception e) {

        System.out.println(
                "Error al generar código: "
                + e.getMessage());
    }

    return codigo;
}
}