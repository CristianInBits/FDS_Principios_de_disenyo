package ejercicios_ISP.animales_habilidades.codigo_problematico;

public class Pez implements Animal {
    public void caminar() {
        throw new UnsupportedOperationException();
    }

    public void volar() {
        throw new UnsupportedOperationException();
    }

    public void nadar() {
        System.out.println("El pez nada.");
    }

    public void entrenar() {
        throw new UnsupportedOperationException();
    }
}