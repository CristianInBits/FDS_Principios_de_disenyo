package ejercicios_LSP.sensores_monitor.solucion;

public class Main {
    public static void main(String[] args) {

        Sensor tempSensor = new SensorTemperatura();
        Sensor humSensor = new SensorHumedad();
        Sensor demoSensor = new SensorSimulado();

        Monitor monitor = new Monitor();
        
        monitor.mostrarLectura(tempSensor);
        monitor.mostrarLectura(humSensor);
        monitor.mostrarLectura(demoSensor);
    }
}
