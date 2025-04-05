package ejercicios_OCP.sistema_notificaciones;

public class NotificationService {
    public void notificar(Notificador notificador, String mensaje) {
        notificador.enviar(mensaje); // polimorfismo
    }
}
