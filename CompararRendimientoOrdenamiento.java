import java.util.*;
import java.util.concurrent.ThreadLocalRandom;

public class CompararRendimientoOrdenamiento {
    public static void main(String[] args) {
        int[] enterosAleatorios = generarEnterosAleatorios(1000000);

        // Ordenar utilizando TreeSet
        long inicioTreeSet = System.currentTimeMillis();
        TreeSet<Integer> treeSet = new TreeSet<>();
        for (int num : enterosAleatorios) {
            treeSet.add(num);
        }
        long finTreeSet = System.currentTimeMillis();
        long tiempoTreeSet = finTreeSet - inicioTreeSet;
        System.out.println("Tiempo utilizando TreeSet: " + tiempoTreeSet + " ms");

        // Ordenar utilizando lista y Collections.sort()
        long inicioLista = System.currentTimeMillis();
        List<Integer> lista = new ArrayList<>();
        for (int num : enterosAleatorios) {
            lista.add(num);
        }
        Collections.sort(lista);
        long finLista = System.currentTimeMillis();
        long tiempoLista = finLista - inicioLista;
        System.out.println("Tiempo utilizando lista y Collections.sort(): " + tiempoLista + " ms");

        // Ordenar utilizando array y Arrays.sort()
        long inicioArray = System.currentTimeMillis();
        Arrays.sort(enterosAleatorios);
        long finArray = System.currentTimeMillis();
        long tiempoArray = finArray - inicioArray;
        System.out.println("Tiempo utilizando array y Arrays.sort(): " + tiempoArray + " ms");
    }

    // Método para generar un array de enteros aleatorios
    private static int[] generarEnterosAleatorios(int cantidad) {
        int[] enteros = new int[cantidad];
        for (int i = 0; i < cantidad; i++) {
            enteros[i] = ThreadLocalRandom.current().nextInt();
        }
        return enteros;
    }
}
