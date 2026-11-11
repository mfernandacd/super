package conexion;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

//clase 
public class Conexion {

    private static final String URL = "jdbc:mysql://localhost:3306/supermercado5";
    private static final String USUARIO = "root";
    private static final String CLAVE = "";

 //metodo de la clase
    public static Connection obtenerConexion() {

        Connection con = null;

        try {

            Class.forName("com.mysql.cj.jdbc.Driver");
            
            
            //metodo que toma los datos de los parametros y ejecuta conexion
            con = DriverManager.getConnection(
                    URL,
                    USUARIO,
                    CLAVE
            );

        } catch (ClassNotFoundException e) {

            JOptionPane.showMessageDialog(
                    null,
                    "Error: Driver MySQL no encontrado."
            );

        } catch (SQLException e) {

            JOptionPane.showMessageDialog(
                    null,
                    "Error al conectar a MySQL: " + e.getMessage()
            );
        }

        return con;
    }
}