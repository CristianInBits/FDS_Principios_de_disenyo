package ejercicios_ISP.productos_edad.interfaz_extendida;

import java.time.LocalDateTime;

public interface Product {
    String getName();

    int getStock();

    LocalDateTime getReleaseDate();
}