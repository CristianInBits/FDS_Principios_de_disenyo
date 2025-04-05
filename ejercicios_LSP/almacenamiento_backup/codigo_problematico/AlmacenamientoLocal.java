package ejercicios_LSP.almacenamiento_backup.codigo_problematico;

public class AlmacenamientoLocal extends Almacenamiento {
    @Override
    public void guardar(String archivo) {
        System.out.println("Archivo guardado localmente: " + archivo);
    }
}
