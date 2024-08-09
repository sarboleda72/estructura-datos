import java.util.Scanner;

public class ContadorDeDigitos {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Introduce un número entero positivo: ");
        int numero = scanner.nextInt();

        int contador = 0;
        int num = numero;

        while (num > 0) {
            num /= 10;
            contador++;
        }

        System.out.println("El número " + numero + " tiene " + contador + " dígitos.");
        
        scanner.close();
    }
}
