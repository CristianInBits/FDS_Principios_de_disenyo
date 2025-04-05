package ejercicios_OCP.SistemaPagos;

public class PagoService {
    public void procesarPago(MetodoPago metodo, double cantidad) {
        metodo.pagar(cantidad); // polimorfismo en acción
    }
}