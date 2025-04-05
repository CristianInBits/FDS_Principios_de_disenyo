package ejercicios_LSP.sensores_monitor.solucion;

public class Monitor {
    public void mostrarLectura(Sensor sensor) {
        System.out.println("Valor leído: " + sensor.leerValor());
    }
}