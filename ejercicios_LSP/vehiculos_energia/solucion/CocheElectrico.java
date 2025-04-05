package ejercicios_LSP.vehiculos_energia.solucion;

public class CocheElectrico implements Conducible {
    public void conducir() {
        System.out.println("Conduciendo coche eléctrico...");
    }

    public void recargarBateria() {
        System.out.println("Recargando batería...");
    }
}
