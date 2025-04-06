package ejercicios_DIP.sistema_notificaciones.solucion;

public class Notificador {
    private ServicioNotificacion servicio;

    public Notificador(ServicioNotificacion servicio) {
        this.servicio = servicio;
    }

    public void notificar(String mensaje) {
        servicio.enviar(mensaje);
    }
}
