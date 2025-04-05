package ejercicios_LSP.vehiculos_energia.solucion;

public class CocheGasolina implements Conducible, Repostable {
    public void conducir() {
        System.out.println("Conduciendo coche de gasolina...");
    }

    public void repostar() {
        System.out.println("Repostando combustible...");
    }
}
