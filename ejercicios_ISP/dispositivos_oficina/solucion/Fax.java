package ejercicios_ISP.dispositivos_oficina.solucion;

public class Fax implements Faxeable {
    @Override
    public void enviarFax(String numero) {
        System.out.println("Enviando fax a: " + numero);
    }
}