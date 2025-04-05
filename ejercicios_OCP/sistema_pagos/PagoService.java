package ejercicios_OCP.sistema_pagos;

public class PagoService {
    public void procesarPago(MetodoPago metodo, double cantidad) {
        metodo.pagar(cantidad); // polimorfismo en acción
    }
}