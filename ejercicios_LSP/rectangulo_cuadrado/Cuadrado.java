package ejercicios_LSP.rectangulo_cuadrado;

public class Cuadrado {
    private double lado;

    public Cuadrado(double lado) {
        this.lado = lado;
    }

    public double getLado() {
        return lado;
    }

    public void setLado(double nuevoLado) {
        this.lado = nuevoLado;
    }
}