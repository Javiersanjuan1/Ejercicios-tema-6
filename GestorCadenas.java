import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class GestorCadenas {
    public static void main(String[] args) {
        List<String> lista = new LinkedList<>();
        Scanner scanner = new Scanner(System.in);

        int opcion;
        do {
            System.out.println("\nMenú:");
            System.out.println("1. Agregar cadena en posición específica");
            System.out.println("2. Eliminar cadena");
            System.out.println("3. Mostrar lista");
            System.out.println("4. Salir");
            System.out.print("Seleccione una opción: ");
            opcion = scanner.nextInt();
            scanner.nextLine(); // Consumir la nueva línea después de leer el entero

            switch (opcion) {
                case 1:
                    System.out.print("Introduzca la posición donde desea agregar la cadena: ");
                    int posicion = scanner.nextInt();
                    scanner.nextLine();
                    System.out.print("Introduzca la cadena a agregar: ");
                    String cadena = scanner.nextLine();
                    agregarEnPosicion(lista, posicion, cadena);
                    break;
                case 2:
                    System.out.print("Introduzca la posición de la cadena que desea eliminar: ");
                    int posicionEliminar = scanner.nextInt();
                    eliminarEnPosicion(lista, posicionEliminar);
                    break;
                case 3:
                    mostrarLista(lista);
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

    public static void agregarEnPosicion(List<String> lista, int posicion, String cadena) {
        if (posicion >= 0 && posicion <= lista.size()) {
            lista.add(posicion, cadena);
            System.out.println("Cadena agregada en la posición " + posicion + ".");
        } else {
            System.out.println("Posición no válida. La lista actual tiene " + lista.size() + " elementos.");
        }
    }

    public static void eliminarEnPosicion(List<String> lista, int posicion) {
        if (posicion >= 0 && posicion < lista.size()) {
            String eliminada = lista.remove(posicion);
            System.out.println("Cadena eliminada en la posición " + posicion + ": " + eliminada);
        } else {
            System.out.println("Posición no válida. La lista actual tiene " + lista.size() + " elementos.");
        }
    }

    public static void mostrarLista(List<String> lista) {
        System.out.println("Contenido de la lista:");
        if (lista.isEmpty()) {
            System.out.println("La lista está vacía.");
        } else {
            for (int i = 0; i < lista.size(); i++) {
                System.out.println(i + ": " + lista.get(i));
            }
        }
    }
}
