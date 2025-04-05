package ejercicios_LSP.empleados_nomina.solucion;

public class Main {
    public static void main(String[] args) {

        EmpleadoFijo empleadoFijo = new EmpleadoFijo("Ana", 2000);
        EmpleadoFreelance empleadoFreelance = new EmpleadoFreelance("Luis", 80, 25);

        NominaService servicio = new NominaService();
        servicio.imprimirNomina(empleadoFijo);

        System.out.println("Pago freelance: " + empleadoFreelance.calcularPagoTotal());
    }
}