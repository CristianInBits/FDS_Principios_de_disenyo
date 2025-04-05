package ejercicios_LSP.rectangulo_cuadrado;

public class Rectangulo {
    private double ancho, alto;

    public Rectangulo(double alto, double ancho) {
        this.alto = alto;
        this.ancho = ancho;
    }

    public double getAlto() {
        return alto;
    }

    public double getAncho() {
        return ancho;
    }

    public void setAlto(double nuevoAlto) {
        this.alto = nuevoAlto;
    }

    public void setAncho(double nuevoAncho) {
        this.ancho = nuevoAncho;
    }
}