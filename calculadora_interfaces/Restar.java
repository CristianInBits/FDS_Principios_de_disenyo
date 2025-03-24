package calculadora_interfaces;

public class Restar implements Operacion{
    
    @Override
    public int operar(int a, int b){
        return a - b;
    }
}
