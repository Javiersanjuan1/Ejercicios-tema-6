import java.util.Scanner;
import java.util.TreeSet;

public class GestorCadenasPrincipal {
    public static void main(String[] args) {
        TreeSet<String> arbol = new TreeSet<>();
        Scanner scanner = new Scanner(System.in);

        int opcion;
        do {
            System.out.println("\nMenú:");
            System.out.println("1. Agregar cadena");
            System.out.println("2. Eliminar cadena");
            System.out.println("3. Mostrar lista");
            System.out.println("4. Salir");
            System.out.print("Seleccione una opción: ");
            opcion = scanner.nextInt();
            scanner.nextLine(); // Consumir la nueva línea después de leer el entero

            switch (opcion) {
                case 1:
                    System.out.print("Introduzca la cadena a agregar: ");
                    String cadena = scanner.nextLine();
                    arbol.add(cadena);
                    mostrarLista(arbol);
                    break;
                case 2:
                    System.out.print("Introduzca la cadena que desea eliminar: ");
                    String cadenaEliminar = scanner.nextLine();
                    eliminarCadena(arbol, cadenaEliminar);
                    mostrarLista(arbol);
                    break;
                case 3:
                    mostrarLista(arbol);
                    break;
                case 4:
                    System.out.println("Saliendo del programa...");
                    break;
                default:
                    System.out.println("Opción no válida. Por favor, seleccione una opción válida.");
            }
        } while (opcion != 4);

        scanner.close();
    }

    public static void mostrarLista(TreeSet<String> arbol) {
        System.out.println("Contenido de la lista:");
        if (arbol.isEmpty()) {
            System.out.println("La lista está vacía.");
        } else {
            for (String cadena : arbol) {
                System.out.println(cadena);
            }
        }
    }

    public static void eliminarCadena(TreeSet<String> arbol, String cadenaEliminar) {
        if (arbol.contains(cadenaEliminar)) {
            arbol.remove(cadenaEliminar);
            System.out.println("Cadena eliminada: " + cadenaEliminar);
        } else {
            System.out.println("La cadena especificada no existe en la lista.");
        }
    }
}
