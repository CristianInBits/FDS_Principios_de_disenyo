package ejercicios_DIP.sistema_almacenamiento.solucion;

public class AlmacenamientoLocal implements Almacenamiento {
    @Override
    public void guardar(String nombreArchivo, String contenido) {
        System.out.println("Guardado LOCAL: " + nombreArchivo);
    }
}