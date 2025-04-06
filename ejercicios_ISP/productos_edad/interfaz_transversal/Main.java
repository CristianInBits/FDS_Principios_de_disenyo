package ejercicios_ISP.productos_edad.interfaz_transversal;

import java.time.LocalDateTime;

public class Main {
    public static void main(String[] args) {
        AgeAware[] recursos = {
                new Book("Cuentos para niños", 6),
                new TeatroCallejero("Obra familiar", 10),
                new DVD("Película +13", 13, LocalDateTime.now(), 13)
        };

        CulturaInfantil servicio = new CulturaInfantil();
        servicio.listadoCulturaMenores(recursos);
    }
}