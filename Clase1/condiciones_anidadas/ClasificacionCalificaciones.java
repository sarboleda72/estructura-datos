package condiciones_anidadas;
import java.util.Scanner;

public class ClasificacionCalificaciones {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Introduce una calificación (0-100): ");
        int calificacion = scanner.nextInt();

        if (calificacion >= 0 && calificacion <= 100) {
            if (calificacion >= 90) {
                System.out.println("Calificación: A");
            } else if (calificacion >= 80) {
                System.out.println("Calificación: B");
            } else if (calificacion >= 70) {
                System.out.println("Calificación: C");
            } else if (calificacion >= 60) {
                System.out.println("Calificación: D");
            } else {
                System.out.println("Calificación: F");
            }
        } else {
            System.out.println("Calificación inválida. Debe estar entre 0 y 100.");
        }
        
        scanner.close();
    }
}
