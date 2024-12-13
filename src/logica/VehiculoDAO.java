package logica;

import persistencia.ConexionBD;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
 
public class VehiculoDAO implements VehiculoInterface {

    @Override
    public boolean registrarVehiculo(Vehiculo vehiculo) {
        String sql = "INSERT INTO Vehiculo (PLACA, PROPIETARIO, MARCA, MODELO, CATEGORIA) VALUES (?, ?, ?, ?, ?)";

        try (Connection conexion = ConexionBD.obtenerConexion();
             PreparedStatement ps = conexion.prepareStatement(sql)) {

            ps.setString(1, vehiculo.placa);
            ps.setString(2, vehiculo.propietario);
            ps.setString(3, vehiculo.marca);
            ps.setString(4, vehiculo.modelo);
            ps.setString(5, vehiculo.categoria);

            ps.executeUpdate();
            return true;

        } catch (SQLException e) {
            System.err.println("Error al registrar vehículo: " + e.getMessage());
            return false;
        }
    }
}