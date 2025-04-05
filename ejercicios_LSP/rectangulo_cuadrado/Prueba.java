package ejercicios_LSP.rectangulo_cuadrado;

public class Prueba {
    public static void main(String[] args) {
        Otra o = new Otra();

        Rectangulo r = new Rectangulo(8, 7);
        o.cambiaAspecto(r);
        System.out.println("Rectángulo: " + r.getAlto() + " x " + r.getAncho()); // Esperado: 8 x 4

        CuadradoSinLSP c = new CuadradoSinLSP(6);
        o.cambiaAspecto(c);
        System.out.println("Cuadrado: " + c.getAlto() + " x " + c.getAncho()); /*
                                                                                * ¡Error! Esperado: 6 x 3 pero ya no es
                                                                                * cuadrado
                                                                                */
    }
}