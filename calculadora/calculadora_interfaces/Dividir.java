package calculadora.calculadora_interfaces;

public class Dividir implements Operacion {

    @Override
    public int operar(int a, int b) {
        if (b == 0) {
            throw new IllegalArgumentException("No se puede dividir entre cero");
        }
        return a / b;
    }
}
