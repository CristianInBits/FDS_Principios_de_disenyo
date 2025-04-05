package ejercicios_LSP.almacenamiento_backup.codigo_problematico;

public class SistemaBackUp {
    public void realizarBackup(Almacenamiento destino, String archivo) {
        destino.guardar(archivo);
    }
}
