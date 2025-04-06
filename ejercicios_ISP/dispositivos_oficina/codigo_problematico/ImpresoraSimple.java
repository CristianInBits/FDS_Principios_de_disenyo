package ejercicios_ISP.dispositivos_oficina.codigo_problematico;

public class ImpresoraSimple implements DispositivoOficina {
    public void imprimir(String doc) {
        System.out.println("Imprimiendo: " + doc);
    }

    public void escanear() {
        throw new UnsupportedOperationException("Este dispositivo no escanea");
    }

    public void enviarFax(String numero) {
        throw new UnsupportedOperationException("Este dispositivo no envía fax");
    }
}