package ejercicios_DIP.estacion_meteorologica;

public class Termometro implements IMeteoAparato {
    private double temperatura;

    public Termometro(double temperatura) {
        this.temperatura = temperatura;
    }

    @Override
    public String mostrar() {
        return "Temperatura actual: " + temperatura + "°C";
    }
}