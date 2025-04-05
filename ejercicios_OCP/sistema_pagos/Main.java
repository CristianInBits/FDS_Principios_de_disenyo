package ejercicios_OCP.sistema_pagos;

public class Main {
    public static void main(String[] args) {
        PagoService servicio = new PagoService();

        MetodoPago tarjeta = new PagoConTarjeta();
        MetodoPago paypal = new PagoConPaypal();

        servicio.procesarPago(tarjeta, 150.0);
        servicio.procesarPago(paypal, 80.0);
    }
}