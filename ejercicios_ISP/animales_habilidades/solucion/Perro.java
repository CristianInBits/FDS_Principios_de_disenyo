package ejercicios_ISP.animales_habilidades.solucion;

public class Perro implements Caminable, Entrenable {
    public void caminar() {
        System.out.println("El perro camina.");
    }

    public void entrenar() {
        System.out.println("El perro aprende trucos.");
    }
}