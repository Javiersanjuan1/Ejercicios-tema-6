import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ListaCadenas {
    public static void main(String[] args) {
        List<String> lista = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        int opcion;
        do {
            System.out.println("\nMenú:");
            System.out.println("1. Agregar cadena");
            System.out.println("2. Eliminar última cadena");
            System.out.println("3. Salir");
            System.out.print("Seleccione una opción: ");
            opcion = scanner.nextInt();
            scanner.nextLine(); // Consumir la nueva línea después de leer el entero

            switch (opcion) {
                case 1:
                    System.out.print("Introduzca una cadena: ");
                    String cadena = scanner.nextLine();
                    lista.add(cadena);
                    mostrarLista(lista);
                    break;
                case 2:
                    if (!lista.isEmpty()) {
                        lista.remove(lista.size() - 1);
                        mostrarLista(lista);
                    } else {
                        System.out.println("La lista está vacía, no hay elementos para eliminar.");
                    }
                    break;
                case 3:
                    System.out.println("Saliendo del programa...");
                    break;
                default:
                    System.out.println("Opción no válida. Por favor, seleccione una opción válida.");
            }
        } while (opcion != 3);

        scanner.close();
    }

    public static void mostrarLista(List<String> lista) {
        System.out.println("Contenido de la lista:");
        if (lista.isEmpty()) {
            System.out.println("La lista está vacía.");
        } else {
            for (String cadena : lista) {
                System.out.println(cadena);
            }
        }
    }
}
