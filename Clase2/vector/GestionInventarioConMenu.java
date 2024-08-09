package Clase2.vector;

import java.util.Scanner;
import java.util.Vector;

public class GestionInventarioConMenu {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Vector<String> inventario = new Vector<>();
        int opcion;

        do {
            // Mostrar el menú
            System.out.println("Menú de Gestión de Inventario:");
            System.out.println("1. Agregar productos");
            System.out.println("2. Mostrar todos los productos");
            System.out.println("3. Eliminar un producto");
            System.out.println("4. Verificar si un producto está en el inventario");
            System.out.println("5. Salir");
            System.out.print("Selecciona una opción: ");
            opcion = scanner.nextInt();
            scanner.nextLine(); // Consumir el salto de línea

            switch (opcion) {
                case 1:
                    // Agregar productos
                    System.out.print("¿Cuántos productos deseas agregar? ");
                    int cantidad = scanner.nextInt();
                    scanner.nextLine(); // Consumir el salto de línea
                    for (int i = 0; i < cantidad; i++) {
                        System.out.print("Ingresa el nombre del producto #" + (i + 1) + ": ");
                        String producto = scanner.nextLine();
                        inventario.add(producto);
                    }
                    System.out.println("Productos agregados.");
                    break;

                case 2:
                    // Mostrar todos los productos
                    System.out.println("Inventario actual: " + inventario);
                    break;

                case 3:
                    // Eliminar un producto específico
                    System.out.print("Ingresa el nombre del producto que deseas eliminar: ");
                    String productoEliminar = scanner.nextLine();
                    if (inventario.remove(productoEliminar)) {
                        System.out.println("Producto eliminado del inventario.");
                    } else {
                        System.out.println("Producto no encontrado en el inventario.");
                    }
                    break;

                case 4:
                    // Verificar si un producto está en el inventario
                    System.out.print("Ingresa el nombre del producto para verificar si está en el inventario: ");
                    String productoVerificar = scanner.nextLine();
                    if (inventario.contains(productoVerificar)) {
                        System.out.println("El producto está en el inventario.");
                    } else {
                        System.out.println("El producto no está en el inventario.");
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
