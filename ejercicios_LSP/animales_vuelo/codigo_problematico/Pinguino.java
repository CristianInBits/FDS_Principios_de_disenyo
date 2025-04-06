package ejercicios_LSP.animales_vuelo.codigo_problematico;

public class Pinguino extends Ave {
    @Override
    public void volar() {
        throw new UnsupportedOperationException("¡Los pingüinos no pueden volar!");
    }
}