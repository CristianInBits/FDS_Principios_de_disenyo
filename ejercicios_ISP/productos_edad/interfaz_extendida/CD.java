package ejercicios_ISP.productos_edad.interfaz_extendida;

import java.time.LocalDateTime;

public class CD implements Product {
    private String name;
    private int stock;
    private LocalDateTime releaseDate;

    public CD(String name, int stock, LocalDateTime releaseDate) {
        this.name = name;
        this.stock = stock;
        this.releaseDate = releaseDate;
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
}
