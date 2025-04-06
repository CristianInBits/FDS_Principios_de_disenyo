package ejercicios_ISP.dispositivos_oficina.solucion;

public class ImpresoraSimple implements Imprimible {
    @Override
    public void imprimir(String doc) {
        System.out.println("Imprimiendo documento: " + doc);
    }
}