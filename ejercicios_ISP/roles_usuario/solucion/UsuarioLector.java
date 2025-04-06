package ejercicios_ISP.roles_usuario.solucion;

public class UsuarioLector implements Lector {
    @Override
    public void leer() {
        System.out.println("Leyendo contenido...");
    }
}