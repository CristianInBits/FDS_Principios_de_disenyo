package calculadora_interfaces;

public class Sumar implements Operacion {
    
    @Override
    public int operar(int a, int b){
        return a + b;
    }
}
