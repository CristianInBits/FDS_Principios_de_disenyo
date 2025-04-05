package ejercicios_OCP.sistema_notificaciones;

public class NotificadorWhatsApp implements Notificador {
    @Override
    public void enviar(String mensaje) {
        System.out.println("WhatsApp enviado: " + mensaje);
    }
}