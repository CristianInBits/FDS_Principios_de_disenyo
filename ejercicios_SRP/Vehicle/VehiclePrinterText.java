package ejercicios_SRP.Vehicle;

// Impresión en consola
public class VehiclePrinterText implements VehiclePrinter {
    public void print(Vehicle vehicle) {
        System.out.println(vehicle.toString());
    }
}