package condiciones_simples;
import java.util.Scanner;

public class DiaDeLaSemana {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Introduce un número del 1 al 7: ");
        int dia = scanner.nextInt();

        if (dia >= 1 && dia <= 7) {
            if (dia == 1) {
                System.out.println("Lunes");
            } else if (dia == 2) {
                System.out.println("Martes");
            } else if (dia == 3) {
                System.out.println("Miércoles");
            } else if (dia == 4) {
                System.out.println("Jueves");
            } else if (dia == 5) {
                System.out.println("Viernes");
            } else if (dia == 6) {
                System.out.println("Sábado");
            } else {
                System.out.println("Domingo");
            }
        } else {
            System.out.println("Número no válido. Debe estar entre 1 y 7.");
        }
        
        scanner.close();
    }
}
