package ejercicios_OCP.sistema_notificaciones;

public class NotificadorEmail implements Notificador {

    @Override
    public void enviar(String mensaje) {
        System.out.println("Email enviado: " + mensaje);
    }
}