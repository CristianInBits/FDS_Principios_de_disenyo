package ejercicios_LSP.vehiculos_impuestos.solucion;

public class Camion extends Vehiculo implements Matriculable {
    private String matricula;
    private String PMA; // peso máximo autorizado

    public String getMatricula() {
        return matricula;
    }
}
