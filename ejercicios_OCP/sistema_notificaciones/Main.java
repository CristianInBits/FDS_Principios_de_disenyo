package ejercicios_OCP.sistema_notificaciones;

public class Main {
    public static void main(String[] args) {
        NotificationService servicio = new NotificationService();

        Notificador email = new NotificadorEmail();
        Notificador sms = new NotificadorSMS();

        servicio.notificar(email, "Tu pedido ha sido enviado.");
        servicio.notificar(sms, "Tu código de verificación es 123456.");
    }
}
