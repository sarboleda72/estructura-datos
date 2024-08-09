public class app {
    public static void main(String[] args) {
        String nombre = "Juan";
        String apellido = "Perez";
        String nombreCompleto = nombre + " " + apellido;
        System.out.println(nombreCompleto);
        System.out.println(nombreCompleto.length());
        System.out.println(nombreCompleto.toUpperCase());
        System.out.println(nombreCompleto.toLowerCase());
        System.out.println(nombreCompleto.charAt(0));
        System.out.println(nombreCompleto.indexOf("Perez"));
        System.out.println(nombreCompleto.substring(0, 4));
        System.out.println(nombreCompleto.substring(5));
        System.out.println(nombreCompleto.replace("Juan", "Pedro"));
        System.out.println(nombreCompleto.contains("Juan"));
        System.out.println(nombreCompleto.equals("Juan Perez"));
        System.out.println(nombreCompleto.equals("juan perez"));
        System.out.println(nombreCompleto.equalsIgnoreCase("juan perez"));
        System.out.println(nombreCompleto.compareTo("Juan Perez"));
        System.out.println(nombreCompleto.compareTo("juan perez"));
        System.out.println(nombreCompleto.compareToIgnoreCase("juan perez"));
        System.out.println(nombreCompleto.startsWith("Juan"));
        System.out.println(nombreCompleto.endsWith("Perez"));
        System.out.println(nombreCompleto.isEmpty());
        System.out.println(nombreCompleto.concat(" es mi nombre"));
        System.out.println(nombreCompleto.trim());
        System.out.println(nombreCompleto.toCharArray());
        System.out.println(nombreCompleto.toString());
    }
}