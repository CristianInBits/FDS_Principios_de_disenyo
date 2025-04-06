package ejercicios_LSP.animales_vuelo.solucion;

public class Pato implements Caminable, Volable {
    @Override
    public void caminar() {
        System.out.println("El pato camina.");
    }

    @Override
    public void volar() {
        System.out.println("El pato vuela.");
    }
}