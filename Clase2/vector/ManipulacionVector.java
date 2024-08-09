package Clase2.vector;

import java.util.Scanner;

public class ManipulacionVector {
    public static void main(String[] args) {
        int[] numeros = new int[5];
        Scanner scanner = new Scanner(System.in);
        int opcion;

        do {
            System.out.println("\nMenú:");
            System.out.println("1. Agregar un número");
            System.out.println("2. Eliminar un número");
            System.out.println("3. Buscar un número");
            System.out.println("4. Mostrar vector");
            System.out.println("5. Salir");
            System.out.print("Elige una opción: ");
            opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    System.out.print("Ingresa el número a agregar: ");
                    int numAgregar = scanner.nextInt();
                    if (!agregarElemento(numeros, numAgregar)) {
                        System.out.println("El vector está lleno.");
                    }
                    break;
                case 2:
                    System.out.print("Ingresa el número a eliminar: ");
                    int numEliminar = scanner.nextInt();
                    eliminarElemento(numeros, numEliminar);
                    break;
                case 3:
                    System.out.print("Ingresa el número a buscar: ");
                    int numBuscar = scanner.nextInt();
                    int indice = buscarElemento(numeros, numBuscar);
                    if (indice != -1) {
                        System.out.println("Número encontrado en la posición: " + indice);
                    } else {
                        System.out.println("Número no encontrado.");
                    }
                    break;
                case 4:
                    mostrarVector(numeros);
                    break;
                case 5:
                    System.out.println("Saliendo...");
                    break;
                default:
                    System.out.println("Opción no válida.");
            }
        } while (opcion != 5);

        scanner.close();
    }

    public static boolean agregarElemento(int[] vector, int elemento) {
        for (int i = 0; i < vector.length; i++) {
            if (vector[i] == 0) {
                vector[i] = elemento;
                return true;
            }
        }
        return false;
    }

    public static void eliminarElemento(int[] vector, int elemento) {
        int index = buscarElemento(vector, elemento);
        if (index != -1) {
            vector[index] = 0;
        } else {
            System.out.println("Elemento no encontrado.");
        }
    }

    public static int buscarElemento(int[] vector, int elemento) {
        for (int i = 0; i < vector.length; i++) {
            if (vector[i] == elemento) {
                return i;
            }
        }
        return -1;
    }

    public static void mostrarVector(int[] vector) {
        System.out.print("Contenido del vector: ");
        for (int numero : vector) {
            System.out.print(numero + " ");
        }
        System.out.println();
    }
}
