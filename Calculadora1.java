public class Calculadora1 {
    public int sumar(int a, int b) {
        return a + b;
    }

    public int restar(int a, int b) {
        return a - b;
    }

    public int multiplicar(int a, int b) {
        return a * b;
    }

    public int dividir(int a, int b) {
        if (b == 0) {
            throw new IllegalArgumentException("No se puede dividir entre cero");
        }
        return a / b;
    }

    public int calcular(int num1, int num2, char op) {
        switch (op) {
            case 'S':
                return sumar(num1, num2);
            case 'R':
                return restar(num1, num2);
            case 'M':
                return multiplicar(num1, num2);
            case 'D':
                return dividir(num1, num2);
            default:
                throw new IllegalArgumentException("Operación no válida");
        }
    }
}