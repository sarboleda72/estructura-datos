import java.util.Scanner;

public class SumaNumerosPositivos {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int suma = 0;
        int numero;

        System.out.println("Introduce números positivos para sumarlos. Introduce un número negativo para terminar.");

        while (true) {
            System.out.print("Introduce un número: ");
            numero = scanner.nextInt();

            if (numero < 0) {
                break;
            }

            suma += numero;
        }

        System.out.println("La suma de los números positivos es: " + suma);
        
        scanner.close();
    }
}

