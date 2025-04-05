package ejercicios_LSP.empleados_nomina.codigo_problematico;

public class EmpleadoFijo extends Empleado {
    private double salarioMensual;

    public EmpleadoFijo(String nombre, double salarioMensual) {
        this.salarioMensual = salarioMensual;
    }

    @Override
    public double getSalarioMensual() {
        return salarioMensual;
    }
}
