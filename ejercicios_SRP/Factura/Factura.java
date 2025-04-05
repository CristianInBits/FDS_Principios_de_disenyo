package ejercicios_SRP.Factura;

public class Factura {
    private String codigo;
    private double importeFactura;
    private double importeIVA;
    private double porcentajeDescuento;
    private double importeDescuento;
    private double importeTotal;

    // Getters y setters para todos los atributos...

    // Método que calcula el total de la factura
    public void calcularTotal() {
        // Calculamos el descuento
        importeDescuento = (importeFactura * porcentajeDescuento) / 100;

        // Calculamos el IVA
        importeIVA = importeFactura * 0.16;

        // Calculamos el total
        importeTotal = importeFactura - importeDescuento + importeIVA;
    }
}