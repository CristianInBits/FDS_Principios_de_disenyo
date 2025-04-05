# 🔁 Ejercicios de Principio de Sustitución de Liskov (LSP) - SOLID

Este directorio contiene ejemplos prácticos que ilustran el **Principio de Sustitución de Liskov**, uno de los principios SOLID fundamentales para un diseño orientado a objetos robusto y mantenible.

> Si una clase `S` es un subtipo de `T`, entonces los objetos de tipo `T` pueden ser reemplazados por objetos de tipo `S` sin alterar el comportamiento esperado del programa.

---

## 🧪 Ejercicios incluidos

### 1. `Rectangulo y Cuadrado` – Herencia inapropiada
- Se demuestra cómo un diseño basado en herencia puede **romper el LSP** cuando una subclase no respeta el comportamiento esperado por la superclase.
- El método `cambiaAspecto()` espera modificar ancho sin afectar el alto, pero `Cuadrado` sobrescribe estos métodos rompiendo esa expectativa.
- Se propone una solución separando responsabilidades y rompiendo la herencia.

📁 Carpeta: `rectangulo_cuadrado/`

---

### 2. `Vehículos e Impuestos` – Precondiciones más fuertes
- `Impuestos.calcularImpuesto(Vehiculo)` fuerza un `cast` a `Coche`, asumiendo que todos los vehículos tienen matrícula, lo cual **viola LSP**.
- Se corrige con una interfaz `Matriculable`, implementada solo por los vehículos que realmente tienen matrícula (`Coche`, `Camion`).
- El método cliente ahora trabaja con un contrato claro y respetando la jerarquía.

📁 Carpeta: `vehiculos_impuestos/`

---

### 3. `Empleados y Nómina` – Separación de capacidades
- `EmpleadoFijo` y `EmpleadoFreelance` representan modelos distintos de pago.
- La versión incorrecta rompe LSP al asumir que todos los empleados devuelven un salario mensual.
- Se soluciona con una interfaz `Nomineable`, implementada solo por quienes generan nómina mensual, y se desacopla el servicio de cálculo del tipo base `Empleado`.

📁 Carpeta: `empleados_nomina/`


## 🧠 Claves del principio:

- Las subclases **no deben restringir más** que la clase base (precondiciones).
- Las subclases deben **mantener o fortalecer** las garantías de la clase base (postcondiciones).
- No deben lanzar nuevas excepciones ni reducir la visibilidad de métodos sobrescritos.
- El comportamiento observable debe ser coherente desde la perspectiva del cliente.

---

✅ **Autor**: Cristian Laurentiu Sindila
🗓 **Fecha**: Abril 2025