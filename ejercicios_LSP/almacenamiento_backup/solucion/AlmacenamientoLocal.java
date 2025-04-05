package ejercicios_LSP.almacenamiento_backup.solucion;

public class AlmacenamientoLocal implements Almacenable {
    public void guardar(String archivo) {
        System.out.println("Archivo guardado localmente: " + archivo);
    }
}
