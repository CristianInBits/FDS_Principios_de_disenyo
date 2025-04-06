package ejercicios_ISP.productos_edad.interfaz_extendida;

import java.time.LocalDateTime;

public class DVD implements ProductDVD {
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

    @Override
    public String getName() {
        return name;
    }

    @Override
    public int getStock() {
        return stock;
    }

    @Override
    public LocalDateTime getReleaseDate() {
        return releaseDate;
    }

    @Override
    public int getRecommendedAge() {
        return recommendedAge;
    }
}
