package Clase2.vector;

import java.util.Arrays;

public class fijo {
    public static void main(String[] args) {
        int[] numeros = new int[5];
        numeros[0] = 1;
        numeros[1] = 5;
        numeros[2] = 4;
        numeros[3] = 3;
        numeros[4] = 2;
        System.out.println(numeros[0]);
        System.out.println(numeros.length);
        System.out.println(Arrays.toString(numeros));
        Arrays.sort(numeros);
        System.out.println(Arrays.toString(numeros));

        for (int numero : numeros) {
            System.out.println(numero);
        }

        for (int i = 0; i < numeros.length; i++) {
            System.out.println(numeros[i]);
        }
    }
    
}
