package ejercicios_LSP.almacenamiento_backup.solucion;

public class Main {

    public static void main(String[] args) {

        SistemaBackup backup = new SistemaBackup();

        Almacenable local = new AlmacenamientoLocal();
        Almacenable nube = new AlmacenamientoNube();

        backup.realizarBackup(local, "documento1.txt");
        backup.realizarBackup(nube, "foto.png");

        // AlmacenamientoSoloLectura lectura = new AlmacenamientoSoloLectura();
        // backup.realizarBackup(lectura, "no_deberia.txt"); ❌ Esto ya no compila →
        // ¡Perfecto!
    }
}
