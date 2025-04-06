package ejercicios_ISP.productos_edad.interfaz_transversal;

public class Book implements AgeAware {
    private String title;
    private int recommendedAge;

    public Book(String title, int recommendedAge) {
        this.title = title;
        this.recommendedAge = recommendedAge;
    }

    @Override
    public int getRecommendedAge() {
        return recommendedAge;
    }
}