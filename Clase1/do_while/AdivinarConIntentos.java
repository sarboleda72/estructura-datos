package do_while;

import java.util.Scanner;

public class AdivinarConIntentos {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numeroAleatorio = (int) (Math.random() * 50) + 1;
        int intento;
        int intentos = 0;
        final int MAX_INTENTOS = 5;

        do {
            System.out.print("Adivina el número (1-50): ");
            intento = scanner.nextInt();
            intentos++;

            if (intento < numeroAleatorio) {
                System.out.println("El número es mayor.");
            } else if (intento > numeroAleatorio) {
                System.out.println("El número es menor.");
            } else {
                System.out.println("¡Correcto! El número era: " + numeroAleatorio);
                break;
            }

        } while (intentos < MAX_INTENTOS);

        if (intento != numeroAleatorio) {
            System.out.println("Lo siento, has agotado tus intentos. El número era: " + numeroAleatorio);
        }
        
        scanner.close();
    }
}
