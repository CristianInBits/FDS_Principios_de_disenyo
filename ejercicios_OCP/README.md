# 🧱 Ejercicios de Principio Abierto-Cerrado (OCP) - SOLID

Este repositorio contiene varios ejemplos prácticos que aplican el **Principio Abierto-Cerrado (Open/Closed Principle)** de los principios SOLID.  
**Una clase debe estar abierta para la extensión pero cerrada para la modificación.**

---

## 🧪 Ejercicios incluidos

### 1. `Shapes` – Calculadora de áreas polimórfica
- Uso de una clase abstracta `Shape` con subclases como `Rectangle`, `Circle` y `Triangle`.
- La clase `AreaCalculator` calcula el área total sin necesidad de modificarse al añadir nuevas figuras.
- Demuestra herencia y polimorfismo para aplicar OCP.

📁 Carpeta: `shapes/`

---

### 2. `SistemaPagos` – Procesamiento de pagos con diferentes métodos
- Define una interfaz `MetodoPago` y clases como `PagoConTarjeta` y `PagoConPaypal`.
- `PagoService` se mantiene inmutable ante la inclusión de nuevos métodos de pago.
- Ejemplo práctico del uso de OCP en lógica de negocio.

📁 Carpeta: `sistema_pagos/`

---

### 3. `Vehicle` – Impresión genérica de objetos
- Se crea una interfaz `Imprimible` implementada por `Vehicle`.
- La clase `Printer` puede imprimir cualquier objeto `Imprimible` sin depender de clases concretas.
- Ejemplo simple para introducir interfaces y separación cliente/servidor.

📁 Carpeta: `vehicle/`

---

### 4. `SistemaNotificaciones` – Envío de mensajes por distintos canales
- Interfaz `Notificador` con implementaciones para `Email`, `SMS`, `WhatsApp`, etc.
- `NotificationService` puede notificar sin ser modificado al agregar nuevos canales.
- Ideal para comprender OCP junto a principios de diseño desacoplado.

📁 Carpeta: `sistema_notificaciones/`

---

## 🛠 Recomendaciones

- Puedes extender cualquiera de los ejercicios agregando nuevas clases (ej. nuevas figuras, nuevos métodos de pago o notificación).
- El código cliente **no debe cambiar** al agregar nuevas implementaciones: así sabrás que estás aplicando correctamente OCP.

---

## 📚 Recursos

- [Principios SOLID explicados](https://es.wikipedia.org/wiki/SOLID)
- [Open/Closed Principle - Wikipedia (en inglés)](https://en.wikipedia.org/wiki/Open%E2%80%93closed_principle)

---

✅ **Autor**: Cristian Laurentiu Sindila 
🗓 **Fecha**: Abril 2025
