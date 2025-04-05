package calculadora_sin_interfaces;

public class Division {
    public int dividir(int num1, int num2) {
        if (num2 == 0) {
            throw new IllegalArgumentException("No se puede dividir entre cero");
        }
        return num1 / num2;
    }
}
