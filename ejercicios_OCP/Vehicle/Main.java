package ejercicios_OCP.Vehicle;

public class Main {
    public static void main(String[] args) {
        Vehicle vehicle = new Vehicle(); // objeto que implementa Imprimible
        Printer printer = new Printer(); // cliente que trabaja con la interfaz

        printer.print(vehicle); // Salida: wheelCount=4, maxSpeed=200
    }
}