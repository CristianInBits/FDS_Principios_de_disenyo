package ejercicios_LSP.almacenamiento_backup.solucion;

public class AlmacenamientoNube implements Almacenable {
    public void guardar(String archivo) {
        System.out.println("Archivo subido a la nube: " + archivo);
    }
}
