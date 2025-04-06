package ejercicios_ISP.dispositivos_oficina.solucion;

public class Main {
    public static void main(String[] args) {
        Imprimible impresora = new ImpresoraSimple();
        Escaneable escaner = new ImpresoraEscaner();
        Faxeable fax = new Fax();

        impresora.imprimir("Contrato.pdf");

        if (escaner instanceof Escaneable) {
            escaner.escanear();
        }

        fax.enviarFax("123456789");
    }
}