package ejercicios_ISP.productos_edad.interfaz_transversal;

public class TeatroCallejero implements AgeAware {
    private String titulo;
    private int edadMinima;

    public TeatroCallejero(String titulo, int edadMinima) {
        this.titulo = titulo;
        this.edadMinima = edadMinima;
    }

    @Override
    public int getRecommendedAge() {
        return edadMinima;
    }
}