# 🔄 Ejercicios de Principio de Segregación de la Interfaz (ISP) - SOLID

Este directorio contiene ejemplos prácticos que ilustran el **Principio de Segregación de la Interfaz**, uno de los principios SOLID fundamentales para evitar clases forzadas a implementar funcionalidades que no utilizan.

> “Los clientes no deben estar obligados a depender de interfaces que no usan.”  
> – Robert C. Martin

---

## 🧪 Ejercicios incluidos

---

### 🐕 `Animales con habilidades` – Interfaces específicas por comportamiento
- Se modelan distintos animales (`Perro`, `Águila`, `Pez`, `Tortuga`, `Gato`) con capacidades diversas como caminar, volar, nadar o ser entrenados.
- En la versión inicial se fuerza a todos a implementar una interfaz `Animal` con métodos que muchos no necesitan, lo cual **viola ISP**.
- Se corrige creando interfaces específicas (`Caminable`, `Volador`, `Nadador`, `Entrenable`) que cada clase implementa según sus capacidades reales.
- Se crean clases cliente especializadas (`Entrenador`, `ExhibicionAerea`, `ExhibicionAcuatica`) que trabajan con las interfaces necesarias, respetando el principio.

📁 Carpeta: `animales_habilidades/`

---

### 🚫 `Productos y edad recomendada` – Interfaz innecesariamente grande
- Se parte de una interfaz `Product` que incluye información general y una edad recomendada.
- Se demuestra que clases como `CD` no deberían verse forzadas a implementar métodos como `getRecommendedAge()`, lo cual **viola ISP**.
- Se presenta una primera solución extendiendo la interfaz para `DVD`, y una versión mejor usando una interfaz transversal `AgeAware`, reutilizable por otros objetos como `Book` o `TeatroCallejero`.

📁 Carpeta: `productos_edad/`

---

## 🧠 Claves del principio:

- Una interfaz debe ser **cohesiva**: métodos directamente relacionados entre sí.
- Si una interfaz **crece demasiado**, conviene **dividirla por funcionalidad**.
- Las clases solo deben implementar **lo que realmente necesitan**.
- Clientes desacoplados → **más mantenibles, testables y reutilizables**.

---

✅ **Autor**: Cristian Laurentiu Sindila

🗓 **Fecha**: Abril 2025
