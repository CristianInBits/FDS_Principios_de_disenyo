package ejercicios_OCP.sistema_notificaciones;

public class NotificadorSMS implements Notificador {
    @Override
    public void enviar(String mensaje) {
        System.out.println("SMS enviado: " + mensaje);
    }
}