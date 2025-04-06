package ejercicios_ISP.roles_usuario.solucion;

public class Admin implements Creador, Editor, Eliminador, Lector {
    @Override
    public void crear() {
        System.out.println("Creando contenido...");
    }

    @Override
    public void editar() {
        System.out.println("Editando contenido...");
    }

    @Override
    public void eliminar() {
        System.out.println("Eliminando contenido...");
    }

    @Override
    public void leer() {
        System.out.println("Leyendo contenido...");
    }
}