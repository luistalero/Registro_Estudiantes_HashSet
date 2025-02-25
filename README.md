# Taller Java
# 🚀 Ejercicio #4 Registro de estudiantes con HashSet

## 📌 Propósito
Este programa en Java permite gestionar un registro de estudiantes utilizando la estructura de datos `HashSet<String>`. Su función principal es almacenar nombres de estudiantes sin permitir duplicados y ofrecer las siguientes funcionalidades:

1. Registrar una cantidad determinada de estudiantes.
2. Mostrar el listado completo de estudiantes registrados.
3. Buscar un estudiante en el registro para verificar si está presente.

El proyecto implementa conceptos fundamentales de Java, como colecciones (`HashSet`), entrada/salida por consola y validación de datos.

# 🚀 Instalación y Configuración

## Requisitos Previos
- Java Development Kit (JDK) 17 o superior
- Git instalado en tu sistema

## Clonar Repositorio
```bash
https://github.com/luistalero/Registro_Estudiantes.git
```

# 🛠️ Uso

## 1. Registro de Estudiantes:
- El programa solicitará al usuario la cantidad de estudiantes que desea registrar.
- Se ingresará el nombre de cada estudiante y se almacenará en un `HashSet<String>`.

## 2. Mostrar Listado de Estudiantes:
- Al seleccionar la opción Uno (1) del menú, se mostrará el listado de todos los estudiantes registrados.

## 3. Buscar un Estudiante:
- Al seleccionar la opción Dos (2) del menú, se solicitará el nombre del estudiante a buscar.
- Se verificará si el nombre ingresado está presente en el `HashSet`.
- El usuario podrá realizar búsquedas adicionales si así lo desea.

## 4. Salir:
- Al seleccionar la opción Tres (3) del menú, el programa finalizará con un mensaje de despedida.

# 👷Ejemplo de Ejecución

```bash
Ingrese la cantidad de estudiantes: '3'
Ingrese el nombre del estudiante 1: 'Juan'
Ingrese el nombre del estudiante 2: 'María'
Ingrese el nombre del estudiante 3: 'Carlos'
```
```bash
===================================
====     ¿QUE DESEA HACER?     ====
===================================
1. Ver Listado de estudiantes.
2. Buscar estudiante registrado.
3. Salir
Seleccione una opción: '1'

Lista de estudiantes registrados:
- Juan
- María
- Carlos
```
```bash
===================================
====     ¿QUE DESEA HACER?     ====
===================================
1. Ver Listado de estudiantes.
2. Buscar estudiante registrado.
3. Salir
Seleccione una opción: '2'
Ingrese el nombre del estudiante para verificar si esta registrado: 'Juan'
El estudiante Juan Si esta registrado.

¿Desea Buscar otro estudiante? (s/n): 's'
Ingrese el nombre del estudiante para verificar si esta registrado: 'Ana'
El Estudiante "Ana" No se encuentra registrado.
```
```bash
===================================
====     ¿QUE DESEA HACER?     ====
===================================
1. Ver Listado de estudiantes.
2. Buscar estudiante registrado.
3. Salir
Seleccione una opción: '3'
¡¡Gracias por usar este Programa!!
```

# 📋 Características
- Registro de estudiantes sin duplicados utilizando `HashSet<String>`.
- Visualización del listado completo de estudiantes.
- Búsqueda eficiente de estudiantes en el registro.

# 🚨 Estado del Ejercicio
- Culminado.

# 👤 Autor
- Luis Alberto Talero Martinez