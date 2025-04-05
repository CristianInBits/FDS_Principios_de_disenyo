package ejercicios_SRP.UsuarioService;

public class EmailService {
    public void enviarEmail(String destinatario, String mensaje) {
        System.out.println("Enviando email a " + destinatario + ": " + mensaje);
    }
}