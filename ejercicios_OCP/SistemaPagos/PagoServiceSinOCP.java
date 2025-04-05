package ejercicios_OCP.SistemaPagos;

public class PagoServiceSinOCP {
    public void procesarPago(String metodo, double cantidad) {
        if (metodo.equals("tarjeta")) {
            System.out.println("Pagando con tarjeta: " + cantidad);
        } else if (metodo.equals("paypal")) {
            System.out.println("Pagando con PayPal: " + cantidad);
        }
        // ¡Si queremos añadir Bitcoin tenemos que modificar esta clase!
    }
}