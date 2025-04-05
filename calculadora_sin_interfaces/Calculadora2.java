package calculadora_sin_interfaces;

public class Calculadora2 {
    private Suma suma;
    private Resta resta;
    private Multiplicacion multiplica;
    private Division divide;

    public int calcular(int num1, int num2, char op) {
        suma = new Suma();
        resta = new Resta();
        multiplica = new Multiplicacion();
        divide = new Division();
        switch (op) {
            case 'S':
                return suma.sumar(num1, num2);
            case 'R':
                return resta.restar(num1, num2);
            case 'M':
                return multiplica.multiplicar(num1, num2);
            case 'D':
                return divide.dividir(num1, num2);
            default:
                throw new IllegalArgumentException("Operación no válida");
        }
    }
}