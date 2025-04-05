package ejercicios_LSP.vehiculos_impuestos.solucion;

public class Main {

    public static void main(String[] args) {

        Impuestos impuestos = new Impuestos();

        Matriculable coche = new Coche();
        Matriculable camion = new Camion();

        // Ciclomotor no puede usarse aquí porque no implementa Matriculable → OK
    }
}
