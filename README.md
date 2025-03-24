# 📁 Calculadora SRP - Proyecto Java

Este proyecto muestra **dos implementaciones** distintas del **Principio de Responsabilidad Única (SRP)** aplicadas a una calculadora.

## 🗂️ Estructura del proyecto
```
/src
 └── calculadora_interfaces     // ✅ Versión usando interfaz Operacion y polimorfismo
 └── calculadora_sin_interfaces // ✅ Versión sin interfaz, solo clases específicas
```

## ✅ Versiones incluidas

### 1. `calculadora_interfaces`
- Uso de la interfaz `Operacion` para representar cada operación.
- Aplica **polimorfismo** para simplificar la lógica y cumplir **SRP**.
- Fácil de extender y mantener.

### 2. `calculadora_sin_interfaces`
- Clases separadas (`Sumar`, `Restar`, etc.) sin interfaz común.
- La `Calculadora` instancia directamente cada clase.
- Simplicidad para estructuras pequeñas.

---

📌 **Ambas implementaciones respetan SRP**, pero la versión con interfaces es más flexible y extensible.

---