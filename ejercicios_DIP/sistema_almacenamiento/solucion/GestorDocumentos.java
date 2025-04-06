package ejercicios_DIP.sistema_almacenamiento.solucion;

public class GestorDocumentos {
    private Almacenamiento almacenamiento;

    public GestorDocumentos(Almacenamiento almacenamiento) {
        this.almacenamiento = almacenamiento;
    }

    public void guardar(String nombre, String contenido) {
        almacenamiento.guardar(nombre, contenido);
    }
}