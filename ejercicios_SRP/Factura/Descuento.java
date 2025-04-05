package ejercicios_SRP.Factura;

public class Descuento {
    private double porcentajeDescuento;

    public void setDescuento(double porcentaje) {
        this.porcentajeDescuento = porcentaje;
    }

    public double calcularDescuento(double importe) {
        return (importe * porcentajeDescuento) / 100;
    }
}