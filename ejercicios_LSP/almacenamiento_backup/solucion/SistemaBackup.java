package ejercicios_LSP.almacenamiento_backup.solucion;

public class SistemaBackup {
    public void realizarBackup(Almacenable destino, String archivo) {
        destino.guardar(archivo);
    }
}
