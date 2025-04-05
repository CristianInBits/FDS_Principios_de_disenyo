package ejercicios_LSP.vehiculos_impuestos.solucion;

public class Impuestos {

    public void calcularImpuesto(Matriculable vehiculo) {
        String matricula = vehiculo.getMatricula();
    }

    public void servicioCalculoImpuestos(String matricula) {
        System.out.println("Calculando impuestos para matricula: " + matricula);
    }
}