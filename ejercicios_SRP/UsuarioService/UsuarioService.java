package ejercicios_SRP.UsuarioService;

public class UsuarioService {

    public boolean autenticar(String username, String password) {
        // Lógica de autenticación (muy simplificada)
        return username.equals("admin") && password.equals("1234");
    }

    public void registrarLog(String mensaje) {
        // Escribir en log
        System.out.println("LOG: " + mensaje);
    }

    public void enviarEmail(String destinatario, String mensaje) {
        // Simular envío de email
        System.out.println("Enviando email a " + destinatario + ": " + mensaje);
    }
}