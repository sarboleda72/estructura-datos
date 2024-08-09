package Clase2.vector;

import java.util.Scanner;
import java.util.Vector;

public class RegistroVentasConMenu {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Vector<Double> ventas = new Vector<>();
        int opcion;

        do {
            // Mostrar el menú
            System.out.println("Menú de Registro de Ventas:");
            System.out.println("1. Agregar montos de ventas");
            System.out.println("2. Mostrar total y promedio de ventas");
            System.out.println("3. Eliminar un monto de venta");
            System.out.println("4. Mostrar monto máximo y mínimo de ventas");
            System.out.println("5. Salir");
            System.out.print("Selecciona una opción: ");
            opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    // Agregar montos de ventas
                    System.out.print("¿Cuántos montos de ventas deseas agregar? ");
                    int cantidad = scanner.nextInt();
                    for (int i = 0; i < cantidad; i++) {
                        System.out.print("Ingresa el monto de venta #" + (i + 1) + ": ");
                        double monto = scanner.nextDouble();
                        ventas.add(monto);
                    }
                    System.out.println("Montos de ventas agregados.");
                    break;

                case 2:
                    // Mostrar total y promedio de ventas
                    double total = 0;
                    for (double venta : ventas) {
                        total += venta;
                    }
                    double promedio = ventas.isEmpty() ? 0 : total / ventas.size();
                    System.out.println("Total de ventas: " + total);
                    System.out.println("Promedio de ventas diarias: " + promedio);
                    break;

                case 3:
                    // Eliminar un monto de venta específico
                    System.out.print("Ingresa el monto de venta que deseas eliminar: ");
                    double montoEliminar = scanner.nextDouble();
                    if (ventas.removeElement(Double.valueOf(montoEliminar))) {
                        System.out.println("Monto de venta eliminado.");
                    } else {
                        System.out.println("Monto de venta no encontrado.");
                    }
                    break;

                case 4:
                    // Mostrar monto máximo y mínimo de ventas
                    if (!ventas.isEmpty()) {
                        double max = Double.MIN_VALUE;
                        double min = Double.MAX_VALUE;
                        for (double venta : ventas) {
                            if (venta > max) {
                                max = venta;
                            }
                            if (venta < min) {
                                min = venta;
                            }
                        }
                        System.out.println("Monto máximo de ventas: " + max);
                        System.out.println("Monto mínimo de ventas: " + min);
                    } else {
                        System.out.println("No hay ventas para mostrar el monto máximo y mínimo.");
                    }
                    break;

                case 5:
                    // Salir
                    System.out.println("Saliendo del programa.");
                    break;

                default:
                    System.out.println("Opción no válida. Intenta nuevamente.");
                    break;
            }

        } while (opcion != 5);

        scanner.close();
    }
}
