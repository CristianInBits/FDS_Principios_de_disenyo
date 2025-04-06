package ejercicios_DIP.estacion_meteorologica;

public class EstacionMeteorologica {
    private IMeteoAparato aparato;

    public EstacionMeteorologica(IMeteoAparato aparato) {
        this.aparato = aparato;
    }

    public void mostrarDatos() {
        System.out.println(aparato.mostrar());
    }
}