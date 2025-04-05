package ejercicios_SRP.Vehicle;

public class Main {

    public static void main(String[] args) {
        Vehicle vehicle = new Vehicle();

        VehiclePrinter printer = new VehiclePrinterText();
        printer.print(vehicle);

        VehiclePrinter printerGUI = new VehiclePrinterGraphic();
        printerGUI.print(vehicle);
    }

}
