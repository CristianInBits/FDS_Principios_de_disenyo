package ejercicios_LSP.vehiculos_energia.codigo_problematico;

public class EstacionServicio {
    public void suministrarCombustible(Vehiculo vehiculo) {
        vehiculo.repostar();  // ❌ Esto puede lanzar una excepción si es un eléctrico
    }
}