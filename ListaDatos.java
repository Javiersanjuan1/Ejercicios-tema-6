import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Random;

public class ListaDatos {
    public static void main(String[] args) {
        // Crear una lista usando ArrayList
        List<Double> arrayList = new ArrayList<>();
        llenarLista(arrayList);
        System.out.println("Valores en ArrayList:");
        mostrarLista(arrayList);

        // Crear una lista usando LinkedList
        List<Double> linkedList = new LinkedList<>();
        llenarLista(linkedList);
        System.out.println("\nValores en LinkedList:");
        mostrarLista(linkedList);
    }

    // Método para llenar la lista con valores aleatorios
    public static void llenarLista(List<Double> lista) {
        Random random = new Random();
        for (int i = 0; i < 100; i++) {
            double valor = random.nextDouble() * 100; // Genera un valor aleatorio entre 0 y 100
            lista.add(valor);
        }
    }

    // Método para mostrar los valores de la lista
    public static void mostrarLista(List<Double> lista) {
        for (double valor : lista) {
            System.out.println(valor);
        }
    }
}
