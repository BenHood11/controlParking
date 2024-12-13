package logica;

/**
 *
 * @author benja
 */

public class Vehiculo extends VehiculoBase {

    public Vehiculo(String placa, String propietario, String marca, String modelo, String categoria) {
        super(placa, propietario, marca, modelo, categoria);
    }

    @Override
    public void mostrarDetalles() {
        System.out.println("Placa: " + placa);
        System.out.println("Propietario: " + propietario);
        System.out.println("Marca: " + marca);
        System.out.println("Modelo: " + modelo);
        System.out.println("Categoría: " + categoria);
    }
    
}