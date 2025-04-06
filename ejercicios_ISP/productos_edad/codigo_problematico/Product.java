package ejercicios_ISP.productos_edad.codigo_problematico;

import java.time.LocalDateTime;

public interface Product {
    String getName();

    int getStock();

    LocalDateTime getReleaseDate();

    int getRecommendedAge(); // 👈 añadido para DVDs
}