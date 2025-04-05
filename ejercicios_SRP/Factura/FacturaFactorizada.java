package ejercicios_SRP.Factura;

public class FacturaFactorizada {
    private String codigo;
    private double importeFactura;
    private double importeIVA;
    private double importeDescuento;
    private double importeTotal;
    private double porcentajeDescuento;

    // Getters y setters para todos los atributos...

    public void calcularTotal() {
        // Calcular descuento
        Descuento descuento = new Descuento();
        descuento.setDescuento(porcentajeDescuento);
        importeDescuento = descuento.calcularDescuento(importeFactura);

        // Calcular IVA
        IvaNormal iva = new IvaNormal();
        importeIVA = iva.calcularIVA(importeFactura);

        // Calcular total
        importeTotal = importeFactura - importeDescuento + importeIVA;
    }
}