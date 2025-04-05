package ejercicios_OCP.sistema_pagos;

public class PagoConPaypal implements MetodoPago {

    @Override
    public void pagar(double cantidad) {
        System.out.println("Pagando " + cantidad + " con PayPal.");
    }
}