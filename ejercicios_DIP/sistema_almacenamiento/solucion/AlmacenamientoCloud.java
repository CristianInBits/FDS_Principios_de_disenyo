package ejercicios_DIP.sistema_almacenamiento.solucion;

public class AlmacenamientoCloud implements Almacenamiento {
    @Override
    public void guardar(String nombreArchivo, String contenido) {
        System.out.println("Guardado en la NUBE: " + nombreArchivo);
    }
}