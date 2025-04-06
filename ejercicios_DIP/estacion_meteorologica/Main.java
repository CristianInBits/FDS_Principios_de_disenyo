package ejercicios_DIP.estacion_meteorologica;

public class Main {
    public static void main(String[] args) {
        IMeteoAparato termometro = new Termometro(22.3);
        IMeteoAparato pluviometro = new Pluviometro(5.7);
        IMeteoAparato barometro = new Barometro(1015.2);

        EstacionMeteorologica estacion1 = new EstacionMeteorologica(termometro);
        EstacionMeteorologica estacion2 = new EstacionMeteorologica(pluviometro);
        EstacionMeteorologica estacion3 = new EstacionMeteorologica(barometro);

        estacion1.mostrarDatos();
        estacion2.mostrarDatos();
        estacion3.mostrarDatos();
    }
}