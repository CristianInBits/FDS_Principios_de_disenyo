package ejercicios_LSP.vehiculos_energia.codigo_problematico;

public class CocheElectrico extends Vehiculo {
    @Override
    public void repostar() {
        throw new UnsupportedOperationException("¡Este vehículo no usa combustible!");
    }

    public void recargarBateria() {
        System.out.println("Recargando batería...");
    }
}