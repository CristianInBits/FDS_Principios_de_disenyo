package ejercicios_LSP.sensores_monitor.codigo_problematico;

public class SensorTemperatura extends Sensor {
    @Override
    public double leerValor() {
        // Supongamos que lee de hardware
        return 22.5;
    }
}