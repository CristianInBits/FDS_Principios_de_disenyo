package ejercicios_LSP.vehiculos_impuestos.codigo_problematico;

public class Impuestos {
    public void calcularImpuesto(Vehiculo vehiculo) {
        // Asume que todos los vehículos tienen matrícula
        String matricula = ((Coche) vehiculo).getMatricula();
        servicioCalculoImpuestos(matricula);
    }

    private void servicioCalculoImpuestos(String matricula) {
        System.out.println("Calculando impuestos para matrícula: " + matricula);
    }
}