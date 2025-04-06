package ejercicios_ISP.animales_habilidades.solucion;

public class Main {
    public static void main(String[] args) {
        Entrenador entrenador = new Entrenador();
        ExhibicionAerea aerea = new ExhibicionAerea();
        ExhibicionAcuatica acuatica = new ExhibicionAcuatica();

        Perro perro = new Perro();
        Aguila aguila = new Aguila();
        Pez pez = new Pez();
        Tortuga tortuga = new Tortuga();

        entrenador.entrenar(perro); // ✅
        aerea.mostrarVuelo(aguila); // ✅
        acuatica.mostrarNado(pez); // ✅
        acuatica.mostrarNado(tortuga); // ✅

        // entrenador.entrenar(pez); // ❌ No compila, ¡perfecto!
    }
}