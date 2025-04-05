package ejercicios_SRP.Factura;

public class IvaNormal {
    private final double PORCENTAJE_IVA_NORMAL = 0.16;

    public double getPorcentajeIvaNormal() {
        return PORCENTAJE_IVA_NORMAL;
    }

    public double calcularIVA(double importe) {
        return importe * PORCENTAJE_IVA_NORMAL;
    }
}