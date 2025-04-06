package ejercicios_DIP.sistema_notificaciones.solucion;

public class PushService implements ServicioNotificacion {
    @Override
    public void enviar(String mensaje) {
        System.out.println("Enviando PUSH: " + mensaje);
    }
}