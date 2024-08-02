import java.util.Scanner;

public class AdivinaElNumero {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numeroAleatorio = (int) (Math.random() * 100) + 1;
        int intento;

        System.out.println("Adivina el número entre 1 y 100.");

        while (true) {
            System.out.print("Introduce tu intento: ");
            intento = scanner.nextInt();

            if (intento < numeroAleatorio) {
                System.out.println("El número es mayor.");
            } else if (intento > numeroAleatorio) {
                System.out.println("El número es menor.");
            } else {
                System.out.println("¡Correcto! El número era: " + numeroAleatorio);
                break;
            }
        }
        
        scanner.close();
    }
}
