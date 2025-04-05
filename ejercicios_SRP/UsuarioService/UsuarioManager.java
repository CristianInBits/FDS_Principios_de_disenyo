package ejercicios_SRP.UsuarioService;

public class UsuarioManager {
    private Autenticador autenticador = new Autenticador();
    private LoggerService logger = new LoggerService();
    private EmailService emailService = new EmailService();

    public void login(String username, String password) {
        if (autenticador.autenticar(username, password)) {
            logger.registrarLog("Usuario autenticado correctamente: " + username);
            emailService.enviarEmail(username, "Has iniciado sesión con éxito.");
        } else {
            logger.registrarLog("Fallo de autenticación para usuario: " + username);
        }
    }
}