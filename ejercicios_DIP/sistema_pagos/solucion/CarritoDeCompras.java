package ejercicios_DIP.sistema_pagos.solucion;

public class CarritoDeCompras {
    private MetodoPago metodo;

    public CarritoDeCompras(MetodoPago metodo) {
        this.metodo = metodo;
    }

    public void pagar(double total) {
        metodo.realizarPago(total);
    }
}