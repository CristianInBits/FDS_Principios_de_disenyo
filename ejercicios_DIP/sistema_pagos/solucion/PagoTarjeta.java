package ejercicios_DIP.sistema_pagos.solucion;

public class PagoTarjeta implements MetodoPago {
    @Override
    public void realizarPago(double importe) {
        System.out.println("Pago de " + importe + "€ realizado con TARJETA");
    }
}