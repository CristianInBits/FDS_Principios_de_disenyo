package ejercicios_LSP.empleados_nomina.solucion;

public class EmpleadoFijo extends Empleado implements Nominable {
    private double salarioMensual;

    public EmpleadoFijo(String nombre, double salarioMensual) {
        super(nombre);
        this.salarioMensual = salarioMensual;
    }

    @Override
    public double calcularNominaMensual() {
        return salarioMensual;
    }

}
