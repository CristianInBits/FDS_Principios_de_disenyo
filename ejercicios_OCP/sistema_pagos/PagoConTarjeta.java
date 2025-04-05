package ejercicios_OCP.sistema_pagos;

public class PagoConTarjeta implements MetodoPago {
    @Override
    public void pagar(double cantidad) {
        System.out.println("Pagando " + cantidad + " con tarjeta de crédito.");
    }
}