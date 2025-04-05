package ejercicios_LSP.empleados_nomina.codigo_problematico;

public class EmpleadoFreelance extends Empleado {
    private int horasTrabajadas;
    private double tarifaHora;

    public EmpleadoFreelance(String nombre, int horas, int tarifa) {
        this.horasTrabajadas = horasTrabajadas;
        this.tarifaHora = tarifaHora;
    }

    // No implementa getSalarioMensual()
}
