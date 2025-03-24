package calculadora_sin_interfaces;

public class Calculadora {

    public int calcular(int num1, int num2, char op) {
        switch (op) {
            case 'S':
                Sumar suma = new Sumar();
                return suma.operar(num1, num2);
            case 'R':
                Restar resta = new Restar();
                return resta.operar(num1, num2);
            case 'M':
                Multiplicar multiplicacion = new Multiplicar();
                return multiplicacion.operar(num1, num2);
            case 'D':
                Dividir division = new Dividir();
                return division.operar(num1, num2);
            default:
                throw new IllegalArgumentException("Operación no válida");
        }
    }
}
