package ejercicios_ISP.dispositivos_oficina.codigo_problematico;

public interface DispositivoOficina {

    void imprimir(String doc);

    void escanear();

    void enviarFax(String numero);
}