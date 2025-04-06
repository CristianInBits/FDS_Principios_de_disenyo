package ejercicios_DIP.sistema_notificaciones.solucion;

public class Main {
    public static void main(String[] args) {
        ServicioNotificacion email = new EmailService();
        ServicioNotificacion sms = new SMSService();
        ServicioNotificacion push = new PushService();

        Notificador notificador1 = new Notificador(email);
        Notificador notificador2 = new Notificador(sms);
        Notificador notificador3 = new Notificador(push);

        notificador1.notificar("Tu pedido ha sido enviado");
        notificador2.notificar("Tu código de verificación es 1234");
        notificador3.notificar("Tienes una nueva alerta");
    }
}