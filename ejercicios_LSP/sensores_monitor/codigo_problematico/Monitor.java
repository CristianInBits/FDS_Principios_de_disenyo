package ejercicios_LSP.sensores_monitor.codigo_problematico;

public class Monitor {
    public void mostrarLectura(Sensor sensor) {
        double valor = sensor.leerValor();
        System.out.println("Valor leído: " + valor);
    }
}