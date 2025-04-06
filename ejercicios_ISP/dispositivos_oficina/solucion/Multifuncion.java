package ejercicios_ISP.dispositivos_oficina.solucion;

public class Multifuncion implements Imprimible, Escaneable, Faxeable {
    public void imprimir(String doc) {
        System.out.println("Impresión multifunción: " + doc);
    }

    public void escanear() {
        System.out.println("Escaneo multifunción");
    }

    public void enviarFax(String numero) {
        System.out.println("Fax enviado a: " + numero);
    }
}