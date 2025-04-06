package ejercicios_DIP.sistema_pagos.solucion;

public class Main {
    public static void main(String[] args) {
        MetodoPago tarjeta = new PagoTarjeta();
        MetodoPago paypal = new PagoPayPal();
        MetodoPago transferencia = new PagoTransferencia();

        CarritoDeCompras carrito1 = new CarritoDeCompras(tarjeta);
        CarritoDeCompras carrito2 = new CarritoDeCompras(paypal);
        CarritoDeCompras carrito3 = new CarritoDeCompras(transferencia);

        carrito1.pagar(49.99);
        carrito2.pagar(79.50);
        carrito3.pagar(120.00);
    }
}