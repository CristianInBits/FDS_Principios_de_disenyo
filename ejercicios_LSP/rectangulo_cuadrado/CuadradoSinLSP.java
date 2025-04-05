package ejercicios_LSP.rectangulo_cuadrado;

public class CuadradoSinLSP extends Rectangulo {
    public CuadradoSinLSP(double lado) {
        super(lado, lado);
    }

    @Override
    public void setAlto(double nuevoLado) {
        super.setAlto(nuevoLado);
        super.setAncho(nuevoLado);
    }

    @Override
    public void setAncho(double nuevoLado) {
        super.setAlto(nuevoLado);
        super.setAncho(nuevoLado);
    }
}