package Clase2.vector;

import java.util.Scanner;

public class OrdenarVector {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingresa el tamaño del vector: ");
        int tamano = scanner.nextInt();

        int[] numeros = new int[tamano];

        System.out.println("Ingresa los elementos del vector:");
        for (int i = 0; i < tamano; i++) {
            System.out.print("Elemento " + (i + 1) + ": ");
            numeros[i] = scanner.nextInt();
        }

        System.out.println("Vector original:");
        imprimirVector(numeros);

        ordenarBurbuja(numeros);

        System.out.println("Vector ordenado en orden ascendente:");
        imprimirVector(numeros);
        
        scanner.close();
    }

    public static void ordenarBurbuja(int[] vector) {
        int n = vector.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (vector[j] > vector[j + 1]) {
                    // Intercambiar elementos
                    int temp = vector[j];
                    vector[j] = vector[j + 1];
                    vector[j + 1] = temp;
                }
            }
        }
    }

    public static void imprimirVector(int[] vector) {
        for (int numero : vector) {
            System.out.print(numero + " ");
        }
        System.out.println();
    }
}
