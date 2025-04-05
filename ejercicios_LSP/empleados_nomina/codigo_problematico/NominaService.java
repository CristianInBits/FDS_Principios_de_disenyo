package ejercicios_LSP.empleados_nomina.codigo_problematico;

public class NominaService {
    public void imprimirNomina(Empleado empleado) {
        System.out.println("Salario mensual: " + empleado.getSalarioMensual());
    }
}
