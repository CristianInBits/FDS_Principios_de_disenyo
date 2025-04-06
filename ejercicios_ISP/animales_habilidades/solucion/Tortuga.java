package ejercicios_ISP.animales_habilidades.solucion;

public class Tortuga implements Caminable, Nadador {
    public void caminar() {
        System.out.println("La tortuga camina lentamente.");
    }

    public void nadar() {
        System.out.println("La tortuga también nada.");
    }
}