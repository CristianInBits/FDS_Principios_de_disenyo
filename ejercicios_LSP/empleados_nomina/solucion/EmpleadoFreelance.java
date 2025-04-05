package ejercicios_LSP.empleados_nomina.solucion;

public class EmpleadoFreelance extends Empleado {
    private int horasTrabajadas;
    private double tarifaHora;

    public EmpleadoFreelance(String nombre, int horas, double tarifa) {
        super(nombre);
        this.horasTrabajadas = horas;
        this.tarifaHora = tarifa;
    }

    public double calcularPagoTotal() {
        return horasTrabajadas * tarifaHora;
    }
}
