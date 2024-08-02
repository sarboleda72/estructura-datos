package condiciones_compuestas_operadores_logicos;
import java.util.Scanner;

public class NumeroEnRango {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Introduce un número entero: ");
        int numero = scanner.nextInt();

        if (numero >= 10 && numero <= 20) {
            System.out.println("El número está dentro del rango de 10 a 20.");
        } else {
            System.out.println("El número no está dentro del rango de 10 a 20.");
        }
        
        scanner.close();
    }
}
