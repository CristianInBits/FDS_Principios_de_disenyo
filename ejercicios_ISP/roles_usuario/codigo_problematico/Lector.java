package ejercicios_ISP.roles_usuario.codigo_problematico;

public class Lector implements Usuario {
    public void crear() {
        throw new UnsupportedOperationException("No puede crear");
    }

    public void editar() {
        throw new UnsupportedOperationException("No puede editar");
    }

    public void eliminar() {
        throw new UnsupportedOperationException("No puede eliminar");
    }

    public void leer() {
        System.out.println("Leyendo contenido...");
    }
}