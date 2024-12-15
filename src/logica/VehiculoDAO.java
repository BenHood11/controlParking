package logica;

import persistencia.ConexionBD;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import logica.Vehiculo;
 
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
    
    public String obtenerUltimaPlacaRegistrada() {
    String ultimaPlaca = "";
    // Ordenamos por la PLACA en lugar de 'id'
    String sql = "SELECT placa FROM vehiculo ORDER BY PLACA DESC LIMIT 1"; // Ordenar por PLACA en orden descendente

    try (Connection con = ConexionBD.obtenerConexion();
         PreparedStatement ps = con.prepareStatement(sql);
         ResultSet rs = ps.executeQuery()) {

        if (rs.next()) {
            ultimaPlaca = rs.getString("placa");
        }
    } catch (SQLException e) {
        System.err.println("Error al obtener la última placa registrada: " + e.getMessage());
    }

    return ultimaPlaca;
    }
    
    public List<Vehiculo> obtenerVehiculos() {
        List<Vehiculo> vehiculos = new ArrayList<>();
        String sql = "SELECT PLACA, PROPIETARIO, CATEGORIA, MARCA FROM VEHICULO";

        try (Connection con = ConexionBD.obtenerConexion();
             PreparedStatement ps = con.prepareStatement(sql);
             ResultSet rs = ps.executeQuery()) {

            while (rs.next()) {
                Vehiculo vehiculo = new Vehiculo(
                    rs.getString("PLACA"),
                    rs.getString("PROPIETARIO"),
                    rs.getString("MARCA"),
                    rs.getString("MODELO"),  // Asegúrate de que este campo también esté disponible si es necesario
                    rs.getString("CATEGORIA")
                );
                vehiculos.add(vehiculo);
            }
        } catch (SQLException e) {
            System.err.println("Error al obtener vehículos: " + e.getMessage());
        }

        return vehiculos;
    }
}