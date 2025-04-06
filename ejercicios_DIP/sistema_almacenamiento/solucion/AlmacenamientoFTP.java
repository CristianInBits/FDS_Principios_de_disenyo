package ejercicios_DIP.sistema_almacenamiento.solucion;

public class AlmacenamientoFTP implements Almacenamiento {
    @Override
    public void guardar(String nombreArchivo, String contenido) {
        System.out.println("Guardado por FTP: " + nombreArchivo);
    }
}