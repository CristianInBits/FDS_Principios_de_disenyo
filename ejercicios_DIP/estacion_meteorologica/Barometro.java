package ejercicios_DIP.estacion_meteorologica;

public class Barometro implements IMeteoAparato {
    private double presion;

    public Barometro(double presion) {
        this.presion = presion;
    }

    @Override
    public String mostrar() {
        return "Presión atmosférica: " + presion + " hPa";
    }
}