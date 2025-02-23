package com.registro_estudiantes_hashset;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("\nIngrese la cantidad de estudiantes: ");
        int cantidadEstudiantes = sc.nextInt();
        sc.nextLine();

        HashSet<String> estudiantes = new HashSet<>();
        for (int i = 0; i < cantidadEstudiantes; i++) {
            System.out.print("Ingrese el nombre del estudiante " + (i + 1) + ": ");
            String nombre = sc.nextLine();
            estudiantes.add(nombre);
        }

        int opcion;
        do {
            String menu = """
            ===================================
            ===     ¿QUE DESEA HACER?       === 
            ===================================
            1. Ver Listado de estudiantes.
            2. Buscar estudiante registrado.
            3. Salir
            """;
            System.out.println(menu);
            System.out.print("Seleccione una opción: ");

            while (!sc.hasNextInt()) {
                System.err.println("Error: Debe Ingresar un numero.");
                sc.next();
                System.out.print("Seleccione una opción: ");

            }
            opcion = sc.nextInt();
            sc.nextLine();

            switch (opcion) {
                case 1:
                    System.out.println("\nLista de estudiantes registrados: ");
                    for (String estudiante : estudiantes) {
                        System.out.println(estudiante);
                    }
                    break;
            
                case 2:
                    boolean buscarOtro;
                    do {
                        System.out.println("\nIngrese el nombre del estudiante para verificar si esta registrado: ");
                        String busqueda = sc.nextLine();
                        if (estudiantes.contains(busqueda)) {
                            System.out.println("El estudiante " + busqueda + " Si esta registrado.");
                        } else {
                            System.out.println("El Estudiante \"" + busqueda + "\" No se encuentra registrado");
                        }
                    
                        System.out.print("¿Desea Buscar otro estudiante? (s/n): ");
                        String respuesta = sc.nextLine();
                        buscarOtro = respuesta.equalsIgnoreCase("s");
                    
                    } while (buscarOtro);
                    break;

                case 3:
                    System.out.println("¡¡Gracias por usar este Programa!!");
                    break;

                default:
                    System.err.println("Está opción no es válida...");
                    break;
            }

        } while (opcion != 3);

        sc.close();
    }
}