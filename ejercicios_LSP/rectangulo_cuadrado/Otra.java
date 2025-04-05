package ejercicios_LSP.rectangulo_cuadrado;

public class Otra {
    public void cambiaAspecto(Rectangulo r) {
        r.setAncho(r.getAlto() * 0.5);
    }
}