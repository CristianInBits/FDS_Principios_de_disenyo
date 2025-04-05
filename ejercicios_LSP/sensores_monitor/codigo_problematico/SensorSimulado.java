package ejercicios_LSP.sensores_monitor.codigo_problematico;

public class SensorSimulado extends Sensor {
    @Override
    public double leerValor() {
        throw new UnsupportedOperationException("Este sensor no está conectado");
    }
}