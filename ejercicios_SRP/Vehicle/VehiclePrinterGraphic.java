package ejercicios_SRP.Vehicle;

// Impresión gráfica (por ejemplo con Swing)
import javax.swing.JOptionPane;

public class VehiclePrinterGraphic implements VehiclePrinter {
    public void print(Vehicle vehicle) {
        JOptionPane.showMessageDialog(null, vehicle.toString());
    }
}