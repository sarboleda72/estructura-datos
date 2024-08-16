package Clase3.matriz_estatica;

public class app {

    public static void main(String[] args) {
        int[][] matriz = new int[3][3];
        int[][] matriz = {
                { 1, 2, 3 },
                { 4, 5, 6 },
                { 7, 8, 9 }
        };

        int valor = matriz[1][2]; // Accede al valor en la segunda fila, tercera columna (valor 6).

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }

        int suma = 0;
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                suma += matriz[i][j];
            }
        }
        System.out.println("La suma de todos los elementos es: " + suma);

    }

}
