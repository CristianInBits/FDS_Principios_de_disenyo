package ejercicios_DIP.sistema_almacenamiento.solucion;

public class Main {
    public static void main(String[] args) {
        Almacenamiento local = new AlmacenamientoLocal();
        Almacenamiento cloud = new AlmacenamientoCloud();
        Almacenamiento ftp = new AlmacenamientoFTP();

        GestorDocumentos gestor1 = new GestorDocumentos(local);
        GestorDocumentos gestor2 = new GestorDocumentos(cloud);
        GestorDocumentos gestor3 = new GestorDocumentos(ftp);

        gestor1.guardar("documento.txt", "contenido A");
        gestor2.guardar("reporte.pdf", "contenido B");
        gestor3.guardar("imagen.png", "contenido C");
    }
}