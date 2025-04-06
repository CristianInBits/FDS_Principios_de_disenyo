package ejercicios_ISP.roles_usuario.solucion;

public class UsuarioEditor implements Editor, Lector {
    @Override
    public void editar() {
        System.out.println("Editando contenido...");
    }

    @Override
    public void leer() {
        System.out.println("Leyendo contenido...");
    }
}