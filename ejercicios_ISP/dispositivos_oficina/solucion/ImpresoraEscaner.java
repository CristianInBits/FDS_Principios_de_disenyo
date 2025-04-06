package ejercicios_ISP.dispositivos_oficina.solucion;

public class ImpresoraEscaner implements Imprimible, Escaneable {
    @Override
    public void imprimir(String doc) {
        System.out.println("Imprimiendo...");
    }

    @Override
    public void escanear() {
        System.out.println("Escaneando...");
    }
}