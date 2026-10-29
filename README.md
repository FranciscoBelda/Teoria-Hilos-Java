# Teoría y Práctica de Hilos en Java 🧵

Este repositorio contiene ejemplos prácticos y conceptos fundamentales sobre **programación concurrente y multihilo en Java**.

## 📚 Contenidos del Repositorio

El proyecto aborda tres pilares fundamentales de la gestión de hilos:

1. **Creación de Hilos con `extends Thread`**: 
   - Aprendizaje del ciclo de vida básico de un hilo.
   - Herencia de la clase `Thread` y sobreescritura del método `run()`.
   - Inicialización y ejecución asíncrona mediante el método `start()`.

2. **Comunicación de Información mediante Constructores**:
   - Paso de parámetros e información desde el hilo principal (*Main thread*) hacia el hilo secundario.
   - Inicialización del estado interno del hilo antes de ejecutar la lógica de procesamiento.

3. **Control de Condiciones de Carrera mediante Semáforos (`Semaphore`)**:
   - Identificación de problemas de exclusión mutua y condiciones de carrera (*Race Conditions*) al acceder a recursos compartidos.
   - Uso de la clase `java.util.concurrent.Semaphore` para la gestión de permisos (`acquire()` / `release()`) y sincronización entre hilos.

---

## 🛠️ Requisitos Previos

* **Java Development Kit (JDK)**: Versión 8 o superior.
* IDE recomendado: IntelliJ IDEA, Eclipse, NetBeans o VS Code.

---

## 🚀 Cómo Ejecutar los Ejemplos

1. Clona este repositorio en tu equipo local:
   ```bash
   git clone https://github.com/FranciscoBelda/Teoria-Hilos-Java.git
   ```
2. Abre el proyecto en tu IDE preferido.
3. Compila y ejecuta la clase principal del ejemplo que desees probar.

---

## 👤 Autor

Creado por **[Francisco Belda](https://www.youtube.com/@franciscobelda)**.
 
👉 **[Canal de YouTube de Francisco Belda](https://www.youtube.com/@franciscobelda)**
