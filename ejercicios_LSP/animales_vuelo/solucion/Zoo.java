package ejercicios_LSP.animales_vuelo.solucion;

public class Zoo {
    public void hacerCaminar(Caminable animal) {
        animal.caminar();
    }

    public void hacerVolar(Volable animal) {
        animal.volar();
    }
}