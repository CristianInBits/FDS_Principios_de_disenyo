package ejercicios_ISP.animales_habilidades.solucion;

public class Aguila implements Caminable, Volador {
    public void caminar() {
        System.out.println("El águila camina torpemente.");
    }

    public void volar() {
        System.out.println("El águila vuela majestuosamente.");
    }
}