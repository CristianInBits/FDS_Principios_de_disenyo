package ejercicios_OCP.SistemaPagos;

public class PagoConPaypal implements MetodoPago {

    @Override
    public void pagar(double cantidad) {
        System.out.println("Pagando " + cantidad + " con PayPal.");
    }
}