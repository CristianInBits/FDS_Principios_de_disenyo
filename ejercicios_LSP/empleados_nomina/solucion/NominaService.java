package ejercicios_LSP.empleados_nomina.solucion;

public class NominaService {
    public void imprimirNomina(Nominable empleado) {
        System.out.println("Nómina mensual: " + empleado.calcularNominaMensual());
    }
}
