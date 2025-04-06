package ejercicios_LSP.animales_vuelo.solucion;

public class Main {
    public static void main(String[] args) {
        Zoo zoo = new Zoo();

        Pato pato = new Pato();
        Caminable pinguino = new Pinguino();
        Caminable avestruz = new Avestruz();

        zoo.hacerCaminar(pato);
        zoo.hacerCaminar(pinguino);
        zoo.hacerCaminar(avestruz);

        zoo.hacerVolar(pato);

        // zoo.hacerVolar(pinguino); // ❌ No compila: el pingüino no implementa Volable = perfecto
    }
}
