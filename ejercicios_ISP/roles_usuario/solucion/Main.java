package ejercicios_ISP.roles_usuario.solucion;

public class Main {
    public static void main(String[] args) {
        Lector lector = new UsuarioLector();
        Editor editor = new UsuarioEditor();
        Creador admin = new Admin();

        lector.leer();
        editor.editar();
        ((Lector) editor).leer(); // ⚠️ Cast seguro porque implementa ambas
        admin.crear();

        // admin.editar(); ❌ No visible directamente porque tipo es Creador
    }
}