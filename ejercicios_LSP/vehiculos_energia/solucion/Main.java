package ejercicios_LSP.vehiculos_energia.solucion;

public class Main {
    public static void main(String[] args) {

        CocheGasolina coche1 = new CocheGasolina();
        CocheElectrico coche2 = new CocheElectrico();

        coche1.conducir();
        coche2.conducir();

        EstacionServicio gasolinera = new EstacionServicio();
        gasolinera.suministrarCombustible(coche1);

        // gasolinera.suministrarCombustible(coche2); ❌ Esto no compila = ¡seguro!

    }
}
