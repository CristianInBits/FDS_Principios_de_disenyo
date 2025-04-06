package ejercicios_ISP.productos_edad.interfaz_transversal;

public class CulturaInfantil {
    public void listadoCulturaMenores(AgeAware[] recursos) {
        for (AgeAware r : recursos) {
            if (r.getRecommendedAge() <= 12) {
                System.out.println("Apto para menores: " + r.getClass().getSimpleName());
            }
        }
    }
}