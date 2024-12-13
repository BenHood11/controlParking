package persistencia;

/**
 *
 * @author GitCats
 */

import javax.swing.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConexionBD {
    private static final String URL = "jdbc:mysql://localhost:3306/controlParking";
    private static final String USUARIO = "root";
    private static final String CONTRASENA = "root";

    public static Connection obtenerConexion() {
        Connection conexion = null;
        
        try {
            conexion = DriverManager.getConnection(URL, USUARIO, CONTRASENA);
            JOptionPane.showMessageDialog(null, "Conexión a la base de datos correcta", "Éxito", JOptionPane.INFORMATION_MESSAGE);
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Conexión a la base de datos incorrecta: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
        
        return conexion;
    }
}
