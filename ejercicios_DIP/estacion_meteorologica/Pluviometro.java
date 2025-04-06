package ejercicios_DIP.estacion_meteorologica;

public class Pluviometro implements IMeteoAparato {
    private double lluviaAcumulada;

    public Pluviometro(double lluvia) {
        this.lluviaAcumulada = lluvia;
    }

    @Override
    public String mostrar() {
        return "Lluvia acumulada: " + lluviaAcumulada + " mm";
    }
}