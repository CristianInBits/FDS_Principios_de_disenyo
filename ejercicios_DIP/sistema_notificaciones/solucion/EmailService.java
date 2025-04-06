package ejercicios_DIP.sistema_notificaciones.solucion;

public class EmailService implements ServicioNotificacion {
    @Override
    public void enviar(String mensaje) {
        System.out.println("Enviando por EMAIL: " + mensaje);
    }
}