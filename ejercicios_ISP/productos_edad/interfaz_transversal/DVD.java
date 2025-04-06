package ejercicios_ISP.productos_edad.interfaz_transversal;

import java.time.LocalDateTime;

public class DVD implements AgeAware {
    private String name;
    private int stock;
    private LocalDateTime releaseDate;
    private int recommendedAge;

    public DVD(String name, int stock, LocalDateTime releaseDate, int recommendedAge) {
        this.name = name;
        this.stock = stock;
        this.releaseDate = releaseDate;
        this.recommendedAge = recommendedAge;
    }

    public String getName() {
        return name;
    }

    public int getStock() {
        return stock;
    }

    public LocalDateTime getReleaseDate() {
        return releaseDate;
    }

    public int getRecommendedAge() {
        return recommendedAge;
    }
}