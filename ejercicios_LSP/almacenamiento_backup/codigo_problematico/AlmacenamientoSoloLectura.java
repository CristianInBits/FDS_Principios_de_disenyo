package ejercicios_LSP.almacenamiento_backup.codigo_problematico;

public class AlmacenamientoSoloLectura extends Almacenamiento {
    @Override
    public void guardar(String archivo) {
        throw new UnsupportedOperationException("No se puede guardar en modo solo lectura");
    }
}
