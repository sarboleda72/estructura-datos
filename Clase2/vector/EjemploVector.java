package Clase2.vector;

import java.util.Vector;

public class EjemploVector {
    public static void main(String[] args) {
        // Crear un vector de tipo String
        Vector<String> nombres = new Vector<>();

        nombres.add("Juan");
        nombres.add("Ana");
        nombres.add("Carlos");

        System.out.println("Tamaño del vector: " + nombres.size());

        System.out.println("Elemento en la posición 1: " + nombres.get(1));

        nombres.remove(0);

        System.out.println("El vector contiene 'Carlos': " + nombres.contains("Carlos"));

        System.out.println("Elementos del vector: " + nombres);
    }
}
