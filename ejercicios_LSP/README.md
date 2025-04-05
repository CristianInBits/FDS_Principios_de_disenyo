# 🔁 Ejercicios de Principio de Sustitución de Liskov (LSP) - SOLID

Este directorio contiene ejemplos prácticos que ilustran el **Principio de Sustitución de Liskov**, uno de los pilares de SOLID en la programación orientada a objetos.

> Si una clase `S` es un subtipo de `T`, entonces los objetos de tipo `T` pueden ser reemplazados por objetos de tipo `S` **sin alterar el comportamiento esperado del programa**.

---

## 📂 Ejercicios incluidos

### 1. `Rectangulo y Cuadrado` – Violación de LSP al forzar herencia
- Se demuestra cómo una herencia mal aplicada rompe las expectativas del cliente.
- El método `cambiaAspecto()` espera modificar ancho sin afectar el alto, cosa que un `Cuadrado` no permite.
- Se propone una refactorización que rompe la herencia para mantener la integridad del diseño.

📁 Carpeta: `rectangulo_cuadrado/`

---

## 🧠 Claves del principio:

- Las subclases **no deben restringir más que la clase padre** (precondiciones).
- Las subclases deben **cumplir o reforzar las garantías del padre** (postcondiciones).
- No deben lanzarse excepciones nuevas o más generales.
- No deben reducir la visibilidad del método sobrescrito.

---

✅ **Autor**: Cristian Laurentiu Sindila

🗓 **Fecha**: Abril 2025