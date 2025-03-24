package calculadora_interfaces;

public class Main {

    public static void main(String[] args) {

        Calculadora calculadora = new Calculadora();

        Operacion suma = new Sumar();
        Operacion resta = new Restar();
        Operacion multiplicar = new Multiplicar();
        Operacion dividir = new Dividir();

        System.out.println("Suma : " + calculadora.calcular(2, 4, suma));
        System.out.println("Resta : " + calculadora.calcular(10, 4, resta));
        System.out.println("Multiplicar : " + calculadora.calcular(3, 3, multiplicar));
        System.out.println("Dividir : " + calculadora.calcular(10, 2, dividir));
        System.out.println("Dividir2 : " + calculadora.calcular(10, 0, dividir));
    }
}
