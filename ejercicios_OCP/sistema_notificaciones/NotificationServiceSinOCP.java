package ejercicios_OCP.sistema_notificaciones;

public class NotificationServiceSinOCP {
    public void notificar(String tipo, String mensaje) {
        if (tipo.equals("email")) {
            System.out.println("Enviando EMAIL: " + mensaje);
        } else if (tipo.equals("sms")) {
            System.out.println("Enviando SMS: " + mensaje);
        }
        // Si añadimos "push" o "whatsapp" tenemos que modificar esta clase 🙄
    }
}