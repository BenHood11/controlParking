package logica;

/**
 *
 * @author benja
 */

public abstract class VehiculoBase {
    protected String placa;
    protected String propietario;
    protected String marca;
    protected String modelo;
    protected String categoria;

    public VehiculoBase(String placa, String propietario, String marca, String modelo, String categoria) {
        this.placa = placa;
        this.propietario = propietario;
        this.marca = marca;
        this.modelo = modelo;
        this.categoria = categoria;
    }
    public abstract void mostrarDetalles();
}
