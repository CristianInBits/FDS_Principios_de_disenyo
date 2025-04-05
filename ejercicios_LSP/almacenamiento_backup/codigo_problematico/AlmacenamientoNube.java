package ejercicios_LSP.almacenamiento_backup.codigo_problematico;

public class AlmacenamientoNube extends Almacenamiento {
    @Override
    public void guardar(String archivo) {
        System.out.println("Archivo subido a la nube: " + archivo);
    }
}
