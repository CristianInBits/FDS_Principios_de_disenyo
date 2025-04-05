package calculadora.calculadora_interfaces;

public class Calculadora {

    public int calcular(int a, int b, Operacion operacion){
        return operacion.operar(a, b);
    }
}
