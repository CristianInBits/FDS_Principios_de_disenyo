package ejercicios_DIP.sistema_notificaciones.solucion;

public class SMSService implements ServicioNotificacion {
    @Override
    public void enviar(String mensaje) {
        System.out.println("Enviando por SMS: " + mensaje);
    }
}