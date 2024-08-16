package Clase3.ejercicio;

import java.util.Scanner;

public class MatrizCalificaciones {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Pedir el número de estudiantes y asignaturas
        System.out.print("Ingrese el número de estudiantes: ");
        int n = scanner.nextInt();
        System.out.print("Ingrese el número de asignaturas: ");
        int m = scanner.nextInt();

        // Crear la matriz de calificaciones
        int[][] calificaciones = new int[n][m];

        // Llenar la matriz con calificaciones ingresadas por el usuario
        for (int i = 0; i < n; i++) {
            System.out.println("Ingrese las calificaciones para el estudiante " + (i + 1) + ":");
            for (int j = 0; j < m; j++) {
                System.out.print("Asignatura " + (j + 1) + ": ");
                calificaciones[i][j] = scanner.nextInt();
            }
        }

        // Calcular y mostrar la suma de las calificaciones de cada estudiante
        for (int i = 0; i < n; i++) {
            int suma = 0;
            for (int j = 0; j < m; j++) {
                suma += calificaciones[i][j];
            }
            System.out.println("La suma de las calificaciones del estudiante " + (i + 1) + " es: " + suma);
        }

        scanner.close();
    }
}
